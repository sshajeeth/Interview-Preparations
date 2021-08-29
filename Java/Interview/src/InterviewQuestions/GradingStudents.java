package InterviewQuestions;

public class GradingStudents {

    public static int grading(int marks){
        int result=0;

        if(!(marks>100 || marks<0)){
            if (marks<38){
                result=marks;
            }else{
                int temp = marks;
                while(!(temp%5==0)){
                    temp++;
                }
                if ((temp-marks)<3){
                    result=temp;
                }else{
                    result=marks;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(GradingStudents.grading(57));
    }
}
