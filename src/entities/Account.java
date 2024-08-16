package entities;

public class Account {
    Integer Number;
    String holder;
    Double balance;
    Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        Number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }


    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
       balance += amount;

    }
    public void withdraw(Double amount){
        if (balance == 0){
            throw new IllegalArgumentException("Impossivel efetuar saque pois o saldo está zerado.");
        } else if (amount > withdrawLimit) {
            throw new RuntimeException ("O saque não pode ser maior que o limite de saque");

        } else {
            balance -= amount;
            System.out.println("New balance:" + balance);
        }

    }

}
