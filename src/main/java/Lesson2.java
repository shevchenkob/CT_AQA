public class Lesson2 {
    public static void modulus(){
        int num1,num2,result;
        num1=36;
        num2=15;
        System.out.println("num1= " + num1 + " num2= " + num2);
        result=num1%num2;
        System.out.println("The result after modulus operation is : "+result);

    }

    public static void whileMethod(){
        int i = 5;
        while (i<10) {
            System.out.println(i);
            i++;
        }

}
    public static void doWhileMethod(){
        int i = 4;
        do {
            System.out.println("Now it is number: " + i);
            i++;
        }
        while (i<10);
        /* Why this out returned only once in output with only 10 digit? */
            System.out.println(i);

        }

    public static void forMethod(){
        String input = "lalala";
        for (int i = 0; i<input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }





    public static void main(String[] args){
        forMethod();
    }

}
