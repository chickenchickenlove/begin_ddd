package com.me.dddstart.chapter4;

import lombok.RequiredArgsConstructor;

public class UserExample {

    @RequiredArgsConstructor
    static class User{
        private final String userName;

        public boolean isExist(String userName) {
            // UserName 중복체크
            return false;
        }
    }

    static class UserService {
        public boolean isExist(String userName) {
            // username 중복체크 로직
            return true;
        }
    }





}
