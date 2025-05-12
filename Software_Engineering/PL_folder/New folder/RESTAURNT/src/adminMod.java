public class adminMod extends adminInfo{
    adminInfo admin;
    private String oldUserName,newUserName,newpassword;
    adminMod(adminInfo admin) {
        this.admin = admin;
    }
    void updateProfile() {
        System.out.println("choose option\n1. update username\n2. update password");
        switch (Main.input.nextInt()) {
            case 1:
                System.out.println("please enter your old username");
                oldUserName = Main.input.next();
                if (admin.userName.equals(oldUserName)) {
                    System.out.println("the old username is exist, please enter your new username");
                    newUserName = Main.input.nextLine();
                    admin.userName = newUserName;
                } else System.out.println("this username dose not exist");
                break;
            case 2:
                System.out.println("please enter your old username");
                oldUserName = Main.input.next();
                if (admin.userName.equals(oldUserName)) {
                    System.out.println("the old username is exist, please enter your new password");
                    admin.password = newpassword;
                    break;
                }
            default:
                try {
                    System.out.println("your choice are not in our options please try again ");

                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
        }
    }
    void manageEmployee(){
        System.out.println("as an admin please choose from these options\n 1. add employee\n 2. delete employee\n 3. update employee\n 4. list employee\n 5. search employee");
        switch (Main.input.nextInt()){
            case 1:


        }

    }
    public void startModule(){}
}
