
package urionline_36;
import java.io.IOException;
import java.util.Scanner;

public class UriOnline_36 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String a = sc.next();
      String b = sc.next();
      String c = sc.next();
     
      if (a.equals("vertebrado")  && b.equals("ave") && c.equals("carnivoro")) {
       System.out.print("aguia\n");
  }
      else if (a.equals("vertebrado") && b.equals("ave") && c.equals("onivoro")) {
      System.out.print("pomba\n");
  }
    else if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("onivoro")) {
       System.out.print("homem\n");
  }
    else if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("herbivoro")) {
        System.out.print("vaca\n");
  }
    else if (a.equals("invertebrado") && b.equals("inseto") && c.equals("hematofago")) {
      System.out.print("pulga\n");
  }
    else if (a.equals("invertebrado") && b.equals("inseto") && c.equals("herbivoro")) {
      System.out.print("lagarta\n");
  }
    else if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("hematofago")) {
       System.out.print("sanguessuga\n");
  }
    else if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("onivoro")) {
   System.out.print("minhoca\n");
  }
      
    }
    
}
