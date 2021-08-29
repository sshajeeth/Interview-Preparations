package hackerankProblemsolving;

import java.util.Scanner;

public class AVeryBigSum {

    public static long sum(String[] arr, int count){
        long sum_ = 0;
        if(arr.length!=count){
            System.exit(1);
        }else{
            for (String i:arr) {
                System.out.println(Integer.parseInt(i));
                sum_+=Integer.parseInt(i);

            }
        }
        return sum_;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCount = sc.nextInt();
        sc.nextLine();
        String[] numbers = sc.nextLine().split(" ");
//1000000001
//1000000002
//1000000003
//1000000004
//1000000005
//5000000015
        long a = AVeryBigSum.sum(numbers, inputCount);
        System.out.println(a);
    }
}
