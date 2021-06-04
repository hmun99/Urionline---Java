
package urionline_42;

import java.util.Scanner;


public class UriOnline_42 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int a,b,c,d,e,f,g,h,x,y,z,m,n;
      String i = sc.next();
      a = sc.nextInt();
      
      b = sc.nextInt();
      
      String j = sc.next();
      c = sc.nextInt();
      
      String k = sc.next();
      d = sc.nextInt();
      
      String l = sc.next();
      e =  sc.nextInt();
      
      f = sc.nextInt();
      
      String o = sc.next();
      g =  sc.nextInt();
      
      String p = sc.next();
      h =  sc.nextInt();
      
      x =((e*86400)+(f*3600)+(g*60)+h) - ((a*86400)+(b*3600)+(c*60)+d);
      if(x <= 0){
          x = x+(24*3600);
      }
      y = x/86400;
      x = x%86400;
      z = x/3600;
      x = x%3600;
      m = x/60;
      n = x%60;
      System.out.printf("%d dia(s)\n",y);
      System.out.printf("%d hora(s)\n",z);
      System.out.printf("%d minuto(s)\n",m);
      System.out.printf("%d segundo(s)\n",n);
     
    }
    
}
