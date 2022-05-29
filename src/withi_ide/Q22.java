package withi_ide;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        System.out.println("Enter an number from 1 to 2.");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();

      switch (input){
          case 1:
              int in=scanner.nextInt();
              System.out.println("You've reach the maximum type character.");
              break;

          case 2:
              int in1=scanner.nextInt();
              int in3=scanner.nextInt();
              System.out.println("You've reach the maximum type character.");
      }
    }
}
