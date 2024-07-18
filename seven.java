import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        System.out.println("Enter a string between 5 to 20 characters");
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        int lengthofString=string1.length();

        if(lengthofString>5&&lengthofString<20){
            System.out.println("You typed: "+string1);
            
        }
        else{
            throw new ArithmeticException("String length out of range");
        }
    }
}
