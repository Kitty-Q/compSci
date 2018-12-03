import java.util.*;
public class stringArray{
    public static void main (String [] args){
        String []Name_Array= {"Paul", "Wendy", "Jared", "Eric", "Liz","Ian", "Isobel", "Hakem"};
        for (int index=0; index<Name_Array.length; index++){
            System.out.print(Name_Array[index]+ "  ");
        }
        System.out.println("");
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the name of the guest: ");
        String Name = scan.nextLine();
        boolean found = false;
        for (String name : Name_Array){
            if (Name.equals(Name_Array)){
                found= true;
            }
            if (found = true){
                System.out.println("Yes, the name is on the list");
            }
            else{
                System.out.println("No, the name is not on the list");
            }
        }  
        String temp = array[0];
        array[0] = array[3];  
        array[3] = temp;
    }
}