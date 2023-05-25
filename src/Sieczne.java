import static java.lang.Math.abs;

public class Sieczne {
    double a, b, ep, x, px, wynik;
    int i = 0;
    boolean isAStatic;

    public Sieczne(double a, double b, double ep) {
        this.a = a;
        this.b = b;
        this.ep = ep;

        licz();
        System.out.println("Iteracja: " + i);
        System.out.println(wynik);
    }
    void licz(){

        if(f(a) > 0 && fpp(a) > 0){
            x = b;
            isAStatic = false;
        }
        else if(f(b) > 0 && fpp(b) > 0) {
            x = a;
            isAStatic = true;
        }
        while(true){
            i++;
            px = x;
            if(isAStatic){
                x = px - ( f(px) / (f(b) - f(px) ) * (b - px) );
            }
            else{
                x = px - ( f(px) / (f(px) - f(a) ) * (px - a) );
            }
            if(abs(f(x)) < ep || abs(f(x) - f(px)) < ep){
                break;
            }

        }
        wynik = x;
    }
    double f(double x){
        return 6 * (x*x + x - 8);
    }
    double fpp(double x){
        return 12;
    }

}
