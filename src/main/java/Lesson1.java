import java.nio.charset.StandardCharsets;

public class Lesson1 {

    /*
    In this method we add wrapper to integer data type and compering input value with 11 number.
     */
    public static void wrapperInt () {
        int inputInteger = 10;
        int transformInt = Integer.compare(inputInteger, 11);
        System.out.println(transformInt);
    }

    /*
    In this method we add wrapper to char and changing input value to uppercase.
    */
    public static void wrapperChar () {
        char inputChar = 'l';
        char transformChar = Character.toUpperCase(inputChar);
        System.out.println(transformChar);

    }

    /*
    In method below we add wrapper to short data type and getting 3-rd char after transforming to string type.
     */
    public static void wrapperShort () {
        short inputShort = 12354;
        char transformedShort = Short.toString(inputShort).charAt(2);
        System.out.println(transformedShort);

    }

    /*
    In this method we add wrapper to long data type and replaising digit 3 to "a" symbol after converting to string.
    */
    public static void wrapperLong () {
        long inputLong = 1236534665;
        String transformLong = Long.toString(inputLong).replace('3', 'a');
        System.out.println(transformLong);

    }

    /*
    In this method we add wrapper to byte data type and after converting to string get first position of digit.
    */
    public static void wrapperByte () {
        byte inputByte = 21;
        String transformByte = Byte.toString(inputByte);
        System.out.println(transformByte.charAt(0));
    }

    /*
    In this method we add wrapper to boolean data type and applying logicalOr methot that return true if either of the bool value is true.
    */
    public static void wrapperBoolean () {
        boolean inputBoolean = true;
       boolean transformBoolean = Boolean.logicalOr(inputBoolean, false);
        System.out.println(transformBoolean);
    }

    /*
    In this method we add wrapper to double data type and comparing two values with each other.
    */
    public static void wrapperDouble () {
        double inputDouble = 33.3;
        int transformDouble = Double.compare(inputDouble, 3.33);
        System.out.println(transformDouble);

    }

    public static void wrapperFloat () {
        float inputFloat = 51;
       boolean transformFloat = Float.isInfinite(inputFloat);
        System.out.println("Infinity value for isInfinite() method is: " + transformFloat);
    }

    public static void main(String[] args) {
        wrapperFloat();
    }

}
