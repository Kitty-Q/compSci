public class MagicSquare{
    public static void main (String[]args){
        Square sq1 = new Square(3);
        sq1.readSquare();
        System.out.println(sq1.magic());
        System.out.println(sq1.sumRow(2));
        System.out.println(sq1.sumCol(2));
        sq1.printSquare();
    }
}
