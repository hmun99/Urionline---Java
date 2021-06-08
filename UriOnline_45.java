
package urionline_45;

import java.util.Scanner;


public class UriOnline_45 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int i,e = 0,o = 0,p = 0,n = 0;
       float [] a = new float[6];
       for (i = 0; i<5;i++){
           a[i] = sc.nextFloat();
            }
      
     for (i = 0; i<5;i++){
           if (a[i]%2 == 0){
               e++;
           }
            }
     
     for (i = 0; i<5;i++){
           if (a[i]%2 != 0){
               o++;
           }
            }
     
     for (i = 0; i<5;i++){
           if (a[i]>0){
               p++;
           }
     }
          
     for (i = 0; i<5;i++){
           if (a[i]<0){
               n++;
           }  
     }
     
      System.out.printf("%d valor(es) par(es)\n",e);
      System.out.printf("%d valor(es) impar(es)\n",o);
      System.out.printf("%d valor(es) positivo(s)\n",p);
      System.out.printf("%d valor(es) negativo(s)\n",n);
    }
    
}
