package com.me.dddstart.chapter2;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;

public class ModelNumberExample {

    @Getter
    @RequiredArgsConstructor
    static class ModelNumber{
        private final String productCode;
        private final String branch;
        private final String lot;

        public ModelNumber(String productCode, String branch, String lot) {
            if (!(StringUtils.hasText(productCode) ||
                    StringUtils.hasText(branch) ||
                    StringUtils.hasText(lot))) {
                throw new IllegalArgumentException("잘못된 인수입니다.");
            }

            this.productCode = productCode;
            this.branch = branch;
            this.lot = lot;
        }

        @Override
        public String toString() {
            return String.format("%s-%s-%s", productCode, branch, lot);
        }
    }

    public static void main(String[] args) {
        // String만 이용하면 표현력이 떨어짐.
        String stringModelNumber = "a20421-100-1";

        // 값객체로 사용하면 표현력이 증가함.
        ModelNumber modelNumber = new ModelNumber("a20421", "100", "1");
    }


}
