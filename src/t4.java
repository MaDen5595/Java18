import java.util.Scanner;

public class t4 {
    public void exceptionDemo() {
        int shtuka = 87;
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
        finally {
            System.out.println(shtuka);
        }
    }
    public static void main(String[] args) {
        t4 a = new t4();
        a.exceptionDemo();
    }
}
