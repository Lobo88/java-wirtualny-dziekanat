//wykladowca ma mozliwosc ustawienia zaliczenia przedmiotu
//student mozliwosc wyświetlenia statusu zaliczenia
package rozwiazanie;

public class zaliczeniePrzedmiotu  {
    //   public String formaZal; //zal lub ocena
    //  public int ocena;
   int  i2[] = new int [6];
    int  i3[] = new int [4];   //+2 zal
    int  z1[] = new int [6];
public zaliczeniePrzedmiotu (){
    int [] is10 = {1,13};
     // String[] is10 = {"1","13","7","29","48","15"};
}

     public int [] i1z2p1 (int a,int b,int c,int d,int e){
         int  [] oc = {a,b,c,d,e};
return oc;}
 
  public String ic (String x){
      x="0";
        zaliczeniePrzedmiotu m = new zaliczeniePrzedmiotu();
    return null;
  }
 /*   public zaliczeniePrzedmiotu(int s) {//tworzymy liste ocen nowa 
 zaliczeniePrzedmiotu m = new zaliczeniePrzedmiotu(s);
 int piatki[] = new int [s];
    }*/
    public String dajformaZal(String x){
        if (x.equals("zal")){
        return "zal";
        }
        if(x.equals("ocena")){
            return "ocena";}
        else {
                System.out.println("źle wpisales");
                }
           return null;}

    public int getOcenaz1(int []x)
    {
        //zaliczeniePrzedmiotu m = new zaliczeniePrzedmiotu ();
   /*     int Stopien =m.Stopien;int Stopien2 =m.Stopien;int Stopien3 =m.Stopien;
    int Stopien4 =m.Stopien;  int Stopien5 =m.Stopien; 
return Stopien+"  "+Stopien2+"  "+Stopien3+"  "+Stopien4+"  "+Stopien5;*/
    //int []ms=  {4,0,5,0,1,7};
        
    for (int i = 0; i <5; i+=1){
       System.out.println("Kolejna komórka to: " +x[i]);}
    int[] c = {x[0],x[1]};
    return  c[0];}
    
    public int[] getOcenaz2()
    { int []ms= new int [5];
return ms;
    }
  
public int [] zmien(int x[])
{
	return x;
    
}
 public void setZmienOcene(int r)
  {ocena += r;}
    //albo tak


}
