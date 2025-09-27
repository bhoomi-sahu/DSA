import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("enter elemrnt of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];


        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+ " ");
        }
    }

    
}
