package com.fury;
import java.util.*;

public class que24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Value : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i + 1; j++){
                System.out.print(j + " ");
            }
            for (int k = 1; k <= i * 2 -2; k++){
                System.out.print("* ");
            }
            for (int l = n - i + 1; l >= 1; l--){
                System.out.print(l + " ");
            }
            System.out.println();
        }

    }

}
