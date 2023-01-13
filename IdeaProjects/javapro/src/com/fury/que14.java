package com.fury;
import java.util.*;

public class que14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Value : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            int ch = 'A' + n- i;
            for (int j = 1; j <= i; j++){
                System.out.print((char) ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
