abstract class A{  
   A()
   { 
     System.out.println("Class is created");
   }  
   abstract void display();  
   void change()
   {
    System.out.println("Thank you");
   }  
 }  

 class B extends A
{  
 void display()
 {
   System.out.println("Welcome");
 }  
}  

 class Main
{
  public static void main(String args[]){  
  A obj = new B();  
  obj.display();  
  obj.change();  
 }  
}  
