public class methodoverloading1{
public int dext(int a , int b){
return a*b ; 
}
public int dext(int a , int b , int c){
return a+b*c ; 
}
public static void main(String args[]){
methodoverloading1 molobj = new methodoverloading1();
System.out.println(molobj.dext(112,4));
System.out.println(molobj.dext(112,4,2));
}
}