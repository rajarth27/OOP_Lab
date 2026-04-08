class Shape{
    void area(){
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape{
    void area(){
        super.area();
        System.out.println("Area of rectangle");
    }
}

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }
}

public class PolyMain1{
    public static void main(String args[]){
        Shape s = new Rectangle();
        s.area();

        Calculator c = new Calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3,4));
        System.out.println(c.add(2.5,3.5));
    }
}