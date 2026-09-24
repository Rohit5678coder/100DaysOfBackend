import java.util.HashMap;
import java.util.Map;

public class MapDemo{
    public static void main(String[] args){
        Map<String,Integer> prices=new HashMap<>();
        prices.put("Apple",50);
        prices.put("Banana",20);
        prices.put("Mango",80);

        System.out.println(prices);
        System.out.println("Price of Mango: " +prices.get("Mango"));


        for(Map.Entry<String,Integer> entry :prices.entrySet()){
            System.out.println(entry.getKey()+ "costs" +entry.getValue());
        }

        prices.put("Mango",90);
        System.out.println("updated Mango prices: "+prices.get("mango"));
    }
}