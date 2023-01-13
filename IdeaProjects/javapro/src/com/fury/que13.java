package com.fury;
import java.util.*;

public class que13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Value : ");
        int n =  sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                int ch = 'A' + i + j - 2;
                System.out.print((char) ch + " ");
            }
            System.out.println();
        }

    }
}
