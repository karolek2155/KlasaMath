import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {


//        double result = Math.pow(5,2);
//        System.out.println(result);

        Scanner scann = new Scanner(System.in);
        System.out.println("Podaj kolejno a, b, c trójmianu kwadratowego");
        double a = scann.nextDouble();
        double b = scann.nextDouble();
        double c = scann.nextDouble();

        double delta = pow(b, 2) - 4 * a * c;

        if (a == 0) {
            double x = -c / b;
            System.out.printf("Równanie liniowe - rozw. to %.2f\n", x);
        }else {
            if (delta > 0) {
                double x1 = (-b - sqrt(delta) / (2 * a));
                double x2 = (-b + sqrt(delta) / (2 * a));
                System.out.printf("Pierwiastkami równania kwadratowego są: %.2f i %.2f\n", x1, x2);
            } else if (delta == 0) {
                double x0 = -b / (2 * a);
                System.out.printf("Równanie kwadratowe ma jeden pierwiastek %.2f\n", x0);
            } else System.out.println("Równanie nie ma pierwiastków");
        }


        double[] tabDouble = new double[20];

        for (int i = 0; i < tabDouble.length; i++){
            tabDouble[i] = random() * 40 + 30;
            System.out.print(tabDouble[i] + " ");
        }

        System.out.println("<br>");

        int[] tabInt = new int[20];

        for (int i = 0; i < tabInt.length; i++){
            tabInt[i] = (int) (random() * 40 + 30);
            System.out.print(tabInt[i] + " ");
        }



//        random() * num(zakres) 0-1 double

        int size = 10;
        double[] doubleArr = new double[size];
        for (int i = 0; i < size; i++) {
            doubleArr[i] = random() * 100;
            System.out.print(doubleArr[i] + ", ");
        }
        System.out.println();

//        zakres 200 - 500 w int

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(random() * 300 + 200);
            System.out.print(arr[i] + ", ");
        }

//        dwa miejsca po przecinku

        double[] arr1 = new double[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (random() * 30000 + 20000);
            arr1[i] = arr1[i]/100;
            System.out.print(arr1[i] + ", ");
        }

    }
}