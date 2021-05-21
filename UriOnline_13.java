
package urionline_13;

import java.util.Scanner;


public class UriOnline_13 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,pi = 3.14159;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double tri,cir,rec,sqr,trap;
        tri = .5*a*c;
        cir = pi*c*c;
        trap = ((a+b)/2)*c;
        sqr = b*b;
        rec = a*b;
        System.out.printf("TRIANGULO: %.3f\n",tri);
        System.out.printf("CIRCULO: %.3f\n",cir);
        System.out.printf("TRAPEZIO: %.3f\n",trap);
        System.out.printf("QUADRADO: %.3f\n",sqr);
        System.out.printf("RETANGULO: %.3f\n",rec);
    }
    
}
