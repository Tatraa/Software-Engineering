//Proszę zrefaktoryzować "dziwnąMetodę".

public class Zad2 {
    public static void main(String[] args) {

        System.out.println(dziwnaMetoda(11));
        System.out.println(dziwnaMetoda(25));
        System.out.println(dziwnaMetoda(14));
        System.out.println(dziwnaMetoda(30));
    }

    static int dziwnaMetoda(int x){
        int wynik = 0;

        if (x == 1 || x % 5 == 0) {
            wynik = 2 * x * x - 1;
        } else if (x == 11 || x == 13) {
            wynik = 11;
        }
        return wynik;
    }

}