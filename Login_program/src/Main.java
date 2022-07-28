import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, resetPassword,newPassword;

        Scanner inp=new Scanner(System.in);

        System.out.print("User Name : ");
        userName = inp.nextLine();

        System.out.print("Password :");
        password=inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Succesful Login !");
        }else{
            System.out.println("Invalid login or password. Please try again " +
                    "choose\"yes\" or reset password choose \"no\" !");
            resetPassword=inp.nextLine();

            if(resetPassword.equals("no")){
                System.out.println("Logout");
            } else if (resetPassword.equals("yes")) {
                System.out.println("New Password :");
                newPassword=inp.nextLine();
                if(newPassword.equals("java")||newPassword.equals("pass")){
                    System.out.println("Invalid login or password. Please try again");
                }else{
                    System.out.println("Password changed");
                }

            }else{
                System.out.println("Invalid login or password.");
            }
        }
    }
}