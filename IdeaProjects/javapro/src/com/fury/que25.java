package com.fury;
import java.util.*;

public class que25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Value : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= m; j++){
                if (i == 1 || i == n || j == 1 || j == m ){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
