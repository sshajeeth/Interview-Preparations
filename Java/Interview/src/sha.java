public class sha {
    public static void main(String[] args) {
        String s = "06:40:03AM";
        if(s.endsWith("AM")){
            System.out.println("Hello");
        }
        String[] times = s.split(":|PM|AM");
        String hr = "";
        if(s.endsWith("AM")){
            if (Integer.parseInt(times[0]) == 12) {
                hr = "00";
            }else {
                hr = times[0];
            }
        }else {
            if (Integer.parseInt(times[0]) == 12) {
                hr = "12";
            } else {
                hr = Integer.toString(Integer.parseInt(times[0]) + 12);
            }
        }
        System.out.print(hr+ ":" + times[1] + ":" + times[2]);


//        for (String i:times
//             ) {
//            System.out.println(i);
//
//        }
    }
}
