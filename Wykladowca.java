// imie nazwisko tytul email
//wyswietl wykladowcy studentow po nr karty studenckiej   nie koniecznie hmm
//wykladowaca moze przydzielac zaliczenia i oceny 
package rozwiazanie;

public class Wykladowca extends Osoba{
    public String stopienNauk;
    public String iloscGodzin;
    public String przedmiot;
    public int przedmiotIndeks;//definiuje pozycje oceny w tablicy
     //public String nazwaKierun2; aby zdefiniowac kolejny kierunek na ktorym uczy
   //   public String nazwaKierun3;
    public Wykladowca (String identyfikator,int przedmiotIndeks,String imie,String nazwisko,Integer wiek, String adres,String email,
Long pesel,Integer iloscGodzin,String formaZal,
String nazwaKierun,Integer wRoku,String stopienNauk,String przedmiot){
super (identyfikator,imie,nazwisko,wiek,adres,email,pesel,formaZal,nazwaKierun,wRoku);
        this.stopienNauk=stopienNauk;
        this.przedmiot=przedmiot;
        this.przedmiotIndeks= przedmiotIndeks;//definiuje pozycje oceny w tablicy
                }

    String getStopienNauk(){ return stopienNauk; }
}
