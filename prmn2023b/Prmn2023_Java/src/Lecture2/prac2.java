package Lecture2;

import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {

        int[] num = new int[5];

        Scanner scan = new Scanner(System.in);
        for(int i = 0;i < 5; i++){
            System.out.print("数字" + i + "つ目");
            num[i] = scan.nextInt();
            System.out.println("");
        }

        Keisan k = new Keisan();

        int goukei = k.goukei(num);

        k.hanbetsu(goukei);
    }
}
