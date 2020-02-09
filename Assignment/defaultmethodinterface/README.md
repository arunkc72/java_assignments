Default interface feature, which allows the developer to add new methods to the interfaces without breaking their existing implementation. It provides the flexibility to allow interface to define implementation which will use as the default in a situation where a concrete class fails to provide an implementation for that method.

   Default interface methods are an efficient way to deal with this issue. They allow us to add new methods to an interface that are automatically available in the implementations.       Thus, there's no need to modify the implementing classes.

   In this way, backward compatibility is neatly preserved without having to refactor the implementers.
                       
                      
                     CODE:
                       
            public interface oldInterface {
            public void existingMethod();
            default public void newDefaultMethod() {
            System.out.println("New default method" " is added in interface");
            }
            }       
