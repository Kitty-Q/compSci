import java.util.*;
public class arrayDouble{
    public static void main(String [] args){
        Random generator= new Random();
        double num1= generator.nextDouble();
        double num2= generator.nextDouble();
        double num3= generator.nextDouble();
        double num4= generator.nextDouble();
        double []array1= {num1,num2,num3,num4};
        for (int index=0;index<array1.length;index++){
            double sum+=array1[index];
        }
    }
}
