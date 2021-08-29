import java.sql.Date;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> ls1 = new ArrayList<>();
        ls1.add(1);
        ls1.add(2);
        ls1.add(3);

        List<Integer> ls2 = new ArrayList<>();
        ls2.add(1);
        ls2.add(2);
        ls2.add(3);

        List<Integer> ls3 = new ArrayList<>();
        ls3.add(1);
        ls3.add(2);
        ls3.add(3);

        arr.add(ls1);
        arr.add(ls2);
        arr.add(ls3);

        int leftD = 0;
        int rightD = 0;

        int rightI=2;
        int leftI=0;
        for (int i=0; i<arr.size(); i++){
            leftD+=arr.get(i).get(leftI++);
            rightD+=arr.get(i).get(rightI--);

//
//            System.out.println(arr.get(i).get(0));
        }

        System.out.println(leftD);
        System.out.println(rightD);

        int a = 10;
        int b = 5;

        System.out.println(a/b);

    }
}
