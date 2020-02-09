 When an interface as a static member is declared inside a class or another interface, it is called nested interface in java or member interface.

Nested interface must be declared as public inside another interface. The nested interface can be declared in the following general form.  Since nested interface cannot be accessed directly,    the main purpose of using them is to resolve the namespace by grouping related interfaces      related interface and class) together.  This way, we can only call the nested interface by     using outer class or outer interface name followed by dot( . ), followed by the interface    name.
          
    The following are the rules governing a nested interface.

      A nested interface declared within an interface must be public.
      A nested interface declared within a class can have any access modifier.
      A nested interface is by default static 
                      
                          Code :
                          
            package nestedInterfaceProgram;
            public interface Outer {

              void m1(); // Outer interface contains m1() method.
              interface Inner {
              void m2(); // Inner interface contains m2() method.
               }
            }
            // Implementation of top-level interface:
               public class MyClass1 implements Outer {
                   public void m1(){
                     System.out.println("Hello");
                  }
               }
            // Implementation of inner interface:
                public class MyClass2 implements Outer.Inner {
                    public void m2(){
                     System.out.println("Java");
                  }
                }
            public class Test {
            public static void main(String[] args) {
             MyClass1 c1 = new MyClass1(); // Creating object of class MyClass1.
                    c1.m1(); // Calling m1() method.
             MyClass2 c2 = new MyClass2(); // Creating object of class MyClass2.
                    c2.m2(); // Calling m2() method.
              }
            }
            Output:
                      Hello
                      Java
