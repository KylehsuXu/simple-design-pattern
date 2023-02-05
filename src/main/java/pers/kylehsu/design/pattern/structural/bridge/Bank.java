package pers.kylehsu.design.pattern.structural.bridge;

/**
 * Created by kylehsu
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
