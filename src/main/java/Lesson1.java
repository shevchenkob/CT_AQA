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

    public static void main(String[] args) {
        wrapperChar();
    }

}
