import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        String myFirstStringVariable = "Hallo cgn-23-2!!!";

        System.out.println(myFirstStringVariable);

        myFirstStringVariable = "Hallo Welt!" + " !!!";

        System.out.println(myFirstStringVariable);


        int myFirstIntegerValue = 3;
        int mySecondIntegerValue = 3 * myFirstIntegerValue;
        System.out.println("Summe: " + (3 + 3) );

        boolean myFirstBooleanValue = true;
        boolean mySecondBooleanValue = false || true;

        char myFirstChar = 'A';


        float myFirstDoubleValue = 0.2f;
        float mySecondDoubleValue = 0.7f;

        System.out.println(myFirstDoubleValue + mySecondDoubleValue);

        System.out.println(myFirstIntegerValue >= 1);

        String name1 = "Florian";
        String name2 = "Christian";
        String name3 = "Daniel";
        String name4 = "Anton";
        String name5 = "Joshua";

        String[] names = new String[6];
        names[0] = name1;
        names[1] = name2;
        names[2] = name3;
        names[3] = name4;
        names[4] = name5;

        System.out.println(names[5]);




        int[] numbers = new int[9453];
        numbers[0] = 123;
        numbers[1] = 1;
        numbers[2] = 6874841;

        System.out.println(numbers[0] + " " + numbers[2]);

        System.out.println(numbers[0] + numbers[1]);

        System.out.println(numbers.length);

        System.out.println(Arrays.toString(numbers));


    }
}
