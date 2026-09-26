public class BoxDemo{
    public static void main(String[]args){
        Box<String> stringBox=new Box<>();
        stringBox.put("Hello Generics");
        System.out.println(stringBox.get());

        Box<Integer> intBox = new Box<>();

        intBox.put(100);
        System.out.println(intBox.get());
    }
}