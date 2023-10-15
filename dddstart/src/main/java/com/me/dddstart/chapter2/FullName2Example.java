package com.me.dddstart.chapter2;

public class FullName2Example {
    // FirstName, LastName 각각 타입 설정.
    static class FirstName{};
    static class LastName{};
    static class FullName {
        private final FirstName firstName;
        private final LastName lastName;
        public FullName(FirstName firstName, LastName lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

}
