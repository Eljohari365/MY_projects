public class personMod extends person  {
    person Person;
    private String oldUserName,newUserName,newpassword;
    public personMod(person Person) {
        this.Person = Person;
        System.out.println("choose option\n1. update information\n2. exit");
        switch (Main.input.nextInt()){
            case 1:
                updateInformation();

            case 2:
        }
    }
    void updateInformation() {
        System.out.println("choose option\n1. update username\n2. update password");
        switch (Main.input.nextInt()) {
            case 1:
                System.out.println("enter your old username ");
                oldUserName = Main.input.nextLine();
                if (Person.userName.equals(oldUserName)) {
                    System.out.println("the username is found, please enter your new username");
                    newUserName = Main.input.nextLine();
                    Person.userName = newUserName;
                    System.out.println("the update end successfully");
                } else System.out.println("sorry the username not found");
                break;
            case 2:
                System.out.println("enter your username");
                if (Person.userName.equals(Main.input.nextLine())) {
                    System.out.println("the username is found, please enter your new password");
                    newpassword = Main.input.nextLine();
                    Person.password = newpassword;
                    System.out.println("the update end successfully");}
                else System.out.println("sorry the username not found");
                break;


        }


    }
}












        //        switch (Main.input.nextInt()){
//            case 1:
//                System.out.println("enter your old username ");
//                if(Person.userName.equals(oldUserName)){
//                    System.out.println("the old username is found, please enter the new user name");
//                    Person.userName=newUserName;
//                }
//
//
//            case 2:
//                System.out.println("enter your old password ");
//
//
//            case 3:
//                System.out.println("enter your old age ");
//        }




