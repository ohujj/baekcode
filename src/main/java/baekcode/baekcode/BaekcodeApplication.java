package baekcode.baekcode;

import java.util.Scanner;

public class BaekcodeApplication {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int q = B%10;
        int w = B%100-q;
        int e = B%1000-w;

        System.out.println(A*q);
        System.out.println(A*w);
        System.out.println(A*e);
        System.out.println(A*B);



    }
}
