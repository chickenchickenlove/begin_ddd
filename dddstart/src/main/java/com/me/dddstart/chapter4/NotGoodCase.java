package com.me.dddstart.chapter4;

import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;

public class NotGoodCase {

    @RequiredArgsConstructor
    static class User{
        private final String userName;
    }

    static class UserService{

        private boolean isExist(String userName) {
            return true;
        }

        public User createUser(String userName) {
            if (!StringUtils.hasText(userName)) return null;
            if (isExist(userName)) return null;

            //
            return new User("ABC");
        }
    }
}
