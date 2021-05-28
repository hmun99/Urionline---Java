
package urionine_22;

import java.util.Scanner;


public class UriOnine_22 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double note = sc.nextDouble();
        double E;
        int N,a,b,c,d,e,f,g,h,i,j,k,l,B,m,n,o,p,q,r,s,t,u;
        System.out.printf("NOTAS: \n");
        
         N =(int) note;
         a = N/100;
         System.out.printf("%d nota(s) de R$ 100.00\n",a);
         b = N%100;
    
         c = b/50;
         System.out.printf("%d nota(s) de R$ 50.00\n",c);
         d = b%50;
    
         e = d/20;
         System.out.printf("%d nota(s) de R$ 20.00\n",e);
         f = d%20;
    
         g = f/10;
         System.out.printf("%d nota(s) de R$ 10.00\n",g);
         h = f%10;
    
         i = h/5;
         System.out.printf("%d nota(s) de R$ 5.00\n",i);
         j = h%5;
    
         k = j/2;
         System.out.printf("%d nota(s) de R$ 2.00\n",k);
         l = j%2;
         
         System.out.printf("MOEDAS:\n");
        
         
         
         System.out.printf ("%d moeda(s) de R$ 1.00\n",l);
         E = note*100;
         B =(int) E;
         m = B%100;
         
         n = m/50;
         System.out.printf("%d nota(s) de R$ .50\n",n);
         o = m%50;
    
         p = o/25;
         System.out.printf("%d nota(s) de R$ .25\n",p);
         q = o%25;
    
         r = q/10;
         System.out.printf("%d nota(s) de R$ .10\n",r);
         s = q%10;
    
         t = s/5;
         System.out.printf("%d nota(s) de R$ .05\n",t);
         u = s%5;
         System.out.printf("%d nota(s) de R$ .01\n",u);

    }
    
}
