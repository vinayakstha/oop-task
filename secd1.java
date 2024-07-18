
public class secd1 {    

    public static void main(String[] args) {
        student s1 = new student();
        s1.studentID = "STW230376";
        s1.name = "Amit Khayargoli";
        s1.GPA = 3.90;

        s1.printProfile();

        //Updating GPA

        s1.updateGPA(4.0);
    }
}


class student{
    String studentID,name;
    double GPA;

    void updateGPA(double GPA){
        System.out.println(name+"\'s GPA is "+GPA);
    }

    void printProfile(){
        System.out.println("StudentID: "+studentID);
        System.out.println("Name: "+name);
        System.out.println("GPA: "+GPA);
    }
}
