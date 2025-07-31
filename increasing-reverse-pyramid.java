//https://www.geeksforgeeks.org/java/java-pattern-programs/*
//Number Increasing Reverse Pyramid (Problem 4)
import java.util.*;
public class Main{
    public static void main(String[] args){
        for(int i = 4; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}