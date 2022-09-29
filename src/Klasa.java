import java.util.ArrayList;

public class Klasa {
    private Wychowawca
    private ArrayList<Uczen> Uczniowie = new ArrayList<>();
    private String nazwa;

    public Klasa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Klasa(ArrayList<Uczen> uczniowie) {
        Uczniowie = uczniowie;

    }

    public void dodajUczniaDoKlasy(Uczen uczen) {
        if (Uczniowie.contains(uczen))
            System.out.println("nie da sie"+uczen"do klasy");
    }else
        Uczniowie.add(Uczen);
}
}