package InterviewQuestions;

public class ReverseWord {

    public String reverseWord(String str){
        String revereseWord = "";

        for(int i = str.length(); i>0; --i){
            revereseWord = revereseWord+ (str.charAt(i-1));
//            System.out.println(str[i]);
        }
        return revereseWord;
    }

    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();

        String hello = reverseWord.reverseWord("Coderbyte");
        System.out.println(hello);

    }

}
