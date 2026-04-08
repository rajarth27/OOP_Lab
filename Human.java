class Encapulsation2 {
private String name; 
private int age;

public String getName() {
return name;    
}
public void setName(String name) {
this.name = name;    
}
public int getAge() {
return age;    
}
public void setAge(int age) {
if (age > 0) { 
this.age = age;
} 
else {
System.out.println("Age cannot be negative or zero!");
}   
}
}
public class Human {
public static void main(String[] args) {
Encapulsation2 obj = new Encapulsation2();
obj.setName("Max");
obj.setAge(28);
System.out.println("Name: " + obj.getName()); 
System.out.println("Age: " + obj.getAge());   
obj.setAge(-44); 
} 
}
