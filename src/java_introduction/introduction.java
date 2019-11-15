package java_introduction;

// CTRL + /                 -> komentarz jednowierszowy
// CTRL + Shift + /         -> komentarz blokowy
// psvm                     -> public static void main(String[] args)   ()
// sout                     -> System.out.println();
// CTRL + Shift + F10       -> run program
// CTRL + D                 -> duplikowanie lini
public class introduction {
    // metoda uruchomieniowa
    // -> automatycznie wywoływana jako pierwsza w trakcie projektu
    public static void main(String[] args) {
        //polecenie wpisujące wartości podane w argumencie na standardowym wyjściu
        System.out.println("Hello World!");
        // pobranie numeru wersji JRE
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.version"));

        //typy danych
        int myFirstNumber = 1234;
        System.out.println("myFirstNumber = " + myFirstNumber);
        //byte mySmallnumber = 66666; -> błąd zbyt mała precyzja typu byte
        System.out.println("Dodawanie liczb: " + (100 + myFirstNumber));
        double salaryNet = 9000.97;
        int vatTax = 23;
        System.out.println("Kwota netto :" + salaryNet + "zł");
        System.out.println("Kwota brutto :" + (salaryNet * (1 + (vatTax / 100.0))) + "zł");
        // formatowanie wyjścia
        // \n -> newline
        System.out.printf("Kwota brutto : %.2f zł\n", salaryNet * (1 + (vatTax / 100.0)));
        System.out.printf("%.2fzł netto to %.2fzł brutto\n", salaryNet, salaryNet * (1 + (vatTax / 100.0)));

        System.out.printf("Liczba: %20.2f\n", salaryNet);

        char smallLetter = 'a';
        char bigLetter = 'A';
        char dotChar = '.';

        System.out.println(smallLetter);
        System.out.println((char) (bigLetter + 10));
        System.out.printf("Znak: %c ma %d numer ASCII\n", dotChar, (int) dotChar);

        boolean isActivated = true;
        System.out.println(isActivated);
        System.out.println(!isActivated);
    }
}