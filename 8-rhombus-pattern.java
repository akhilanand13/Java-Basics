//https://www.geeksforgeeks.org/java/java-pattern-programs/
//Rhombus Pattern (Pattern 8)
import java.util.*;
public class Main{
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println("* ".repeat(4));
        }
    }
}
