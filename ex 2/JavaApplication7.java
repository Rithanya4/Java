
package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {
    public static void main(String[] args) {
    bill obj=new bill();
    obj.commercial();
    obj.domestic();
    
    }
}
class bill{
    
int consumer_no;
String name;
int previous_reading;
int current_reading;
void domestic()
{
int units=0;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the units "+units);
units=obj.nextInt();
if(units==100)
{
    System.out.println("rs.1.50");
}
else if(units<200 && units>=101)
{
    System.out.println("rs.3");
}
else if (units<500 && units>=200)
{
    System.out.println("rs.4.50");
}
else
{
    System.out.println("rs.7");
}
}
void commercial()
{
        int units=0;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the units "+units);
units=obj.nextInt();
        
    if(units==100)
{
    System.out.println("rs.2.50");
}
    else if(units<200 && units>=101)
{
    System.out.println("rs.5");
}
    else if (units<500 && units>=200)
{
    System.out.println("rs.6.50");
}
else
{
    System.out.println("rs.9");
}
}
        
}