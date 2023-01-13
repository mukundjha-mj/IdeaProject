package com.fury;
import java.util.*;

public class que12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Value : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                int ch = 'A' + i - 1;
                System.out.print((char) ch + " ");
            }
            System.out.println();
        }

    }
}
