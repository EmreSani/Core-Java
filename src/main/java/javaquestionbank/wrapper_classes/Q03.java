package javaquestionbank.wrapper_classes;

public class Q03 {
    //What are the differences between valueOf(String s) and parseByte(String s) methods?

    // The valueOf(String s) and parseByte(String s) methods are both related to converting a string representation into a byte data type, but they have some key differences:

    //   Return Type:
    //  valueOf(String s): Returns a Byte object.
    //  parseByte(String s): Returns a primitive byte.

    // Exception Handling:
    // valueOf(String s): Can throw a NumberFormatException if the string does not contain a valid integer representation.
    // parseByte(String s): Also throws a NumberFormatException if the string does not contain a valid byte representation. In addition, it can throw NumberFormatException if the value is out of the range of byte (-128 to 127).

    // Usage:
    // valueOf(String s): Typically used when you need a Byte object, and it's often used in scenarios where you want to leverage the features of the Byte wrapper class.
    //  parseByte(String s): Used when you specifically need a primitive byte value.

    //Example:
    String str = "123";

    // Using valueOf
    Byte byteObj = Byte.valueOf(str); // Returns a Byte object

    // Using parseByte
    byte primitiveByte = Byte.parseByte(str); // Returns a primitive byte
    // Remember that when using parseByte, you need to handle the potential NumberFormatException appropriately in your code.

}
