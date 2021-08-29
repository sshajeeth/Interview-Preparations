package hackerank;

import java.util.Scanner;

public class JavaLoopsII {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        for (int i=0; i<no; i++){
            sc.nextLine();
            String[] input = sc.nextLine().split(" ");
            System.out.println(input[0]);
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int n = Integer.parseInt(input[2]);
            int total = a;

            for (int j=0; j<n; j++){
                total += (Math.pow(2,j))*b;
                System.out.print(total+" ");
            }
            System.out.println();

        }
    }
}
