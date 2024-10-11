import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Konsoleneingabe ermöglichen


        while(true) {
            int num1 = sc.nextInt();

            String operator = sc.next();

            int num2 = sc.nextInt();


            /*
            if(!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                System.out.println("Bitte aus +, -, *, / auswählen");
                break;
            }
            */

            if(operator.equals("+")) {
                add(num1, num2);

            }


            if(operator.equals("-")) {
                minus(num1, num2);

            }

            if(operator.equals("Ende")) {
                break;
            }


        }


    }

    public static void add(int a, int b) {
        int sum = a + b;
       System.out.println(sum);

    }

    public static void minus(int a, int b) {
        int sum = a - b;
        System.out.println(sum);

    }

    public static void div(int a, int b){
        
    }

    public static boolean operatorCheck(String a) {
        if(!a.equals( "+" ) && a.equals("-")) {
            System.out.println("andere Wählen");

            return false;
        }
        return true;
    }
}