public class ReversedArray {

    public static void main(String[] args) {

        int[] ar = new int[]{1,2,3,4,5,6};

        for(int j=ar.length-1; j>=0; j--){
            System.out.println(ar[j]);
        }
    }
}
