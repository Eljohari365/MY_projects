public class employeeInfo extends person {

    public employeeInfo(String userName, String password, int age,int id) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.id=id;
    }
    public employeeInfo(String s){
        String[] parts = s.split("\t");
        if(parts.length>=4){
            this.userName = parts[0];
            this.password = parts[1];
            this.age = Integer.parseInt(parts[2]);
            this.id=Integer.parseInt(parts[3]);
        }
        else throw new IllegalArgumentException("too few parts");
    }
}