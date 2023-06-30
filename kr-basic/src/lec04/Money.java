package lec04;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Money implements Comparable<Money> {
    private final long amount;

    public Money(long amount) {
        this.amount = amount;
    }

    public Money plus(Money other) {
        return new Money(this.amount + other.amount);
    }

    @Override
    public int compareTo(@NotNull Money o) {
        return Long.compare(this.amount, o.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
