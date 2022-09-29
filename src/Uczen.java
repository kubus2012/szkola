public class Uczen extends Osoba{
    private int NrUcznia;
    private static int licznik;

    public Uczen(String imie, int wiek) {
        super(imie, wiek); //wywolanie konstruktra kalsy nadrzedmeje
        //musi buc pierwszy wiersz konstruktora
        licznik++;
        int nrUcznia = licznik;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "NrUcznia = " + NrUcznia +
                "imie = "+getImie()+
                "wiek = "+wiek+
                '}';
    }

    public static void wypiszDane(){
        System.out.println("liczba uczniow"+licznik);
    }
}
