public class Lesson1 {

    public static void wrapperInt () {
        int inputInteger = 10;
        int transformInt = Integer.compare(inputInteger, 11);
        System.out.println(transformInt);
    }

    public static void main(String[] args) {
        wrapperInt();
    }

}
