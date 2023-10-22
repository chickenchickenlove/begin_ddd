package com.me.dddstart.chapter4;

import org.springframework.util.StringUtils;

public class UserClass {

    static class User {
        private final String userName;

        public User(String userName) {
            if (!StringUtils.hasText(userName)) {
                throw new IllegalArgumentException("잘못된 입력임.");
            }
            this.userName = userName;
        }
    }

    static class UserDomainService {
        public boolean isExisted(String userName) {
            //
            return true;
        }
    }
/*
    static class UserApplicationService {
        private final UserDomainService userService;

        public User createUser(String userName) {

            if (userService.isExisted(userName)) {
                throw new IllegalArgumentException("이미 있는 유저입니다.");
            }

            User user = new User();
            // INSERT INTO USER(user_id, user_name) values(1, "abc")...
        }
    }

 */




}
