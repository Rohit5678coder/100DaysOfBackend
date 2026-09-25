public class CustomExceptionDemo{
    static void checkAge(int age ){
        if(age <18) {
            throw new IllegalArgumentException("agwe mus be 18 or older,go " +age);

        }
        System.out.println("age accepted : "+age);

    }

    public static void main(String[] args){
        try{
            checkAge(15);

        }catch(IllegalArgumentException e){
            System.out.println("validation failed : "+e.getMessage());
        }

        checkAge(20);
    }
}