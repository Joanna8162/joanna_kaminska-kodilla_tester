package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        BookRecord b1 = new BookRecord("Adam Mickiewicz", "Dziady", 1823);
        BookRecord b2 = new BookRecord("Adam Mickiewicz", "Dziady", 1823);

        System.out.println(b1.equals(b2));
        System.out.println(b1);
    }
}
