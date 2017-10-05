import java.util.Scanner;


    public class JBLesson02 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double a=0;
            double b=0;
            double c=0;
            System.out.println("Please enter A variable");
            if (sc.hasNextDouble()) {
                a = sc.nextDouble();
            }
            System.out.println("Please enter B variable");
            if (sc.hasNextDouble()) {
                b= sc.nextDouble();
            }

            if (a == b) {
                System.out.println("Скоро новый год!");
            } else
            {
                System.out.println("Please enter C variable");
            }
            if(sc.hasNextDouble( )) {
                System.out.println("Please enter C variable");
                c = sc.nextDouble();
                System.out.println("Значение выражения A + B + C = " + (a+b+c) );
            }


        }
    }


