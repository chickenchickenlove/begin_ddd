package com.me.dddstart.chapter3;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

public class UserExample {

    static class User {
        // 식별키 추가.
        private final Long userId;
        private int age;
        private final String name;

        public User(Long userId, int age, String name) {
            if (name.length() < 3) {
                throw new IllegalArgumentException("name은 3글자보다 커야 합니다.");
            }

            this.userId = userId;
            this.age = age;
            this.name = name;
        }

        public void changeAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return userId.equals(user.userId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(userId);
        }
    }



}
