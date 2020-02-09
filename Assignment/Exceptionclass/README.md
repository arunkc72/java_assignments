          Exception class
   The class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonable application might want to catch.
The class Exception and any subclasses that are not also subclasses of RuntimeException are checked exceptions. Checked exceptions need to be declared in a method or constructor's throws clause if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary.
                       
                      Method for creating exception class
   We should  create a new class whose name should end with Exception like ClassNameException.  This is a convention to differentiate an exception class from regular ones.Then,we should    make  the class that extends one of the exceptions which are subtypes of the    java.lang.Exception class. Generally, a custom exception class always extends directly from    the Exception class.Then we should create a constructor with a String parameter which is    the detail message of the exception. In this constructor, simply we should call the super    constructor and pass the message
   
                       Code: 
          public class ExcepTest {
          public static void main(String args[]) {
          int a[] = new int[2];
          try {
          System.out.println("Access element three :" + a[3]);
          } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Exception thrown  :" + e);
          }finally {
         a[0] = 6;
         System.out.println("First element value: " + a[0]);
         System.out.println("The finally statement is executed");
         }
         }
         }
  
