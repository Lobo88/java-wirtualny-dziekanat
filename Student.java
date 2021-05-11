//adnotacja zaliczeniowa 
//zaliczenie jest albo nie ma, dotyczy albo nie dotyczy
//kolejne pole to ocena 
package rozwiazanie;

public class Student extends Osoba{
    public Integer nrIndeksu;
   
   public int []ocenaZ1;
   public String przedmioty;
   public int nr;
   public Integer wRoku;
 /*   private String tryb;
    private Integer oplata;
    private Integer raty;
    private Integer czesne;
     private String stypendia; //tak lub nie i od tego odliczana kwota np 500 
*/ 

  
   //String imie,String nazwisko,Integer wiek, String adres,String email,
//Long pesel,String przedmiot,Integer iloscGodzin,String formaZal,
//String nazwaKierun,Integer wRoku,Integer nrIndeksu,
    public Student (int nr,String identyfikator,String przedmioty,
int ocenaZ1,String imie,String nazwisko,Integer wiek, String adres,String email,
Long pesel,String formaZal,String nazwaKierun,Integer wRoku,Integer nrIndeksu){
 super (identyfikator,imie,nazwisko,wiek,adres,email,pesel,formaZal, 
 nazwaKierun,wRoku);
       this.nrIndeksu=nrIndeksu;
        zaliczeniePrzedmiotu m = new zaliczeniePrzedmiotu ();
       this.przedmioty=przedmioty;//m.getPrzedmiotZ1();
       this.ocenaZ1=m.getOcenaz2();
       this.nr=nr;
    this.wRoku=wRoku;
               }
    Integer getNrKarty()
    { return nrIndeksu; }

    @Override
    public String toString() {
        return "Imię: "+imie+", Nazwisko: "+nazwisko+", wiek: "+wiek+", adres: "+
 adres+", email"+email+", pesel: "+pesel+"+\",ocena\"+ocena;, przedmiot: "+", formaZal"+formaZal+
      "nr indeksu"+nrIndeksu;}
    public String toString2() {
        return "imie"+imie;
    }
    }
    

