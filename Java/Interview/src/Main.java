import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int array[] = {18, 18, 25, 25, 25, 28, 28, 29};

        Arrays.sort(array);
        int j=0;
        int[] temp = new int[array.length];
        for(int i=0; i<array.length-1; i++){
//            System.out.println(array[i]);
            if (array[i]!=array[i+1]){
                array[j++] = array[i];

            }

        }

        array[j++] = array[array.length-1];

        for(int i=0; i<j; i++){
            System.out.println(array[i]);
        }

    }

}