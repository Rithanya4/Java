
package ex3;
 class main{
     public static void main(String args[]){

    dog labrador = new dog();
    labrador.greet2();
    labrador.greet3();
    cat obj=new cat();
    obj.greet1();
     }
 }
class animal {
    String name;
    animal()
    {
        System.out.println(name);
    }
}
class mammal extends animal

{
     public String toString()
{
return "Name:"+name;
}
}
class cat extends mammal
{
    cat()
    {
        String name;
        
    }
   public String toString()
{
return "Name:"+name;
}
void greet1()
{
     System.out.println("name:Kitty");
    System.out.println("MEOW");
}
}
class dog extends mammal{
dog()
     {
    String name;

     }
    void greet2()
{
    System.out.println("name=dog1");
    System.out.println("WOOF");
}
     
void greet3()
{
    System.out.println("name=dog2");
    System.out.println("WOOOOOF");
}
public String toString()
{
return "Name:"+name;
}
}




