public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);  // using copy constructor
        this.balance = new Money(0.0);
    }

    public Money getBalance() {
        return new Money(balance);  // using copy constructor
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);  // using copy constructor
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        System.out.println("Attempt to charge " + amount);
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        System.out.println("Attempt to pay " + amount);
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }

    @Override
    public String toString() {
        return "CreditCard[owner=" + owner + ", balance=" + balance + ", creditLimit=" + creditLimit + "]";
    }
}
