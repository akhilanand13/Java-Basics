//https://www.geeksforgeeks.org/java/java-pattern-programs/*
//Number Increasing Pyramid (Pattern 3)
import java.util.*;
public class Main{
    public static void main(String[] args){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
        System.out.println();
        }
    }
}