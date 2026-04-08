class Teacher {
void view(){
System.out.println("teacher class method");
} 
}
class Student extends Teacher {
void view(){
super.view();
System.out.println("student class method");
}
public static void main(String args[]){
Teacher obj = new Student();
obj.view();
}
}
