package com.springboot.captcha;

import com.google.code.kaptcha.Producer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
public class CaptchaApplicationTests {

    @Resource
    private Producer captchaProducerMath;

    @Test
    void contextLoads() {
        String text = captchaProducerMath.createText();
        log.info(text);

    }

}
