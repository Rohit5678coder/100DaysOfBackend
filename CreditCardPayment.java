public class CreditCardPayment implements PaymentMethod{
    public void pay(int amount){
        System.out.println("paid " +amount + "using credit card" );
    }
}