
package uri.online_29;

import java.util.Scanner;


public class UriOnline_29 {


    public static void main(String[] args) {
        
       
    Scanner sc = new Scanner(System.in);
    int [] array = new int[3];
    int [] array1 = new int[3];
        for(int i = 0;i<3;i++){
            array[i] = sc.nextInt();
           }
           for(int i = 0;i<3;i++){
            array1[i] = array[i];
           }
        for (int i = 0;i<array.length;i++){
            for( int j = i+1; j< array.length; j++){
                 int temp = 0;
                 if( array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }    
        for (int i = 0;i<array1.length;i++){
            System.out.println(array1[i]);
        }  
    }
}
    

