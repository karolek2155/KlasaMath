import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

// 1 str z klawiatury, przenies 2 ostatnie znaki na przod, pod warunkiem, ze tych znakow jest na tyle co najmniej 3, jesli nie - zostawisz bez

        Scanner scanner = new Scanner(System.in);
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

    }
}