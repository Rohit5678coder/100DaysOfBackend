public class UpiPayment implements PaymentMethod {
    public void pay(int amount){
        System.out.println("paid" + amount + "using UPI");
    }
}