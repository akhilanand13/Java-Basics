//https://www.geeksforgeeks.org/java/java-pattern-programs/*
//Square Hollow Pattern (Pattern 1)
import java.util.*;
public class Main{
    public static void main(String[] args){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(i == 0 || i == 5 || j == 0 || j == 5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}