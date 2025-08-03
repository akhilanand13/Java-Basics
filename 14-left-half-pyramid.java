//https://www.geeksforgeeks.org/java/java-pattern-programs/
//Left Half Pyramid (Pattern 14)
//Here, the outer loop controls the number of rows, the first inner loop controls the number of white spaces and the second inner loop prints the actual pattern
import java.util.*;
public class Main{
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            for(int j = i; j < 5; j++){
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}