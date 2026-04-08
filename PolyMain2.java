class Employee{
    void salary(){
        System.out.println("Employee salary");
    }

    static void bonus(int a){
        System.out.println("Bonus: " + a);
    }

    static void bonus(int a, int b){
        System.out.println("Bonus: " + (a+b));
    }
}

class Manager extends Employee{
    void salary(){
        System.out.println("Manager salary 50000");
    }
}

class Developer extends Employee{
    void salary(){
        System.out.println("Developer salary 40000");
    }
}

public class PolyMain2{
    public static void main(String args[]){
        Employee e[] = new Employee[2];
        e[0] = new Manager();
        e[1] = new Developer();

        for(Employee emp : e){
            emp.salary();
        }

        Employee.bonus(1000);
        Employee.bonus(1000,2000);
    }
}