package lab5;

import java.util.Scanner;

public class myArray {
    public static void main(String[] args) {

        int a[] = new int[5];
        System.out.println(a[0]);
        a[0] = 10;
        System.out.println(a[0]);
        //input data to array

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            System.out.print("a["+i+"]:");
            a[i] = sc.nextInt();
        }
        System.out.println("Data in arry:");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+"\t");
        }

    }

}