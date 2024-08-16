package application;

import entities.Account;
import model.Exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.next();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println("Enter amount for withdraw:");
            double amount = sc.nextDouble();

            try {
                account.withdraw(amount);
            } catch ( DomainException e ){
                System.out.println(e.getMessage());

            } catch ( RuntimeException e){
                System.out.println(e.getMessage());

            }







            sc.close();
        }

}
