
package rozwiazanie;

import java.util.ArrayList;
import java.util.List;

public class Dziekanat {
public Dziekanat(){
}
       List plan = new ArrayList();
      
public void sredniaOcen(int c[],String kierunek){
   double  []x={c[0],c[1],c[2],c[3],c[4]};
    double  a=x[0]; double  b= x[1];double  f=x[2];double  d=x[3];double  e=x[4];
    double wynik=(x[0]+x[1]+x[2]+x[3]+x[4])/5;
    if (kierunek.equals("Informatyka2")){
    System.out.println("Srednia ocen na 2 roku Informatyki wynosi "+wynik);}
    else if (kierunek.equals("Informatyka3")){
    System.out.println("Srednia ocen na 3 roku Informatyki wynosi "+wynik);}
    else if (kierunek.equals("Zarzadzanie2")){
    System.out.println("Srednia ocen na 2 roku Zarzadzania wynosi "+wynik);}
    else if (kierunek.equals("Zarzadzanie3")){
    System.out.println("Srednia ocen na 3 roku Zarzadzania wynosi "+wynik);}
    else if (kierunek.equals("Pedagogika2")){
    System.out.println("Srednia ocen na 2 roku Pedagogika wynosi "+wynik);}
     else if (kierunek.equals("Pedagogika3")){
    System.out.println("Srednia ocen na 3 roku Pedagogika wynosi "+wynik);}
}
public void sredDlaKier(int c[],String kierunek){
if(kierunek.equals("Informatyka")||kierunek.equals("Zarzadzanie")||
        kierunek.equals("Pedagogika")){
       double  []x={c[0],c[1],c[2],c[3],c[4]};
    double  a=x[0]; double  b= x[1];double  f=x[2];double  d=x[3];double  e=x[4];
    double wynik=(x[0]+x[1]+x[2]+x[3]+x[4])/5;
   System.out.println( wynik);
    if (wynik==0)System.out.println("student pierwszego roku nie ma ocen jeszcze");}
            }
public int licznik (String x){
int  z=0;
if ("Informatyka1".equals(x)){{z+=1;};return z;}
        
else if ("Informatyka2".equals(x)){{z+=1;};return z;}
else if ("Informatyka3".equals(x)){{z+=1;};return z;}
else if ("Zarzadzanie1".equals(x)){z+=1;};return z;
            
}
public int najwyzszaOcena (int oc1,int oc2){
 
              return   Math.max(oc1, oc2) ;
}

public String dodajPlan (String a,String b,String c){
    
    String y="*************************************************************"+"\n"+
        "  Kierunek "+a+"\t"+"\t"+"\t"+"Dnia:"+b+" 2018r"+"\n"+
        c+"\n"+"*************************************************************";
    Dziekanat h =new Dziekanat();
    String k ="malpa";
    
   plan.add(k);//zamist k dac c
System.out.println( y); //h.pokazPlan();//return k; dziala
        return "ok";}


public void pokazPlan (){
    for (int i=0;i<plan.size();i++){
        System.out.println(plan.get(i));}
}

}