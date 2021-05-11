
package rozwiazanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class Aprogram {
String [] plan ={"*************************************************************"+"\n"+
        "  Kierunek Informatyka1 "+"\t"+"\t"+"\t"+"Dnia: 21.2.2018"+"\n"+
        "  Matematyka 9:00   Fizyka 12:15     Programowanie 14:00"+"\n"+
        "*************************************************************"};


    public Aprogram() {
        
};
    public static void main(String[] args) {
           Scanner odczyt = new Scanner(System.in);
     //       zaliczeniePrzedmiotu is3 = new zaliczeniePrzedmiotu ();
  //is3.getPrzedmiotZ1();
   //is3.getOcenaz1();
Student is1 = new Student(0,"is1","in2",2/*is3.getOcenaz1()*/,"Tomasz","Garza",29,
"Strzegomska 44","tom@O2.pl",88011614050L,"zal","Informatyka2",2,12312);
Student is2 = new Student(1,"is2","in2",2,"Marta","Gawruluk",26,"Wolnosci 4","mar@O2.pl"
,83011231150L,"zal","Informatyka2",2,21312);
Student is3 = new Student(2,"is3","in1",2,"Micha³","Kanciarz",20,
"Kurska 24","mich@O2.pl",90055614650L,"zal","Informatyka1",1,32312);
Student is4 = new Student(3,"is4","in1",2,"Joanna","Parsa",22,
"Litomska 12","Joana@O2.pl",12011234050L,"zal","Informatyka1",1,98312);
Student is5 = new Student(4,"is5","in3",2,"Przemek","Wiking",19,
"Wodowa 94","Prze@O2.pl",12011614050L,"zal","Informatyka3",3,92312);
Student is6 = new Student(5,"is6","in3",2,"Kinga","Dziubek",30,
"Raclawska 32","kin@O2.pl",43011614050L,"zal","Informatyka3",3,65312);
Student is7 = new Student(6,"is7","za1",2,"Marcin","Walek",31,
"Klucza 21","Mar@O2.pl",40011614050L,"zal","Zarzadzanie1",1,70312);
Student is8 = new Student(7,"is8","za1",2,"Iwona","Jaka",31,
"Mucza 1","Iw@O2.pl",50011614050L,"zal","Zarzadzanie1",1,75312);
Student is9 = new Student(8,"is9","za2",2,"Robert","Zdach",35,
"Wucza 2","Rober@O2.pl",12011614050L,"zal","Zarzadzanie2",2,12312);
Student is10 = new Student(9,"is10","za2",2,"Marzena","Lalek",27,
"Bocka 12","Marz@O2.pl",79011614050L,"zal","Zarzadzanie2",2,70312);
Student is11 = new Student(10,"is11","za3",2,"Pawel","Jacht",26,
"Miektow 9","Paw@O2.pl",65411614050L,"zal","Zarzadzanie3",3,46312);
Student is12 = new Student(11,"is12","za3",2,"Sandra","Mala",31,
"Kaczki 23","San@O2.pl",64511614050L,"zal","Zarzadzanie3",3,95312);
Student is13 = new Student(12,"is13","pe1",2,"Bartek","Gral",21,
"Krajowa 23","Bar@O2.pl",65111614050L,"zal","Pedagogika1",1,20312);
Student is14 = new Student(13,"is14","pe1",2,"Krystyna","Sala",35,
"Jutra 1","Kry@O2.pl",4561614050L,"zal","Pedagogika1",1,05312);
Student is15 = new Student(14,"is15","pe2",2,"Bogdan","Tala",25,
"Sloneczna 3","Bog@O2.pl",4561699050L,"zal","Pedagogika2",2,02312);
Student is16 = new Student(15,"is16","pe2",2,"Katarzyna","Wicher",32,
"Basenowa 32","Kas@O2.pl",4561614120L,"zal","Pedagogika2",2,01312);
Student is17 = new Student(16,"is17","pe3",2,"Jacek","Witkowski",35,
"Futra 3","Jacek@O2.pl",499615050L,"zal","Pedagogika3",3,20812);
Student is18 = new Student(17,"is18","pe3",2,"Monika","Zamach",25,
"Jgurtowa 12","Monika@O2.pl",4564444050L,"zal","Pedagogika3",3,63312);
Student[] listaS = {is1,is2,is3,is4,is5,is6,is7,is8,is9,is10,is11,is12,is13,is14,
is15,is16,is17,is18};
////////////////////////////////////////////////////////////////////////////////
 Wykladowca wy1 = new Wykladowca ("wy1",3,"Jan","Niezbedny",21,"Miedzyczas 23",
    "jan@o2.pl",71912314412L,4,"ocena","Informatyka2",2,"Profesor","Grafika");
Wykladowca[] listaW = {wy1};
 zaliczeniePrzedmiotu  []x= {};//new zaliczeniePrzedmiotu[5]

  zaliczeniePrzedmiotu m = new zaliczeniePrzedmiotu ();
        int []ocenaI2=m.i1z2p1(2,3, 3, 3, 5);//wstaw oceny
       is1.ocenaZ1=ocenaI2;//wstaw uczniowi tablice ocen
         int []ocenaI22=m.i1z2p1(5,3, 3, 3, 3);
       is2.ocenaZ1=ocenaI22;
      int []ocenaI3=m.i1z2p1(2,2, 2,2, 2);
       is5.ocenaZ1=ocenaI3;
         int []ocenaI32=m.i1z2p1(5,4, 3, 2, 2);
       is6.ocenaZ1=ocenaI32;
      int []ocenaZ2=m.i1z2p1(2,3, 3, 3, 5);
       is9.ocenaZ1=ocenaZ2;
         int []ocenaZ22=m.i1z2p1(5,3, 3, 3, 2);
       is10.ocenaZ1=ocenaZ22;
      int []ocenaZ3=m.i1z2p1(5,5, 5, 3, 5);
       is11.ocenaZ1=ocenaZ3;
         int []ocenaZ32=m.i1z2p1(5,3, 2, 4,4);
       is12.ocenaZ1=ocenaZ32;
      int []ocenaP2=m.i1z2p1(2,4, 3, 2, 4);
       is15.ocenaZ1=ocenaI2;
         int []ocenaP22=m.i1z2p1(3,5, 5, 2, 2);
       is16.ocenaZ1=ocenaI22;
      int []ocenaP3=m.i1z2p1(2,3, 5, 5, 5);
       is17.ocenaZ1=ocenaI2;
         int []ocenaP32=m.i1z2p1(5,4, 2, 5, 2);
       is18.ocenaZ1=ocenaI22;

    /*    przedmiot s = new przedmiot ();
        s.getprzedmiot(is2.przedmioty);
       */


        /*for(Student p: listaS)
            System.out.println(p);
Kierunek k = new Kierunek();
System.out.println(k.getkierunek("informatyka"));*/
////////////////////////////////////////////////////////////////////////////////
/*Dziekanat h=new Dziekanat();
  int []zaz=(is2.ocenaZ1);//pobierz oceny
  h.sredniaOcen(zaz, is2.nazwaKierun);
System.out.println(h);*/



 boolean program = true;
        while(program){

System.out.println("1.loguj nauczycielu  : 2.loguj studenta  3.Dziekanat");
       int wybor= odczyt.nextInt();

switch (wybor) {// switch g³owny
case 1: //nauczyciel

        System.out.println("Zaloguj sie profesor 1");
        System.out.println("Wprowadz swoj identyfikator : ");
       String  wybor22= odczyt.next();
String konto =wybor22;
        for (int i=0; i<listaW.length; i++) {
if (listaW[i].identyfikator.equals(wybor22)) {
    System.out.println("witaj " +listaW[i].imie+" "+listaW[i].nazwisko);
System.out.println("Co chcesz zrobic: 1.Dodaj/zmien ocene 2. pokaz swoje dane"
+ " 3.Poka¿ zapisanych studentow do mojej grupy"+"\n"+"4.Skrzynka pocztowa");}
 wybor= odczyt.nextInt();
if (wybor==1){
        System.out.println("Dodaj/ zmien ocene : ");
        System.out.println("Wprowadz Studenta jego nazwisko : ");
        String wybor222= odczyt.next();
        for (int j=0; j<listaS.length; j++) {
        if (listaS[j].nazwisko.equals(wybor222)) {
System.out.println("Uczen "+listaS[j].imie+" "+listaS[j].nazwisko+" nr indeksu "+listaS[j].nrIndeksu);
System.out.println("haslo do zatwierdzenia oceny : " +listaS[j].nr);
System.out.println("Wprowadz ocene z przedmiotu: "+listaW[i].przedmiot+":");
        wybor= odczyt.nextInt();
       int a =listaW[i].przedmiotIndeks ;//definiuje pozycje oceny w tablicy
        int[] z = listaS[j].ocenaZ1;
        z[a]=wybor;
        listaS[j].ocenaZ1=z.clone();//albo zamo = z;

          break;}}}
        else if (wybor == 2){
            System.out.println("Poka¿ mi dane o sobie: ");
 break;}
 else if (wybor == 3){
            System.out.println("Studenci zapisani na Twoj przedmiot:  "+listaW[i].przedmiot);
            for (int j=0; j<listaW.length; j++) {
        if (listaW[j].identyfikator.equals(konto)) {
        for (int c=0; c<listaS.length; c++){
     if(listaS[c].nazwaKierun.equals(listaW[j].nazwaKierun))
         System.out.println(listaS[c].nazwisko);
        }
     }
            }
 break;}
        program=true;
break;
}//koniec  pierwszego w g³ownym
break;

case 2://glowny 2
    System.out.println("Zaloguj siê Studencie :"+"\n"+"Wprowadz identyfikator");
    System.out.println("haslo mniejsze o jeden np is14 h:13");
           String wyb= odczyt.next();
           System.out.println("haslo");
           int haslo=odczyt.nextInt();
           //x = Console.read
           //  if (wybor2.equals(is1.identyfikator)){
            //      System.out.println("udalo sie :");
           for (int i=haslo; i<listaS.length; i++) {
if (listaS[haslo].identyfikator.equals(wyb)){
System.out.println("Odnaleziono element "+i);
System.out.println("witaj " +listaS[i].imie+" "+listaS[i].nazwisko);
System.out.println("Co chcesz zrobic: 0.Zobacz oceny. 1.Napisz wiadomosc do dziekanatu"
        + "\n"+" 2.Napisz wiadomosc do wykladowcy 3.Zobacz plan zajêæ "+"\n"+
        "4.Zobacz ogloszenia");}
int wybor3= odczyt.nextInt();
 if (wybor3 == 0){
    int v = listaS[i].nr;
    int[] w = listaS[v].ocenaZ1;
    String c = listaS[i].przedmioty;
      przedmiot prz = new przedmiot ();
       prz.getprzedmiot(c);
for (int u=0; u<5; u++){
            System.out.print("     "+w[u]+"        " );}
System.out.print("\n");
    break;
             }program=true;
           break; } break;
           default:
      System.out.println("nieprzewidziana sytuacja");
 break;
case 3:
System.out.println("Co chcesz zrobiæ: "+
        "\n"+"0.Plan lekcji. "+"\n"+"1.Pokaz srednia ocen studentow z "
        + "roku i kierunku"+"\n"+"2.pokaz zestawienie srednich wszystkich "
+ "kierunkow z danego roku  "+ "\n"+"3.Pokaz iloœæ studentow"+"\n"+"4.Pokaz "
        + "studenta z najlepsza ocena z danego przedmiotu");
         int wybor3= odczyt.nextInt();
  if (wybor3 == 0){
  System.out.println(" 1.Stworz plan zajec 2.Pokaz plany zajec.");
  int wybor399= odczyt.nextInt();
if (wybor399 == 1){
       System.out.println("Wprowadz Date: ");
      String wybor400= odczyt.next();
 String a= wybor400;
      System.out.println("Wprowadz nazwe kierunku: ");
       wybor400= odczyt.next();
 String b=wybor400;
System.out.println("ile przedmiotow dla tego kierunku chcesz wprowadzic: ");
      wybor399= odczyt.nextInt();
      String [] c=new String [wybor399];
      String e = "blad poprawic4444444444";
for (int i=0;i<wybor399;i++){
      System.out.println("Wprowadz przedmiot i przedzial godzinowy: ");
       wybor400= odczyt.next();
       e=e+wybor400;
       c[i] = wybor400;}
Dziekanat plan =new Dziekanat();
plan.dodajPlan(a, b, e);
String ff=a+b +e;
 System.out.println(ff);
 
  }
  if (wybor399 == 2){
      Aprogram pokaz= new Aprogram();
       System.out.println(Arrays.toString(pokaz.plan));
       Dziekanat plan =new Dziekanat();
      plan.pokazPlan();
      
  }
  }
              else if (wybor3 == 1){
        System.out.println("Wpisz ktory rok i kierunek Cie interesuje np Informatyka2");
            String opcja= odczyt.next();
            for (int i=0; i<listaS.length; i++) {
if (listaS[i].nazwaKierun.equals(opcja)){
    Dziekanat h=new Dziekanat();
  int []zaz=(listaS[i].ocenaZ1);//pobierz oceny
 System.out.print(listaS[i].imie+ ":   ");
  h.sredniaOcen(zaz, opcja);
}
        program=true;}
             break;}

            else if (wybor3 == 2){
     System.out.println("Srednia wszystkich uczniow na kierunku Informatyka :");{
for (int z=0; z<listaS.length; z++) {
if (listaS[z].nazwaKierun.equals("Informatyka1")||listaS[z].nazwaKierun.equals
("Informatyka2")||listaS[z].nazwaKierun.equals("Informatyka3")){
 System.out.print(listaS[z].imie+"  ");
 Dziekanat h=new Dziekanat();
 int []zaz=(listaS[z].ocenaZ1);
 h.sredDlaKier(zaz,"Informatyka");}}

 System.out.println("Srednia wszystkich uczniow na kierunku Zarzadzanie:");{
for (int za=0; za<listaS.length; za++) {
 if (listaS[za].nazwaKierun.equals("Zarzadzanie1")||listaS[za].nazwaKierun.equals
("Zarzadzanie2")||listaS[za].nazwaKierun.equals("Zarzadzanie3")){
 System.out.print(listaS[za].imie+"  ");
 Dziekanat b=new Dziekanat();
 int []zaz2=(listaS[za].ocenaZ1);
 b.sredDlaKier(zaz2,"Zarzadzanie");}}}

 System.out.println("Srednia wszystkich uczniow na kierunku Pedagogika:");{
for (int za=0; za<listaS.length; za++) {
 if (listaS[za].nazwaKierun.equals("Pedagogika1")||listaS[za].nazwaKierun.equals
("Pedagogika2")||listaS[za].nazwaKierun.equals("Pedagogika3")){
 System.out.print(listaS[za].imie+"  ");
 Dziekanat b=new Dziekanat();
 int []zaz2=(listaS[za].ocenaZ1);
 b.sredDlaKier(zaz2,"Pedagogika");}break;}
} program=true;
             break;}}
  else if (wybor3 == 3){


 System.out.println("liczba wszystkich studnentow = "+listaS.length);
 System.out.println("podaj rok i kierunek jaki Cie interesuje np Informatyka1");
String wybor21=odczyt.next();
Dziekanat c=new Dziekanat ();
int jsa =0;
System.out.print("liczba wszystkich studnentow na "+wybor21+":  ");
for (int l=0; l<listaS.length; l++) {
 if (listaS[l].nazwaKierun.equals(wybor21)){
jsa=jsa+c.licznik(wybor21);
}
}System.out.print(jsa);
program=true;
System.out.println();
             break;
 }

     else if (wybor3 == 4){
    System.out.print("podaj kierunek jaki Cie interesuje 1.Informatyka rok drugi"
            + " 2.Informatyka rok trzeci");
     int wybor5= odczyt.nextInt();
if (wybor5 == 1){
        przedmiot h =new przedmiot();
      h.getprzedmiot("in2");
System.out.println("podaj ktory przedmiot: np 1");
int wybor54= odczyt.nextInt();
//  int przedmiot = h.Matematyka;//zrobic funkcje zczytujaca wartosci
//Matematyka i inne z roku przedmioty wyrzucajac wartosc czyli miejsce w tablicy
       for (int l=0; l<listaS.length; l++) {
 if (listaS[l].nazwaKierun.equals("Informatyka2")) {
           int[] w = listaS[l].ocenaZ1;
           System.out.println(listaS[l].imie+" "+w[wybor54]);}
}
                     }
if (wybor5==2){
     przedmiot h =new przedmiot();
      h.getprzedmiot("in3");
    System.out.println("podaj ktory przedmiot: np 1");
int wybor54= odczyt.nextInt();
Dziekanat d= new Dziekanat();
     for (int l=0; l<listaS.length; l++) {
if (listaS[l].nazwaKierun.equals("Informatyka3")){
    int i=0;
    int []licznik=new int [2];
           int[] w = listaS[l].ocenaZ1;
            licznik[i]=w[wybor54];
            int a =licznik[0];
            int b= licznik[1];
           System.out.println (listaS[l].imie+" "+w[wybor54]);
           System.out.println (licznik[i]);i++;
System.out.println (d.najwyzszaOcena(a, b));}
     }
                }
}}
     program=true;}}
    }