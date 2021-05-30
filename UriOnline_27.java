
package urionline_27;

import java.util.Scanner;


public class UriOnline_27 {

   
    public static void main(String[] args) {
        float a,b,c,d,x,y,z;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();
        y = ((a*2)+(b*3)+(c*4)+(d*1))/(2+3+4+1);
       System.out.printf("Media: %.1f\n",y);
        if(y >= 7.0){
           System.out.printf("Aluno aprovado.\n");
        }
        else  if(y >= 5.0){
            x = sc.nextFloat();
           System.out.printf("Aluno em exame.\n");
           System.out.printf("Nota do exame: %.1f\n",x);
           z = (x+y)/2;
            if (z >= 5.0){
            System.out.printf("Aluno aprovado.\n");
               System.out.printf("Media final: %.1f\n",z);
            }
            else if(z <= 4.9){
               System.out.printf("Aluno reprovado.\n");
               System.out.printf("Media final: %.1f\n",z);
            }
            }
         else {
           System.out.printf("Aluno reprovado.\n");
         
        }
         }
        
    }

    

