import java.util.ArrayList;
import java.util.List;

public class GenericsDemo{
    public static void main(String[]args){
        List<String> names=new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        for(String name:names){
            System.out.println(name);
        }
    }
}