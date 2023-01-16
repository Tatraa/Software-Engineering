import java.time.Year;
import java.time.Duration;

class Dzielo {
    private int rokPublikacji;
    public Boolean czyWygaslyPrawaAutorskie() {
        int obecnyRok = Year.now().getValue();
        if(obecnyRok - getRokPublikacji() > 70) {
            return true;
        }
        return false;
    }
    
    public int getRokPublikacji() {
        return rokPublikacji;
    }
    
    public void setRokPublikacji(int rokPublikacji) {
        this.rokPublikacji = rokPublikacji;
    }
}
class Ksiazka extends Dzielo {
    private String tytul;
    private String[] Autorzy;
    private String jezyk;
    private String gatunek;
    private String wydawca;
    private int iloscStron;
    //inny kod (konstruktor, pola i metody właściwe książce itd.)
}
    
class Film extends Dzielo {
    private String tytul;
    private String[] Aktorzy;
    private String Rezyser;
    private String jezyk;
    private String gatunek;
    private String wytwornia;
    private Duration dlugosc;
    //inny kod (konstruktor, pola i metody właściwe filmowi itd.)
}
    
public class Zad4 {
        public static void main(String[] args) {
        Ksiazka PanTadeusz = new Ksiazka();
        PanTadeusz.setRokPublikacji(1834);
        System.out.println(PanTadeusz.czyWygaslyPrawaAutorskie());
        Film WladcaPierscieniI = new Film();
        WladcaPierscieniI.setRokPublikacji(2001);
        System.out.println(WladcaPierscieniI.czyWygaslyPrawaAutorskie());
    }
}