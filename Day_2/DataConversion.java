public class DataConversion {
    
    public static void main(final String[] args) {

        final byte a = 7;
        final byte b = 10;
        // assigning the sum of byte to integer
        final int c = a + b;
        System.out.println(c);
        // Assigning byte to integer
        final int d = a;
        // Implicit Data Conversion
        final int intVariable = 10;
        final float floatVariable = intVariable;
        System.out.println("Value of a " + a);
        System.out.println("Value of d " + d);
        System.out.println("Value of intVariable " + intVariable);
        System.out.println("Value of floatVariable " + floatVariable);

        // Explicit Conversion 

        // int e = 15;
        // byte byteVar = (byte)e;
        byte byte1 = 3;
        byte byte2 = 4;
        // byte sum = byte1 + byte2; --> It will show an error because
        // sum of byte will always gives integer
        // If we have byte, short or int in arithmetic operation, we will get always integer

        // byte sum = byte1 + byte2;   --> It shows an error because of byte sum
        int sum = byte1 + byte2;
        System.out.println("sum of bytes" + sum);

        byte sum1 = (byte)(byte1 + byte2);
        System.out.println("sum of bytes" + sum1);
        long longValue = 12345;
        // byte can hold form -127 to 127
        byte byteofLong = (byte)longValue;
        System.out.println("long after conversion of byte " + byteofLong); 
    }
}