package InterviewQuestions;

import java.util.Arrays;

public class FindSecondLargestNo {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3,9,5,6,7,8};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-1]);

    }
}
