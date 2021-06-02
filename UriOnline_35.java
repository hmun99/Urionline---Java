
package urionline_35;

import java.util.Scanner;

public class UriOnline_35 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double a,b = 0,c = 0;
     a = sc.nextDouble();
     if(a >= 0 && a <= 400.00){
         b = (double)(a*.15);
         c = (double)(a+b);
        System.out.printf("Novo salario: %.2f\n",c);
        System.out.printf("Reajuste ganho: %.2f\n",b);
        System.out.print("Em percentual: 15%\n");
     }
     else if(a >= 400.01 && a <= 800.00){
         b = (double)(a*.12);
         c = (double)(a+b);
         System.out.printf("Novo salario: %.2f\n",c);
         System.out.printf("Reajuste ganho: %.2f\n",b);
         System.out.print("Em percentual: 12%\n");
     }
      else if(a >= 800.01 && a <= 1200.00){
         b = (double)(a*.10);
         c = (double)(a+b);
         System.out.printf("Novo salario: %.2f\n",c);
         System.out.printf("Reajuste ganho: %.2f\n",b);
         System.out.print("Em percentual: 10%\n");
        
     }
      else if(a >= 1200.01 && a <= 2000.00){
         b = (double)(a*.07);
         c = (double)(a+b);
         System.out.printf("Novo salario: %.2f\n",c);
         System.out.printf("Reajuste ganho: %.2f\n",b);
         System.out.print("Em percentual: 7%\n");
     }
      else if(a >= 2000.01){
         b = (double)(a*.04);
         c = (double)(a+b);
         System.out.printf("Novo salario: %.2f\n",c);
         System.out.printf("Reajuste ganho: %.2f\n",b);
         System.out.print("Em percentual: 4%\n");
     }
      
    }
    
}
