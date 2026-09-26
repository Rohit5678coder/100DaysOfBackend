public class GenericsMethodDemo {
    static <T> void printArray(T[] items){
        for (T item :items){
            System.out.println(item);
        }
    }

    public static void main(String[]args){
        String[] fruits={"Apple","Banana","Mango"};
        Integer[] numbers={1,2,3};

        printArray(fruits);
        printArray(numbers);
    }
    
}