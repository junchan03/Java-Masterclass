package com.junkamimura;

public class Main {

    public static void main(String[] args) {
            Bank_Account junsAccount = new Bank_Account(19921018, 1000,
                    "junkamimura", "abcxyz@gmail.com", "1234567890");

//        junsAccount.setNumber(19921018);
//        junsAccount.setBalance(1000);
//        junsAccount.setCustomerName("junkamimura");
//        junsAccount.setEmail("abcxyz@gmail.com");
//        junsAccount.setPhoneNumber("1234567890");

            System.out.println("Your balance is $" + junsAccount.getBalance());
            System.out.println("Your phone number is " + junsAccount.getPhoneNumber());
            junsAccount.deposit(500); //this is a method
            junsAccount.withdraw(2000);


            Vip_Account customer1 = new Vip_Account();
            System.out.println("This is " + customer1.getName() + "'s account");

            Vip_Account customer2 = new Vip_Account("Kobe Bryant", 1000000);
            System.out.println("This is " + customer2.getName() + "'s account with the credit limit of $" + customer2.getCreditLimit());

            Vip_Account customer3 = new Vip_Account("James Harden", 800000, "hardenj@mail.com");
            System.out.println("This is " + customer3.getName() + "'s account with the credit limit of $" +
                    customer3.getCreditLimit() + " with the following email address: " + customer3.getEmail());

        }
    }

