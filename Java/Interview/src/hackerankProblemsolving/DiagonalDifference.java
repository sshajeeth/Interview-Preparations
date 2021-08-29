package hackerankProblemsolving;

import java.util.Scanner;

public class DiagonalDifference {

    public static int findDiff(){
        int diff = 0;
        return diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.nextLine();
        String[] matrix= new String[]{};
        for(int i=0; i<lines; i++){
            matrix = sc.nextLine().split(" ");
        }

        for (String i:matrix
             ) {
            System.out.println(i);

        }
        System.out.println(matrix);
    }
}
