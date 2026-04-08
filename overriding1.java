class Teacher{
void view(){
System.out.println("this is a teacher class method");
} 
}
class Student extends Teacher{
void view(){
System.out.println("this is a student class method");
}
}
public class overriding1{
public static void main(String args[]){
Teacher tobj = new Teacher();
tobj.view();
Student sobj = new Student();
sobj.view();
}
}