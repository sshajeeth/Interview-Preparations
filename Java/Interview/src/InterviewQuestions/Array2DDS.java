package InterviewQuestions;

public class Array2DDS {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int max = -100;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                int row1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                int row2 = arr[i + 1][j + 1];
                int row3 = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                if (max <= (row1 + row2 + row3)) max = (row1 + row2 + row3);

            }
        }

        System.out.println(max);

    }
}
