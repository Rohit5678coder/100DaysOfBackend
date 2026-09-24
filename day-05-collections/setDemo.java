import java.util.HashSet;
import java.util.Set;

public class SetDemo{
    public static void main(String[] args){
        Set<String> tags=new HashSet<>();
        tags.add("java");
        tags.add("backend");
        tags.add("java");

        System.out.println(tags);
        System.out.println("Total unique tags: "+ tags.size());

        System.out.println("contains 'backend'? " + tags.contains("backend"));
        tags.remove("java");
        System.out.println("After removing java: " + tags);
    }
}