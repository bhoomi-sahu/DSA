import java.util.*;


public class Sunarr {
public static void PntSubArr(int num[]){
    int totalsubarr=0;
    for(int i=0; i<num.length; i++){
        int start = i;

        for(int j=0; j<num.length; j++){
            int end = j;

            for(int k=start; k<=end; k++){
                System.out.print(num[k] +" ");
              
            }
              totalsubarr++; 
              System.out.println();
        }
        System.out.println();

    }
    System.out.print("total subarr=" + totalsubarr);
}    

public static void main (String[]args){
    int num[] =  {4,5,6,7,8,9,3,2,5};
    PntSubArr(num);
}
}
