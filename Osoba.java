 
package rozwiazanie;

public class Osoba {
   public String imie;
    public String nazwisko;
    public Integer wiek;
    public String adres;
    public String email;
    public Long pesel;
   public String formaZal;
   public String identyfikator;
   public String nazwaKierun;
    public Osoba(String identyfikator,String imie,String nazwisko,Integer wiek, String adres,String email,
            Long pesel,String formaZal,String nazwaKierun,Integer wRoku){
        this.identyfikator=identyfikator;
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
        this.adres = adres;
        this.email=email;
        this.pesel=pesel;
        this.nazwaKierun=nazwaKierun;
    }
    String getIdentyfikator(String x){ return identyfikator;}
    String getImie(){ return imie; }
    String getNazwisko(){ return nazwisko; }
    Integer getWiek(){ return wiek; }
    String getAdres(){ return adres; }
    String getEmail(){return email;}
    Long getPesel(){ return pesel; }
}
 