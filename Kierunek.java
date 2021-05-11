
package rozwiazanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Kierunek {
    List lista = new ArrayList();
   przedmiot pt= new przedmiot();
String Zarzadzanie;
public Kierunek(){
    this.Zarzadzanie="Zarzadzanie1";
}
    public String getkierunek(String x){
        if (x=="informatyka")
return "Informatyka :"+"\n Rok 1: "+Arrays.toString(pt.informatykaI1)+"\n Rok 2: "+
 Arrays.toString(pt.informatykaI2)+"\n Rok 3: "+Arrays.toString(pt.informatykaI3);
        else if (x == "zarzadzanie")
return "Zarzadzanie : "+"\n Rok 1: "+Arrays.toString(pt.przedmiotyZ1)+"\n Rok 2: "+
Arrays.toString(pt.przedmiotyZ2)+"\n Rok 3: "+Arrays.toString(pt.przedmiotyZ3);
         else if (x == "pedagogika")
return "Pedagogika : "+"\n Rok 1: "+Arrays.toString(pt.pedagogika1)+"\n Rok 2: "+
Arrays.toString(pt.pedagogika2)+"\n Rok 3: "+Arrays.toString(pt.pedagogika3);
        return null;
    }
        public String getrok1(String x){
        if (x=="i")
return "Informatyka :"+"\n Rok 1: "+Arrays.toString(pt.informatykaI1)+"\n ";
        else if (x == "z")
return "Zarzadzanie : "+"\n Rok 1: "+Arrays.toString(pt.przedmiotyZ1)+"\n ";
         else if (x == "p")
return "Pedagogika : "+"\n Rok 1: "+Arrays.toString(pt.pedagogika1)+"\n  ";
        return null;
    }
 public String getrok2(String x){
        if (x=="i")
return "Informatyka :"+"\n Rok 2: "+Arrays.toString(pt.informatykaI2)+"\n ";
        else if (x == "z")
return "Zarzadzanie : "+"\n Rok 2: "+Arrays.toString(pt.przedmiotyZ2)+"\n ";
         else if (x == "p")
return "Pedagogika : "+"\n Rok 2: "+Arrays.toString(pt.pedagogika2)+"\n  ";
        return null;
    }
 public String getrok3(String x){
        if (x=="i")
return "Informatyka :"+"\n Rok 3: "+Arrays.toString(pt.informatykaI3)+"\n ";
        else if (x == "z")
return "Zarzadzanie : "+"\n Rok 3: "+Arrays.toString(pt.przedmiotyZ3)+"\n ";
         else if (x == "p")
return "Pedagogika : "+"\n Rok 3: "+Arrays.toString(pt.pedagogika3)+"\n  ";
        return null;}
 
 
 
}
