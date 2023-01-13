package com.fury;
import java.util.*;

public class que18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Value : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int space = 1; space <= i - 1; space++){
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i + 1; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
