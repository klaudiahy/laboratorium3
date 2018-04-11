import static java.lang.Math.*;
public class Vector2D {

    public double x, y; // Publiczne pola współrzędnych wektora (x, y)
    public double dlugosc;
    double c, d;

    public Vector2D(){ //Konstruktor domyślny inicjujący pola klasy zerami
        x=0;
        y=0;
    }

    public Vector2D(double a, double b){ //Konstruktor z parametrami
        x=a;
        y=b;
    }


    public Vector2D Suma(Vector2D Obiekt) {//Metoda zwracająca sumę wektorów
        c=((this.x)+Obiekt.x);
        d=(this.y)+Obiekt.y;
        Vector2D Dodawanie= new Vector2D(c,d);
        return Dodawanie;
    }

    public Vector2D Roznica(Vector2D Obiekt) {//Metoda zwracająca różnicę wektorów
        c=((this.x)-Obiekt.x);
        d=((this.y)-Obiekt.y);
        Vector2D Odejmowanie= new Vector2D(c,d);
        return Odejmowanie;
    }

    public Vector2D Iloczyn(double k) {//Metoda zwracająca iloczyn wektora i stałej
        c=(this.x)*k;
        d=(this.y)*k;
        Vector2D Mnozenie= new Vector2D(c,d);
        return Mnozenie;
    }

    public double  Dlugosc() {//Metoda zwracająca długość wektora
        dlugosc= sqrt(pow(this.x,2)+pow(this.y,2));
        return dlugosc;
    }

    public Vector2D Normalizuj() {//Metoda zwracająca wektor będący znormalizowanym
        c=(this.x)/this.Dlugosc(); //wektorem dla którego została wywołana
        d=(this.y)/this.Dlugosc();
        Vector2D Normal= new Vector2D(c,d);
        return Normal;
    }

    }
