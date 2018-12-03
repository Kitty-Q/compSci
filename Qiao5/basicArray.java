public class basicArray{
    public static void main (String [] args){
        int [] array1= {0,1,2,3,4,5,6,7,8,9};
        for (int index=0; index< array1.length;index ++ ){
            System.out.print(array1[index]+" ");
        }
        System.out.println("");
        for (int index=array1.length-1; index>=0;index--){
            System.out.print(array1[index]+" ");
        }
        System.out.println("");
        for (int j:array1){
            System.out.print(j+" ");
        }
    }
}