package com.me.dddstart.chapter2;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class FullName1 {


    @Getter
    @EqualsAndHashCode
    @RequiredArgsConstructor
    static class FullName {
        private final String firstName;
        private final String lastName;
    }

    public void main1() {
        String fullName = "naruse masanobu";
        String[] tokens = fullName.split(" ");

        String lastName = tokens[0];
        String firstName = tokens[1];

        System.out.printf("lastName : %s, firstName : %s", lastName, firstName);
    }

    public void main2() {
        FullName fullName = new FullName("naruse", "masanobu");
        String firstName = fullName.getFirstName();
        String lastName = fullName.getLastName();
    }

    public void main3() {
        FullName fullName = new FullName("naruse", "masanobu");
        fullName = new FullName("new", "name");
    }

    public void executeEqauls() {
        FullName fullName1 = new FullName("naruse", "masanobu");
        FullName fullName2 = new FullName("naruse", "masanobu");
        fullName1.equals(fullName2);
    }


    public static void main(String[] args) {
        new FullName1().executeEqauls();
    }

}
