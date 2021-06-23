package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] kravi = new int[N];

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            kravi[i] = A;
        }
        Arrays.sort(kravi);


        int  sum = 0;
        for (int i = 0; i < kravi.length; i++) {
            sum += kravi[i];
        }

        System.out.println(sum/K);



    }

}

