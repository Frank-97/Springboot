package com.frank.springboot.log;

/**
 * @Package: com.frank.springboot.log
 * @ClassName: Logback
 * @Author Frank
 * @Data 2022-03-16-8:50
 * @Description:
 */
public class Logback implements Log{
    @Override
    public void debug() {
        System.out.println("Logback");
    }
}
