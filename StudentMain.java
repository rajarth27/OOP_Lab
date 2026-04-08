class Student {
    private int rollNo;
    private String name;
    private int marks;

    Student(int rollNo, String name, int marks){
        this.rollNo = rollNo;
        this.name = name;
        setMarks(marks);
    }

    public int getRollNo(){
        return rollNo;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    public void calculateGrade(){
        char grade; // local variable
        if(marks >= 80) grade='A';
        else if(marks >= 60) grade='B';
        else grade='C';

        System.out.println("Grade: " + grade);
    }
}

public class StudentMain{
    public static void main(String args[]){
        Student s = new Student(1,"Raja",85);
        System.out.println(s.getName());
        s.calculateGrade();
    }
}