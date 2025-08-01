//https://www.geeksforgeeks.org/java/java-pattern-programs/
//Number Triangular (Pattern 2)
import java.util.*;
public class Main{
    public static void main(String[] args){
        int num = 1;
        for(int i = 0; i < 4; i++){
            for(int j = i; j < 4; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }
    }
}