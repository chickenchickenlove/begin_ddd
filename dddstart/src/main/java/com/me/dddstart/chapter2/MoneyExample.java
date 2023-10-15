package com.me.dddstart.chapter2;

public class MoneyExample {
    static class Money{
        private final int amount;

        public Money(int amount) {
            if (amount < 0) {
                throw new IllegalArgumentException("잘못된 돈입니다.");
            }
            this.amount = amount;
        }

        public Money add(Money other) {
            return new Money(this.amount + other.amount);
        }
    }
}
