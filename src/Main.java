// Rezolvati urmatoarele probleme in cadrul clasei Main si metodei main()
public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.cerinta1();
        main.cerinta2();
        main.cerinta3();
        main.cerinta4();
    }

    /*
    1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
    Ex:
    Hello
    Cosmin
    */
    public void cerinta1() {
        System.out.println("Hello");
        System.out.println("Laura");
        /*
        System.out.println("Hello\nLaura") = System.out.println("Hello");
                                             System.out.println("Laura");

        Dacă nu scriu cuvântul static, e dinamic by default
         */
        System.out.println();
    }

    /*
    2. Printati rezultatul sumei a doua numere(orice numere)
     */
    public void cerinta2() {
        System.out.println(7+14);
        //varianta scurta
        int a = 7;
        int b = 14;
        int c = a + b;
        //varianta cu definirea variabilelor 1 - cea mai lunga
        System.out.println(a+b);
        //varianta cu definirea variabilelor 2 - medie
        System.out.println(c);

        System.out.println();
    }

    /*
    3. Printati rezultatul impartirii a doua numere.
       Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
    Ex: 10 / 3 =  3.33333
     */
    public void cerinta3() {
        int a = 21;
        float b = 4;
        float c = a/b;
        System.out.println(a/b);
        System.out.println(c);
        System.out.println();
    }

    /*
    4. Printati rezultatul urmatoarelor operatiuni:
    a. -5 + 8 * 6
    b. (55+9) % 9
    c. 20 + -3*5 / 8
    d. 5 + 15 / 3 * 2 - 8 % 3
     */
    public void cerinta4() {
        //f in loc de ln pt format, unde "string"
        System.out.printf("a. %d\n", -5 + 8 * 6);
        System.out.printf("b. %d\n",(55 + 9) % 9);
        System.out.printf("c. %d\n",20 + -3*5 / 8);
        System.out.printf("d. %d\n",5 + 15 / 3 * 2 - 8 % 3);
        System.out.println();
    }
}
