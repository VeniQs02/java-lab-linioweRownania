import static java.lang.Math.abs;

public class Bisekcja {
    double a, b, ep, x, wynik;
    int i = 0;

    public Bisekcja(double a, double b, double ep) {
        this.a = a;
        this.b = b;
        this.ep = ep;

        licz();
        System.out.println("Iteracja: " + i);
        System.out.println(wynik);

    }
    void licz(){
        double ax = a;
        double bx = b;
        while(true){
            x = 0.5 * (ax + bx);
            i++;
            if(f(x) == 0){
                wynik = x;
                break;
            }
            else if(abs(f(x)) < ep){
                wynik = x;
                break;
            }
            else if(f(x)*f(a) < 0){
                bx = x;
            }
            else if(f(x)*f(a) >= 0){
                ax = x;
            }
        }
    }
    double f(double x){
         return 6 * (x*x + x - 8);
    }
}
