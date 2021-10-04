public class Lesson2 {
    public static void modulusAndOther(){
        int num1,num2,result;
        num1=36;
        num2=15;
        System.out.println("num1= " + num1 + " num2= " + num2);
        result=num1%num2;
        System.out.println("The result after modulus operation is : "+result);

                /* Increment */
        /*
        Here we first add 1, so b=8 and then "a" became "b", so "a" also 8.
        */
        int a,b = 7;
        a = ++b;
        System.out.println("a = " + a + " b = " + b);

        /*
        Here we first make "c" became "c", so "a" = c and then add 1 to "d", so d=8.
        */
        int c,d = 7;
        c = d++;
        System.out.println("c = " + c + " d = " + d);

                    /* Decrement */

        /* in "q" we first subtract 1 from "e" and then add to 10, in t we first add "f" to five and then subtract 1. */
        int e = 5;
        int f = 5;
        int q = 10 + --e;
        int t = 10 + f--;
        System.out.println("q is: " + q + "t is: " + t);

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

    public static void whileLoopSecond () {
        int i = 5;
        int a = 4;
        while (i < 10 || a < 10){
        System.out.println("Operator || result:" + "i= " + i + "  a= " + a);
        i++;
        a++;
        }

        int b = 5;
        int c = 4;
        while (b < 10 && c < 10){
            System.out.println("Operator && result:" + "b= " + b + "  c= " + c);
            b++;
            c++;
        }

        /* It will check if d == 10 and if d < 9 */
        int d = 12;
        if (d == 10 & d < 9);

        /*  It will check if e == 10 and stop checking afterward because e != 10 */
        int e = 12;
        if (e == 10 && e < 9);

        /* It will check if f == 12 and it will check if f > 10 */
        int f = 12;
        if (f == 12 | f > 10);

        /* It will check if i == 12, it does, so it stops checking and executes what is in the if statement */
        int f = 12;
        if (f == 12 || f > 10);



    }


    public static void main(String[] args){
        whileLoopSecond();
    }

}
