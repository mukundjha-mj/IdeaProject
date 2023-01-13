package com.fury;
import java.util.*;

public class que15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Value : ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++){
            int ch = 'A' + i -1;
            for (int j = 1; j <= n; j++){
                System.out.print((char) ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
