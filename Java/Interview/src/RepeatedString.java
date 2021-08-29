public class RepeatedString {


    public static void main(String[] args) {

        String s = "abba";
        long n = 10;

        long sSize = s.length();
        long repeatedTimes = n/sSize;

        long balance = n-(sSize*repeatedTimes);

        int count=0;

        for (char c:s.toCharArray()
             ) {
            if(c=='a'){
                count+=1;
            }

        }
        count*=repeatedTimes;
        for (int i=0; i<balance; i++){
            if(s.charAt(i)=='a'){
                count+=1;
            }
        }

        System.out.println(count);


//
//        long size = s.length();
//        long repeated = n/size;
//
//        long left = n - (size * repeated);
//        int extra = 0;
//
//        int count = 0;
//        for(int i = 0; i < size; i++){
//            if(s.charAt(i) == 'a'){
//                ++count;
//            }
//        }
//
//        for(int i = 0; i < left; i++){
//            if(s.charAt(i) == 'a'){
//                ++extra;
//            }
//        }
//
//        repeated = (repeated * count) + extra;
//
//        System.out.println(repeated);




//
//        for (int i=0; i<n; i++){
//            if (s.length()!=n){
//                for (char a:s.toCharArray()
//                     ) {
//                    s+=a;
//                }
//            }
//        }


//        while (s.length()<=10){
//            for (char c: sCharArray
//                 ) {
//                s.append(c);
//
//            }
//        }
//        outter:
//        for (int i=0; i<n; i++){
//            s.append("aba");
//            System.out.println(s.length());
//            if (s.length()>=n){
//                break outter;
//            }
//        }

//        System.out.println(s);

    }
}
