public class MultiCatchDemo{
    public static void main(String[]args){
        int[]numbers={1,2,3};

        try{
            System.out.println(numbers[5]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array error : " + e.getMessage());
        }catch (Exception e){
            System.out.println("General Error : " + e.getMessage());

        }finally{
            System.out.println("This always runs,error or not");
        }

        System.out.println("Program Finished");
    }
    
}