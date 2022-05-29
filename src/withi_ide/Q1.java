package withi_ide;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        System.out.println("Enter a number to find the factorial enter a number.");
        Scanner scanner=new Scanner(System.in);
        long input=scanner.nextLong();



        for (int i = 1; i < input; i++) {
            System.out.print(i+ ",");
        }

        System.out.println();
        for (long l = input; l > 1; l--) {
            System.out.print(l+ ",");
        }


    }

}
