public sealed class Nauczyciel extends Osoba implements Dyżurny permits Wychowawca {
    private String przedmiot;

    public Nauczyciel(String imie, int wiek, String przedmiot) {
        super(imie, wiek);
        this.przedmiot = przedmiot;
    }

    @Override
    public void dyżury() {
        System.out.println("Spacerek");
    }
}
