public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        dollars = (long) amount;
        cents = Math.round((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        long totalCents = this.toCents() + otherAmount.toCents();
        return new Money((double) totalCents / 100);
    }

    public Money subtract(Money otherAmount) {
        long totalCents = this.toCents() - otherAmount.toCents();
        return new Money((double) totalCents / 100);
    }

    public int compareTo(Money otherObject) {
        return Long.compare(this.toCents(), otherObject.toCents());
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Money money = (Money) otherObject;
        return dollars == money.dollars && cents == money.cents;
    }

    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

    private long toCents() {
        return dollars * 100 + cents;
    }
}
