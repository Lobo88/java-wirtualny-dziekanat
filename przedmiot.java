// jaki przedmiot , forma zaliczenia(zal badz ocena),ilosc godzin przemiotu w semestrze
//do jakiego kierunku przedmiot jest 
//ocena z przedmiotu
package rozwiazanie;

import java.util.ArrayList;
import java.util.List;

public class przedmiot 
{ public String Matematyka;
public String PodstawyZarzadzania;
public String Ekonomia;
public String Etyka;
public String Fizyka;
public String Programowanie;

    public przedmiot(){
        this.Matematyka="Matematyka";
        this.PodstawyZarzadzania="Podstawy Zarządzania";
        this.Ekonomia="Ekonomia";
        this.Etyka="Etyka";
        this.Fizyka="Fizyka";
        this.Programowanie="Programowanie";
    }
  // public String przedmiot; 
  public Integer iloscGodzin;// godzin przedmiotu na semestr
String [] przedmiotyZ1 = {"Matematyka","Podstawy Zarządzania","Ekonomia","Etyka","Socjologia","Informatyka"};
String [] przedmiotyZ2 = {"Matematyka2","Statystyka","Rachunkowość","Zachowania Organizacyjne","Język Angielski"};
String [] przedmiotyZ3 = {"Rachunkowość2","Negocjacje","Finanse","Seminarium dyplomowe","Marketing","Prawo","Praktyka zawodowa"};
String [] informatykaI1 = {"Matematyka","Fizyka","Programowanie","Podstawy Zarządzania","Systemy Informatyczne"};
String [] informatykaI2 = {"Programowanie2", "Grafika","Matematyka2","Sieci komputerowe","Bazy Danych","Język Angielski"};
String [] informatykaI3 = {"Inżynieria oprogramowania","Aplikacje WWW","Algorytmy","Statystyka","Praktyka zawodowa","Seminarium dyplomowe"};
String [] pedagogika1 = {"Emisja i higiena głosu","Statystyka","Psychologia","Podstawy filozofii","Socjologia"};
String [] pedagogika2 = {"Język Angielski","Pedagogika społeczna","Psychologia społeczna","Praca socjalna"};
String [] pedagogika3 = {"Psychologia rodziny","Socjoterapia","Praktyka zawodowa","Seminarium dyplomowe"};

public void getprzedmiot(String x){
         if (x.equals("za2")) {
System.out.println("Matematyka2    "+"Statystyka     "+"Język Angielski "+"Rachunkowość "+"Zach Organ ");}
      else if (x.equals("pe1")) {
System.out.println( "Emisja głosu  "+"Statystyka     "+"Psychologia   "+"Pods filozofii "+"Socjologia   ");}
else if (x.equals("za1")) {
System.out.println("Matematyka    "+"Pods Zarządz    "+"Ekonomia         "+"Etyka     "+"Socjologia       "+"Informatyka");}
else if (x.equals("za3")) {
System.out.println("Negocjacje    "+"Finanse         "+"Marketing         "+"Prawo     "+"Rachunkowość2    "+"Praktyka zawodowa  "+"Seminarium dyplomowe");}
else if (x.equals("pe2")) {
System.out.println("Język Angielski "+"Peda społeczna "+"Psych społeczna  "+"Praca socjalna");}
else if (x.equals("pe3")) {
System.out.println("Socjoterapia    "+"Psych rodziny "+"Praktyka zawodowa "+"Seminarium dyplomowe");}
else if (x.equals("in1")) {
System.out.println("Matematyka "    +"Pods Zarządzania "+"Ekonomia        "+"Etyka     "+"Socjologia        "+"Informatyka");}
else if (x.equals("in2")) {
System.out.println("Matematyka2    "+"Programowanie2  "+"Język Angielski "+"Grafika    "+"Sieci komputerowe "+"Bazy Danych");}
else if (x.equals("in3")) {
System.out.println("Inż oprogram   "+"Statystyka      "+"Aplikacje WWW   "+"Algorytmy  "+"Praktyka zawodowa "+"Seminarium dyplomowe");}
}

        
    public String[] getInformatykaI1() {
        return informatykaI1;
    }

}
