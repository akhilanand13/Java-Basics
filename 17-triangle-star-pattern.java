//https://www.geeksforgeeks.org/java/java-pattern-programs/
//Triangle Star Pattern (Pattern 17)
import java.util.*;
public class Main{
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            for(int j = i; j < 5; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}