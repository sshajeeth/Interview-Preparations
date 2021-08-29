package InterviewQuestions;

public class JumpingontheClouds {

    public static int jumpingOnClouds(int[] c, int n){
        int count = 0;

//        {0, 0, 0, 0, 1, 0, 1, 0,1, 0,0}
        for (int i = 0; (i < n - 1); i++) {
//            System.out.println(i);
            if (c[i] == 0) {
                i++;
            }


            count++;
            System.out.println(count);

        }

        return count;

    }


    public static void main(String[] args) {
        int[] arr = new int[]{0,1, 1, 0, 1, 0};
        System.out.println(JumpingontheClouds.jumpingOnClouds(arr, 6));

    }
}
