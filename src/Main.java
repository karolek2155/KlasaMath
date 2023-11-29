import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {

// 1 str z klawiatury, przenies 2 ostatnie znaki na przod, pod warunkiem, ze tych znakow jest na tyle co najmniej 3, jesli nie - zostawisz bez

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków o długości co najmniej 3 :");
        String str = scanner.nextLine();

        int lengthStr = str.length();
        if (str.length() > 2) {
            String last2Chars = str.substring(lengthStr-2, lengthStr);
            String chars = str.substring(0, lengthStr-2);
            String newStr = last2Chars + chars;
            System.out.println(newStr);
        }
        else{
            System.out.println("Podaj ciąg znaków o długości co najmniej 3");
        }

        System.out.println("Podaj ciąg znaków :");
        String str2 = scanner.nextLine();
        System.out.println("Podaj dowolny indeks ciągu znaków :");
        int indexStr2 = scanner.nextInt();

        if (indexStr2 + 4 <= str2.length()) {
            String newStr2 = str2.substring(indexStr2, indexStr2+4);
            System.out.println(newStr2);
        }
       */

//        double result = Math.pow(5,2);
//        System.out.println(result);

        /*Scanner scann = new Scanner(System.in);
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
*/

/*        double[] tabDouble = new double[20];

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
        */

    }
}