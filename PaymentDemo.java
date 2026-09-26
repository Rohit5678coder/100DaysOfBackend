public class PaymentDemo{
    static void processPayment(PaymentMethod method,int amount){
          method.pay(amount);

    }
    public static void main(String[]args){
        PaymentMethod card=new CreditCardPayment();
        PaymentMethod upi=new UpiPayment();

        processPayment(card, 500);
        processPayment(upi,200 );
        
    }

}