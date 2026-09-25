public class TryCatchDemo {

    public static void main(String[] args){
        System.out.println("Start of Program");

        try{
            int result=10/0;
            System.out.println("Result: "+ result);

        }catch(ArithmeticException e){
            System.out.println("Error Caught: " +e.getMessage());

        } 
        System.out.println("Program continues normally after the error");
    }
}