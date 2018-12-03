public class Array3DTest{
        final static int limit = 7;
        final static int multiple = 10;
        public static void main (String [] args){
            int [][][] array = new int [8][8][8];
            for (int pointer1=0;pointer1<8;pointer1++){
                for (int pointer2 =0; pointer2<8;pointer2++){
                    for (int pointer3= 0; pointer2<8;pointer3++){
                    if (pointer1==0&&pointer2==0){
                        System.out.print("\t");
                    }
                    else{
                        System.out.print((pointer1==0?pointer2:(pointer2==0?pointer1:(pointer1*pointer2)))+"\t");
                        }
                    }                    
                }
                System.out.println();
            }
    }
}
