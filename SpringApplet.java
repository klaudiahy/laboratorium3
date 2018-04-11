public class SpringApplet extends javax.swing.JApplet {

    public void init() {  // przeciążona metoda init()


        Vector2D wektor1 = new Vector2D(5,20); //konstruktor z parametrami
        Vector2D wektor2 = new Vector2D(8, 14);

        Vector2D wektor3 = wektor1.Suma(wektor2);
        Vector2D wektor4 = wektor1.Roznica(wektor2);

        double dlSumy=wektor3.Dlugosc();
        double dlRoznicy=wektor4.Dlugosc();

        Vector2D wektor5 = wektor1.Iloczyn(2);

        //wyśweitlenie wyniku działania Vector2D
        System.out.println("dlugosc wektora 1: "+wektor1.Dlugosc()+" wspólrzędne x="+wektor1.x+" i y="+wektor1.y);
        System.out.println("dlugosc wektora 2: "+wektor2.Dlugosc()+" wspólrzędne x="+wektor2.x+" i y="+wektor2.y);
        System.out.println("dlugosc wektora 3: "+dlSumy+" wspólrzędne x="+wektor3.x+" i y="+wektor3.y);
        System.out.println("dlugosc wektora 4: "+dlRoznicy+" wspólrzędne x="+wektor4.x+" i y="+wektor4.y);
        System.out.println("dlugosc wektora 5: "+wektor5.Dlugosc()+" wspólrzędne x="+wektor5.x+" i y="+wektor5.y);
    }



    public void paint() { // przeciążona metoda paint()

    }

}
