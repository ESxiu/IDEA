package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入：");
        while (in.hasNextLine()){
            String x= in.nextLine();
            String arr[] = x.split(" ");
            BigInteger A = new BigInteger(arr[0]);
            BigInteger B = new BigInteger(arr[1]);
            System.out.println(A.add(B));
            
        }
        in.close();
    }
}
