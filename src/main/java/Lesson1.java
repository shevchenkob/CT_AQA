public class Lesson1 {

    public static void wrapperInt () {
        int inputInteger = 10;
        int transformInt = Integer.hashCode(inputInteger);
        System.out.println(transformInt);
    }

    public static void main(String[] args) {
        wrapperInt();
    }

}
