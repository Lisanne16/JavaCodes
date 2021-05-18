package Unit2;
 /*
 SEE PPT
 garbage collector - unused memory
 c / c++ - there is a free keyword to free the memory
 reclaiming/ freeing memory in java happens automatically

  */
public class Garbage_collector {
     public static void main(String[] args) {

         Garbage_collector obj = new Garbage_collector();  //creating an object and not using it
         System.out.println("Check");

         obj=null;
         System.gc();  //explicitly calling garbage collector
         //Requesting JVM to call GC

         //another way to get gc - Runtime.getRuntime().gc();
     }

     @Override
     protected void finalize()  //it is protected cuz its a syntax
     {
         System.out.println("Garbage Collector called");  //if this method is called means garbage collector is called
         //this gets displayed 1 line before the gc
     }

}
