import static java.lang.Math.abs;

public class Styczna {
    double a, b, x, px, ep, wynik;
    int i = 0;

    public Styczna(double a, double b, double ep) {
        this.a = a;
        this.b = b;
        this.ep = ep;

        if((fp(a) * fp(b) >= 0) && (fpp(a)*fpp(b) >= 0)){
            System.out.println("Warunki zbieżności nie spełnione!");
        }
        licz();
        System.out.println("Iteracja: " + i);
        System.out.println(wynik);
    }

    void licz(){
        if((fpp(a) > 0 && f(a) > 0) || (fpp(a) < 0 && f(a) < 0)){
            x = a;
        }
        else{
            x = b;
        }
        while(true){
            i++;
            px = x;
            x = x - (f(x)/fp(x));
            if(abs(f(x)) < ep || abs(x - px) < ep){
                break;
            }
        }
        wynik = x;
    }


    double f(double x){
        return 6 * (x*x + x - 8);
    }
    double fp(double x){
        return 12*x + 1;
    }
    double fpp(double x){
        return 12;
    }
}
