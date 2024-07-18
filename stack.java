import java.util.Scanner;

public class stack{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continueLoop = true;

        StackArray sa = new StackArray(10);
        
        while(true){
            System.out.println("*************MENU***************");
            System.out.println("1.Add text");
            System.out.println("2.Undo changes");
            System.out.println("3.Show current Text");
            System.out.println("4.Exit the program");
    
            int choice = scan.nextInt();
        switch (choice) {
            case 1:
            boolean textInsertLoop = true;
            System.out.println("1.Add text");
            scan.nextLine();

            while(textInsertLoop){
                System.out.println("Enter a string:");
                String str = scan.nextLine();
                System.out.println("Do you want to add more Strings? (y/n)");
                String answer = scan.nextLine();
                sa.addText(str);
                
                if(!answer.equalsIgnoreCase("y")){
                    textInsertLoop = false;  
                }
                
            }
            System.out.println("-------------------------------------");
                break;
            
            case 2:
            System.out.println();
            System.out.println("2.Undo changes");
            System.out.println("Undoing changes");
            sa.undo();
            System.out.println("The current text is "+sa.getCurrentText());
            System.out.println("-------------------------------------");
            break;

            case 3:
            System.out.println();
            System.out.println("3.Show current Text");
            System.out.println("The current text is "+sa.getCurrentText());
            System.out.println("-------------------------------------");
            break;

            case 4:
            System.out.println();
            System.out.println("Exiting the program.... *beep *beep ");
            return;
            
        }
        
    }
    }
}

class StackArray{
    String arr[];
    int top;
    int size;

    StackArray(int size){
        top = -1;
        this.size = size;
        arr = new String[size];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public void addText(String text){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        System.out.println("Inserting "+text);
        arr[++top] = text;
    }

    public String undo(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return arr[top--];
    }

    public String getCurrentText(){
        return arr[top];
    }
}