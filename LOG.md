# 100 Days of Backend — Progress Log

## Day 1 — Git & GitHub Basics
- Learned: init, add, commit, push, branching basics
- Built: repo structure + first commit

## Day 2 — Branching & Merging
- Learned: branch, checkout, merge, resolving conflicts
- Built: two branches with a deliberate conflict, resolved it

## Day 3 — .gitignore, git log, git rebase
- Learned: ignoring files, log filtering, merge vs rebase
- Built: .gitignore, practiced a rebase with conflict resolution

## Day 4 — Java OOP Basics
- Learned: classes/objects, inheritance, interfaces
- Built: Car, ElectricCar, Drivable, Main — debugged several real compile errors (class/constructor name mismatch, missing files, wrong constructor values)
- Next: Day 5 — Collections (List, Map, Set) + loops/streams intro.

## Day 5 — Collections: List, Map, Set + Streams intro
- Learned: List (ordered, duplicates ok), Map (key-value), Set (unique values), basic streams, fixed a missing "+" string concatenation error
- Built: ListDemo, MapDemo, SetDemo, StreamDemo
- Next: Day 6 — Exception handling + more Java fundamentals




# Day 6 Notes - Exception Handling

- try/catch lets you run risky code and catch errors instead of crashing the whole program.
  Example: dividing by zero threw an ArithmeticException, but the program kept running after I caught it.

- finally always runs, whether an exception happened or not — good for cleanup work
  (like closing a file or database connection) that must happen no matter what.

- You can throw your own exceptions using built-in types like IllegalArgumentException,
  which is useful for validating input (e.g. rejecting an invalid age).

- A custom exception class (like InvalidAgeException) extends Exception and lets you
  create your own specific error types with a clear name and message, instead of
  reusing generic Java exceptions. This makes errors easier to understand later.

- Bug I hit today: capitalization mismatch between a constructor parameter (Message)
  and where I used it (message) — Java treats these as two different variables.
  Also learned that a .java file existing doesn't mean it's compiled — you need
  a matching .class file before "java ClassName" will work.





## Day 7 — Generics + Interfaces Recap
- Learned: generic classes/methods (Box<T>), multiple interface implementations, why interfaces enable swappable code
- Built: Box, GenericMethodDemo, PaymentMethod + CreditCardPayment/UpiPayment + PaymentDemo
- Next: Day 8 — Spring Boot fundamentals begin! First REST API project starts here.