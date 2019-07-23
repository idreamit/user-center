package com.itcrazy.usercenter;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class LombokTest {
//    public static final Logger LOGGER= LoggerFactory.getLogger(LombokTest.class);

    public static void main(String[] args) {
        UserRegisterDTO userRegisterDTO=new UserRegisterDTO();
        userRegisterDTO.builder().email("itcrazy2016@163.com").agreement(true);
//        LOGGER.info("haha");
        log.info("aaa");
    }

}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class UserRegisterDTO{
    private String email;
    private String password;
    private String confirmPassword;
    private String mobile;
    private boolean agreement;
}
