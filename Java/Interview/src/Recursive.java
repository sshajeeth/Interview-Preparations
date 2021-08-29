public class Recursive {

    public static String print(String a){
        String result = print("World");
        return result;
    }
//    public static int sum(int k) {
//        k+=1;
//
//        return sum(k);
//    }

    public static void main(String[] args) {
        String result = Recursive.print("hello");
        System.out.println(result);
    }
}
