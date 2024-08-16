package application;

import entities.Account;

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
            } catch ( IllegalArgumentException e ){
                System.out.println("Impossivel efetuar o saque.");
                e.getMessage();
            } catch ( RuntimeException e){
                System.out.println("O saque não pode ser maior que o limite de saque");
                e.getMessage();
            }







            sc.close();
        }

}
