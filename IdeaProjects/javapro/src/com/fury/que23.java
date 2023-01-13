package com.fury;
import java.util.*;

public class que23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Value : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int space = 1; space <= n - i; space++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            for (int k = 2; k <= i; k++){
                System.out.print(i - k + 1 + " ");
            }
            System.out.println();
        }

    }
}
