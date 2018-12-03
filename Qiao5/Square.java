import java.util.*;
public class Square
{

    public int[][] square;
    private Scanner scan= new Scanner (System.in);
    private int row,col;
    private int size;
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size)
    {
      square= new int [size][size];
      row=size;
      col=size;
    }


    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int getValueAt(int row, int col){
        int val=-1;
        try {
            val = square [row][col];
        } catch (Exception e){
        }
        return val;
    }
    
    public int sumRow(int row)
    {
      int sum = 0;
      
      for (int pointer=0; pointer<col ;pointer ++ ){
           sum +=getValueAt(row,pointer);
        }
      return sum;
    }


    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
      int sum = 0;
      
      for (int pointer=0; pointer<row ;pointer ++ ){
           sum +=getValueAt(pointer,col);
        }
      return sum;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
      int sum = 0;
      int row=0;
      int col=0;
      while (true){
          row=col;
          if(getValueAt(row,col)==-1){break;}
          sum+=getValueAt(row,col);
          row++;
          col++;
        }
      return sum;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
      int sum=0;
      final int Sum= size;
      int row =0;
      int col=0;
      while (row<this.row){
          sum+=getValueAt(row,col);
          row++;col++;
        }
        return sum;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean isSquare(){
        return col==row;
    }
    
    public boolean magic()
    {
       if (!isSquare()){
           return false;
        }
        else{
            int dim = col;
            int sumValue= sumRow(0);
            for (int pointer=0;pointer<dim;pointer++){
                if (sumValue!=sumCol(pointer)||sumValue!=sumRow(pointer)){
                    return false;
            }
        }
        if (sumValue!=sumMainDiag()||sumValue!=sumOtherDiag()){
                    return false;
        }
        return true;
      }
    }

    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
    public void readSquare()
    {
    for (int row = 0; row < square.length; row++)
	for (int col = 0; col < square.length; col ++)
	    square[row][col] = scan.nextInt();
    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
       for (int pointer1=0;pointer1<3;pointer1++){
                for (int pointer2 =0; pointer2<3;pointer2++){
                    if (pointer2!=0){
                        System.out.print("\t");
                    }
                    System.out.print(getValueAt(pointer1,pointer2));
                }
                System.out.println();
            }
    }

}
