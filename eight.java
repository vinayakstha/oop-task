import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
    System.out.println("Enter an email: ");
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();


        if(email.indexOf("@")>0&&email.indexOf(".")>email.indexOf("@")){
            if(email.contains("@")&&email.contains(".")){
                System.out.print("Valid email: ");
                System.out.print(email);
            }
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Email should contain @ and . symbols");
        }
        
    }
}
