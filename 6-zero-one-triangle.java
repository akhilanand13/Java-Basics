//https://www.geeksforgeeks.org/java/java-pattern-programs/*
//Zero-One Triangle (Pattern 6)
import java.util.*;
public class Main{
    public static void main(String[] args){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                if((i+j)%2!=0){
                    System.out.print(0 + " ");
                }
                else{
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}