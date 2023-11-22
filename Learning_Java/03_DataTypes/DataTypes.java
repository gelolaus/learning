class DataTypes {

    public static void main(String[] args) {
        byte myByte = 100; // 8-bit signed two's complement integer. Range: -128 to 127.
        short myShort = 10000; // 16-bit signed two's complement integer. Range: -32,768 to 32,767.
        int myInt = 1000000; // 32-bit signed two's complement integer. Range: -2^31 to 2^31 - 1.
        long myLong = 1000000000; // 64-bit signed two's complement integer. Range: -2^63 to 2^63 - 1.
        float myFloat = 3.14f; //single-precision 32-bit IEEE 754 floating point. Range: 1.40129846432481707e-45 to 3.40282346638528860e+38.
        double myDouble = 3.141592653589793238462643383279502884197169399375105820974944592307816406286; // double-precision 64-bit IEEE 754 floating point. Range: 4.94065645841246544e-324d to 1.79769313486231570e+308d.
        boolean myBoolean = true; // true or false.
        char myChar = 'A'; // single 16-bit Unicode character. Range: '\u0000' to '\uffff'.
        char myChar2 = '\u00A9'; // Unicode character for the copyright symbol.

        System.out.println("A byte: " + myByte);
        System.out.println("A short: " + myShort);
        System.out.println("An int: " + myInt);
        System.out.println("A long: " + myLong);
        System.out.println("A float: " + myFloat);
        System.out.println("A double: " + myDouble);
        System.out.println("A boolean: " + myBoolean);
        System.out.println("A char: " + myChar);
        System.out.println("A copyright symbol: " + myChar2);

        
    }
    
}

/*
 * In converting to different data types:
 * You can convert variables to a higher data type
 * You cannot convert variables to a lower data type
 */