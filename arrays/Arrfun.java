import java.util.*;
public class Arrfun {
    public static void Update(int marks[]){
    for(int i=0; i<marks.length; i++){
       marks[i] = marks[i]+1;

    }
    
}

public static void main(String[] args){
    int marks[] = {70,54,78};
    Update(marks);

    for(int i=0; i<marks.length; i++){
        System.out.print(" "+ marks[i]+" ");
    }
    System.out.println();
}
}
