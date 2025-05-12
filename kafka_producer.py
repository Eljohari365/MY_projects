
from kafka import KafkaProducer
import time
import csv


producer = KafkaProducer(bootstrap_servers='localhost:9092', value_serializer=lambda v: v.encode('utf-8'))


group_file = "Midterm_53_group.csv"

try:
    
    with open(group_file, 'r') as file:
        reader = csv.DictReader(file)
        
        for row in reader:
                    
            source_ip = row['Source'].strip()
            destination_ip = row['Destination'].strip()


            print(f"Publishing Source IP: {source_ip}")
            producer.send('ip-logs-0', value=source_ip)
            time.sleep(0.5)

            print(f"Publishing Destination IP: {destination_ip}")
            producer.send('ip-logs-0', value=destination_ip)
            time.sleep(0.5)

except Exception as e:
    print(f"Error: {e}")
finally:
    
    producer.flush()
    producer.close()
