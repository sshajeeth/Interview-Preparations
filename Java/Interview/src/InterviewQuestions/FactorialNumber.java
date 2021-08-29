package InterviewQuestions;
import java.util.*;
import java.io.*;

public class FactorialNumber {


        public static int FirstFactorial(int num) {
            int fact  = 1;
            int i =1;
            if(num>=1 && num<18){
                for(i=1; i<=num; i++){
                    fact = fact*i;
                }
            }
            // code goes here
            return fact;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(FirstFactorial(s.nextInt()));
        }


}
