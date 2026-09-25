--try/catch:lets you run risky code and catch errors of crashing the whole program.

-finally always runs,whether an exception happend or not -good for cleanup work (like closing a file or database connection ) that mush happen no matter what.

-you can throw your own exceptions using built-in types like IllegalArgumentException,which is useful for validating input(e.g rejecting an invalid age)

-A custom exception class(like InvalidAgeException) extends Exception and lets you create your own specific error types with a clear name and message,instead of reusing generic java exceptions.



