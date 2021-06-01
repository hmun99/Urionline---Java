
package urionline_34;

import java.util.Scanner;


public class UriOnline_34 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a,b,c,d,x,y,z;
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      d = sc.nextInt();
      x = (((c*60)+d) - ((a*60)+b));
      if(x <= 0){
          x = x+(24*60);
      }
      y = x/60;
      z = x%60;
      System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",y,z);
     
    }
    
}
