/*
Java Encapsulation:

An object's encapsulation allows it to hide its data and methods.
It is one of the fundamental principles of object-oriented programming.
Java classes encapsulate the fields and methods that define an object's state and actions.
Encapsulation enables you to write reusable programs.
It also enables you to restrict access only to public features of an object.
Other fields and methods are private and can be used internally.

2. Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
Provide public getter and setter methods to access and modify these variables.
*/
public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAccountNumber("1234-5");
        ba.setBalance(1800.53);

        System.out.println("Account Number: "+ba.getAccountNumber()+"\nBalance: $"+ba.getBalance());
    }
}