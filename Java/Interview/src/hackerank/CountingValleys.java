package hackerank;

import java.util.Scanner;

public class CountingValleys {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int steps = sc.nextInt();
        String[] path = sc.next().split("");

        int val = 0;
        int level = 0;

        for(int i=0; i<path.length; i++){
            if(path[i].equals("U")){
                level++;

            }else if(path[i].equals("D")){
                level--;
            }

            if (level==0 && path[i].equals("U")){
                val++;
            }

        }

        System.out.println(val);




    }
}
