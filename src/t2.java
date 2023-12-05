import java.util.Scanner;

public class t2 {
    public void exceptionDemo() {
        try{
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );}
        catch( ArithmeticException e ){
            System.out.println("Ни дэлица");
        }
        catch(NumberFormatException e){
            System.out.println("не интежер");
        }
    }
    public static void main(String[] args) {
        t2 a = new t2();
        a.exceptionDemo();
    }
}
