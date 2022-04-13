package com.frank.springboot.log;

/**
 * @Package: com.frank.springboot.log
 * @ClassName: Lf4jLog
 * @Author Frank
 * @Data 2022-03-16-8:49
 * @Description:
 */
public class Lf4jLog implements Log{
    @Override
    public void debug() {
        System.out.println("Lf4jLog");
    }
}
