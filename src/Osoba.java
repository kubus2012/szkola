public abstract class Osoba {
    private String imie;
    protected int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba {" +
                "imie = ' " + imie + '\'' +
                "wiek = " + wiek +
                '}';
    }
// ptotecdted nie jest publiczne a dostepne w calym pakiecie pozwala na dostep rodzinie
    public void setImie(String imie) {
        this.imie = imie;
        //TODO prawdz poprawnosc imienia czy te same lkitery cxzy duza
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }
}
