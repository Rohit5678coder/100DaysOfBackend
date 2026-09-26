Generics let  you write one class or method that any type,while still getting compile-time type safety. Box<String> are the same class.just specialized for diffrent types.

--<T> isa placeholder for "some type,decided later."its not a real type itself -it gets replaced by whatever type you use when you create the object,like Box<String> or Box<Integer>.

--Interfaces let you write code that doesnt care with specific class its working with -processPayment() takes any paymentMethod and calls Pay(),without knowing or caring if itsn CreditCardpayment or UPiPayment.

