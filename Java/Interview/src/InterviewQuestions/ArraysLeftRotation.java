package InterviewQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysLeftRotation {

    public static int[] rotLeft(int[] a, int d){
       int runTimes = d;
       int temp;
        System.out.println(Arrays.toString(a));
       for (int i=0; i<a.length; i++){
           if (runTimes!=0){
               temp = a[a.length-runTimes];
               a[a.length-runTimes] = a[0];
               a[0] = temp;
           }
           runTimes--;
           System.out.println(Arrays.toString(a));
       }




        return a;
    }


    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int d= 4;
        ArraysLeftRotation.rotLeft(a, d);
//        for (int i:
//             ) {
//            System.out.println(i);
//
//        }
        a[0]=a[4];

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int i;

        list.set(1,2);
        byte b = 127;
        System.out.println(b);

    }
}
