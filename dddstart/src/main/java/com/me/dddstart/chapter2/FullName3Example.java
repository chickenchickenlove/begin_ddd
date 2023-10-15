package com.me.dddstart.chapter2;

public class FullName3Example {
    // Name 타입만 설정 후 사용하기.
    static class Name{};
    static class FullName {
        private final Name firstName;
        private final Name lastName;
        public FullName(Name firstName, Name lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

}
