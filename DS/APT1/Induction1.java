import java.lang.Math;
public class Induction1{
    public static void main(String[] args){
        for (double i = 1; i < 1000; i ++){
            Double a = 1.0;
            for (double j = 1; j <= i; j++){
                a *= (2*j - 1)/(2*j);
            }
            Double b = 1/Math.sqrt(3*i);
            System.out.println("a: " + a + "  b: " + b + "   a-b = " + (a-b));
        }
    }
}