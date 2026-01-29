class retail_shop_discount{
public static void main (String[] args){
int itema=200, itemb=75, itemc=500;
double price;
price = ((itema*2)+(itemb)+(itemc*3));
price = price - (0.1*price);
price = price + (0.05*price);
if (price > 1500)
{
price= price - (0.05*price);
}
else
{
System.out.println("Not Eligible");
}
System.out.println(price);
}
}