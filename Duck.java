public interface Swimmable {
void swim(); 
}
public interface Flyable {
void fly(); 
}
public class Duck implements Swimmable, Flyable {
public void swim() {
System.out.println("Duck swims");     
}
public void fly() {
System.out.println("Duck flies");     
} 
}
