public class Array123 {

    public static int array_123(int[] a) {
        int result = 0;

        boolean prevUp = false;
//        arr={1,2,3,1,2}
        if (a.length % 3 == 0) {

            for (int i = 0; i < a.length - 1; i++) {
                if (a[i + 1] - a[i] == 1) {
                    if (prevUp)
                        return 1;
                    else
                        prevUp = true;
                } else
                    prevUp = false;
            }
            return 0;
        } else return 0;



//        for (int i=0; i<arr.length; i++){
//
//        }

//        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3};
        System.out.println(Array123.array_123(arr));
    }
}
