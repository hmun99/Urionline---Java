
package urionline_33;

import java.util.Scanner;


public class UriOnline_33 {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a,b,c,d;
      a = sc.nextInt();
      b = sc.nextInt();
      c = b-a;
      if(c<0){
        c = 24+c;
        System.out.printf("O JOGO DUROU %d HORA(S)\n",c);
      }
      else if(a == b){
          System.out.printf("O JOGO DUROU 24 HORA(S)\n");
    }
     else{
        System.out.printf("O JOGO DUROU %d HORA(S)\n",c);
    }
      
    }
    
}
