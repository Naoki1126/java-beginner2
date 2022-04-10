package enumLesson;
import static enumLesson.AccountType.FUTSU;

public class Account {
    private String accountNo;
    private int balance;
    private AccountType accountType;

    public Account(String aNo, AccountType aType){
        this.accountNo = aNo;
        this.accountType = aType;
    }
}
