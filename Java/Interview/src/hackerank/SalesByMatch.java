package hackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SalesByMatch {

    static int cntgloves(int arr[], int n)
    {

        // Sort the original array
        Arrays.sort(arr);
        int res = 0;
        int i = 0;

        while (i < n) {

            // take first number
            int number = arr[i];
            int count = 1;
            i++;

            // Count all duplicates
            while (i < n && arr[i] == number) {
                count++;
                i++;
            }

            // If we spotted number just 2
            // times, increment
            // result
            if (count >= 2) {
                res = res + count / 2;
            }
        }
        return res;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfSocks = sc.nextInt();
        sc.nextLine();

        String[] colors = sc.nextLine().split(" ");
        int pair = 0;
        if(colors.length!=noOfSocks){
            System.exit(1);
        }else{

            List<String> socksList = new ArrayList<>(Arrays.asList(colors));

            for(int i=0; i<noOfSocks; i++){
                for(int j=i+1; j<socksList.size(); j++){
                    if(socksList.get(i).equals(socksList.get(j))){
                        System.out.println(socksList.get(i) + "=="+socksList.get(j));
                        pair+=1;
                        socksList.remove(j);
                        break;
                    }
                }



//                1 5 4 1 8 4 1 8 9 1
//                System.out.println(colors[i]);
            }

            System.out.println("Pair "+ pair);
        }
//
//        if()

//        String[] socks = new String[(colors.split(" "))];



    }
}
