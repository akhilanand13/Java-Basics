//https://www.geeksforgeeks.org/java/java-pattern-programs/
//Reverse Number Triangle Pattern

import java.util.*;
public class Main{
    public static void main(String[] args){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = i; j < 5; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}