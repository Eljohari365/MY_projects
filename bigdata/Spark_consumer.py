from pyspark.sql import SparkSession
from pyspark.sql.functions import col

def Spark_consumer_sql():
    spark = SparkSession.builder \
        .appName("Ammar_Elonmusk") \
        .config("spark.jars", "C:/Users/USER/Downloads/mysql-connector-j-9.1.0.tar.gz") \
        .getOrCreate()
        
    df = spark.readStream \
        .format("kafka") \
        .option("kafka.bootstrap.servers", "localhost:9092") \
        .option("subscribe", "ip-logs-0") \
        .load()

    df = df.selectExpr("CAST(value AS STRING) as ip_address")
    ip_counts = df.groupBy("ip_address").count().withColumnRenamed("count", "request_count")

    ip_counts.writeStream \
        .foreachBatch(lambda batch_df, batch_id: 
            batch_df.write.format("jdbc")
            .option("url", "jdbc:mysql://localhost:3306/test_db")  
            .option("dbtable", "ip_request_counts")  
            .option("user", "root") 
            .option("123", "123")  
            .mode("append")  
            .save()
        ).start().awaitTermination()