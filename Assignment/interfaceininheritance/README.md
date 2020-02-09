                     Inheritance in interface
    An interface is just like Java Class, but it only has static constants and abstract method. 
    Java uses Interface to implement multiple inheritance. 
    All methods in an interface are implicitly public and abstract.
    An interface in Java is a blueprint of a class. 

   The interface in Java is a mechanism to achieve abstraction. There can be only abstract    methods in the Java interface, not method body. It is used to achieve abstraction and    multiple inheritance in Java.

   Java Interface also represents the IS-A relationship.
                  
                     code
                     
      interface Pet{
      public void test();
      }
      class Dog implements Pet{
      public void test(){
      System.out.println("Interface Method Implemented");
      }
      public static void main(String args[]){
      Pet p = new Dog();
      p.test();
      }
      }
