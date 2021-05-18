/*primitive datatypes have some limitations so we use wrapper classes
wrapper classes allow primitive types to be accessed as objects

primitive to object (int to Integer, byte to Byte ...)
object to primitive (Float to float, Boolean to boolean, char to Character)
just change small letter in the beginning to capital (except for char to Character & int to Integer)

boxing/autoboxing - conversion from value type (int) to reference type (Integer)
unboxing - conversion of reference type(Integer) to value type(int)
 */
package Unit2;

public class wrapper {
    public static void main(String[] args) {

        int no1=10;
        Integer refno1 = no1; //boxing
        System.out.println("Boxing "+refno1);

        Integer refx = 50;
        int x;
        x = refx;  //Unboxing
        System.out.println("Unboxing "+x);

    }
}
