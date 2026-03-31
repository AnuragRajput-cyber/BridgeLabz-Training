package reviews;

import java.util.HashMap;
import java.util.LinkedList;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}

class User{
    String name;
    Account account;
    User(String name,Account account){
        this.name=name;
        this.account=account;
    }
    public void deposit(int amount){
        account.balance+=amount;
    }
    public void withdrawByWallet(int amount)throws InsufficientBalanceException{
        if(account.wallet.balance<amount)
            throw new InsufficientBalanceException("Insufficient wallet balance");
        account.wallet.balance-=amount;
    }
    public void withdrawByAccount(int amount)throws InsufficientBalanceException{
        if(account.balance<amount)
            throw new InsufficientBalanceException("Insufficient account balance");
        account.balance-=amount;
    }
}

class Account{
    String accountNumber;
    int balance;
    Wallet wallet;
    Account(String accountNumber,int balance,Wallet wallet){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.wallet=wallet;
    }
}

class Wallet{
    int id;
    int balance;
    Wallet(int id,int balance){
        this.id=id;
        this.balance=balance;
    }
}

class Transaction{
    User user;
    String msg;
    int withdrawAmount;
    int depositedAmount;
    Transaction(User user,int withdrawAmount,int depositedAmount){
        this.user=user;
        this.withdrawAmount=withdrawAmount;
        this.depositedAmount=depositedAmount;
        if(withdrawAmount>0)
            msg="Money Withdrawn";
        else
            msg="Money Deposited";
    }
    public String toString(){
        return user.name+" Withdraw:"+withdrawAmount+" Deposit:"+depositedAmount+" "+msg;
    }
}

interface TransferService{
    void transfer(User fromUser,User toUser,int amount)throws InsufficientBalanceException;
}

class WalletToWalletTransfer implements TransferService{
    public void transfer(User fromUser,User toUser,int amount)throws InsufficientBalanceException{
        if(fromUser.account.wallet.balance<amount)
            throw new InsufficientBalanceException("Insufficient wallet balance");
        fromUser.account.wallet.balance-=amount;
        toUser.account.wallet.balance+=amount;
    }
}

class BankToWalletTransfer implements TransferService{
    public void transfer(User fromUser,User toUser,int amount)throws InsufficientBalanceException{
        if(fromUser.account.balance<amount)
            throw new InsufficientBalanceException("Insufficient bank balance");
        fromUser.account.balance-=amount;
        toUser.account.wallet.balance+=amount;
    }
}

public class DigitalWalletSystem{

    HashMap<Integer,Wallet> wallets=new HashMap<>();
    LinkedList<Transaction> history=new LinkedList<>();

    public static void main(String[] args){
        DigitalWalletSystem system=new DigitalWalletSystem();
        try{
            Wallet w1=new Wallet(101,5000);
            Wallet w2=new Wallet(102,2000);
            Account a1=new Account("A101",10000,w1);
            Account a2=new Account("A102",5000,w2);
            User u1=new User("Anurag",a1);
            User u2=new User("Rohit",a2);
            system.wallets.put(w1.id,w1);
            system.wallets.put(w2.id,w2);

            TransferService walletTransfer=new WalletToWalletTransfer();
            System.out.println("Current Wallet Balance of w1:"+u1.account.wallet.balance);
            System.out.println("Current Wallet Balance of w2:"+u2.account.wallet.balance);
            System.out.println("Transfer Amount:"+1500);
            System.out.println();
            System.out.println("Transfering Money from wallet to wallet...");
            walletTransfer.transfer(u1,u2,1500);
            System.out.println("Wallet Balance of w1 After Transfer:"+u1.account.wallet.balance);
            System.out.println("Wallet Balance of w2 After Transfer:"+u2.account.wallet.balance);
            system.history.add(new Transaction(u1,1500,0));
            System.out.println();
            System.out.println("Current Balance of account a1:"+u1.account.balance);
            System.out.println("Current Balance of wallet w2:"+u2.account.wallet.balance);
            TransferService bankTransfer=new BankToWalletTransfer();
            System.out.println("Transfer Money from u1 to u2:"+2000);
            System.out.println();
            System.out.println("Trasnfering Money from Account to Wallet.....");
            bankTransfer.transfer(u1,u2,2000);
            System.out.println("Account A101 Balance:"+u1.account.balance);
            System.out.println("Wallet w2 Balance:"+u2.account.wallet.balance);
            System.out.println();
            system.history.add(new Transaction(u1,0,2000));

            system.history.forEach(System.out::println);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
