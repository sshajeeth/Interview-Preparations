public class staircase {

    public static void main(String[] args) {
        int h=6;
        int th = h-1;
        for(int i=0; i<h; i++){
            for(int j=0; j<h; j++){
//                System.out.println("J"+j+" TH"+th);
                if(j<th){
                    System.out.print("w");
                }else{
                    System.out.print("#");
                }
//                if(j>(h-1)){
//
//                }else{
//                    System.out.print("");
//                }


            }
            th--;
            System.out.println();
        }




    }
}
