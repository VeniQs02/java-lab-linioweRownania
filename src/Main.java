public class Main {
    public static void main(String[] args) {
        double a = -6;
        double b = -1;
        double ep = 0.001;
        if(funkcja(a) * funkcja(b) < 0){
            Bisekcja bis = new Bisekcja(a, b, ep);
            Styczna sty = new Styczna(a, b, ep);
            Sieczne sie = new Sieczne(a, b, ep);
        }
        else{
            System.out.println("Warunek konieczny nie jest spełniony!");
        }
    }

    static double funkcja(double x){
         return 6 * (x*x + x - 8);
    }
}