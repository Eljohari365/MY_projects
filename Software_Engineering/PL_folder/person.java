public class person {
    String userName;
    String password;
    int age;
    int id;
    public person(){
        userName ="";
        password ="";
        age=0;
    };
    public person(String userName, String password, int age,int id) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.id=id;
    }
    public person(String s){
        String[] parts = s.split("\t");
        if(parts.length>=4){
            this.userName = parts[0];
            this.password = parts[1];
            this.age = Integer.parseInt(parts[2]);
            this.id=Integer.parseInt(parts[3]);
        }
        else throw new IllegalArgumentException("too few parts");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean checkLogin(String userName,String password){
        return (this.userName.equals(userName)&&this.password.equals(password));
    }
    @Override
    public String toString() {
        return userName+"\t"+password+"\t"+age+"\t"+id;
    }
}
