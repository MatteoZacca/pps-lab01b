package e1;

public class SilverBankAccount implements BankAccount {

    // private CoreBankAccount base = new CoreBankAccount();
    /* Qui, la classe SilverBankAccount crea direttamente una nuova istanza di CoreBankAccount. Questo è un esempio di
    hardcoded dependency, perché SilverBankAccount dipende fortemente dalla classe CoreBankAccount. */

    private BankAccount base;

    public SilverBankAccount(BankAccount base) {
        this.base = base;
    }

    @Override
    public int getBalance() {
        return base.getBalance();
    }

    @Override
    public void deposit(int amount) {
        base.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        base.withdraw(amount + 1);
    }
}
