
package urionline_24;

import java.util.Scanner;
import java.lang.Math;


public class UriOnline_24 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        double a,b,c,y,z;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if((a == 0) || ((b*b)-(4*a*c)) < 0){
            System.out.print("Impossivel calcular\n");
        }
        else {
            y = (float) (((-b) + Math.sqrt((b*b)-(4*a*c)))/(2*a));
            z = (float) (((-b) - Math.sqrt((b*b)-(4*a*c)))/(2*a));
            
            System.out.printf("R1 = %.5f\n",y);
            System.out.printf("R2 = %.5f\n",z);
        }
    }
    
}
/*mport java.util.Scanner;



//Problem



public class URI_1036 {



 public static void main(String[] args) {

  float A, B, C, R1, R2;

  Scanner input =new Scanner(System.in);

  A = input.nextFloat();

  B = input.nextFloat();

  C = input.nextFloat();

  

  if ((A == 0) || (((B*B) -(4*A*C)) < 0)) {

   System.out.print("Impossivel calcular\n");

  }else {

   R1 =(float) ((-B + Math.sqrt(((B*B) -(4*A*C)))) / (2*A));

   R2 =(float) ((-B - Math.sqrt(((B*B) -(4*A*C)))) / (2*A));

   

   System.out.printf("R1 = %.5f\n", R1);

   System.out.printf("R2 = %.5f\n", R2);

  }

 }

}*/

