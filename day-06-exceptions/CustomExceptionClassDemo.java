public class CustomExceptionClassDemo {
    static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or older,got: "+age );

        }System.out.println("Age accepted: "+ age);

    }
    public static void main(String[] args){
        try{
            checkAge(10);
        }catch(InvalidAgeException e){
            System.out.println("Custom exception caught : " +e.getMessage());
        }
    }
}