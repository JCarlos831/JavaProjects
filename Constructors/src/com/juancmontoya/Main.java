package com.juancmontoya;

public class Main {

    public static void main(String[] args) {
	    // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct the balance field,
        // but not allow the withdrawal to complete if there are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println()'s in the two methods above as well.

        BankAccount juansaccount = new BankAccount(); //("12345678A", 10000, "Juan Johnson", "juan@test.com", "555-555-5555");

        System.out.println(juansaccount.getAccountNumber());
        System.out.println(juansaccount.getBalance());
        System.out.println(juansaccount.getCustomerName());
        System.out.println(juansaccount.getEmail());
        System.out.println(juansaccount.getPhoneNumber());

        System.out.println("*************************");

        juansaccount.deposit(2000);

        juansaccount.withdrawal(4000.55);

        juansaccount.withdrawal(31000.45);

        BankAccount bobsAccount = new BankAccount("bob", "bob@bob.com", "444-444-4444");
        System.out.println(bobsAccount.getAccountNumber() + " name " + bobsAccount.getCustomerName());

        // Create a new class VipCustomer
        // it should have 3 fields: name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all the fields.
        // Create getters only for this using code generation of intellij as setters won't be needed.
        // Test and confirm it works.

        VipCustomer customer1 = new VipCustomer();
        VipCustomer customer2 = new VipCustomer("Carlos", "carlos@test.com");
        VipCustomer customer3 = new VipCustomer("Jorge", 100000,"jorge@test.com");

        System.out.println(customer1.getCreditLimit());
        System.out.println(customer2.getEmailAddress());
        System.out.println(customer3.getName());





    }
}
