package com.frank.springboot.test;

import com.frank.springboot.aop.AopTest;
import com.frank.springboot.aop.MyAspact;
import org.junit.Test;

/**
 * @Package: com.frank.springboot.test
 * @ClassName: Main
 * @Author Frank
 * @Data 2022-03-28-18:54
 * @Description:
 */
public class Main {


    public static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {


    }

    @Test
    public  void testVolatile(){
        new Thread(()->{
            for (int i = 0; i <= 1000; i++) {
                System.out.println(i);

                while(flag){
                    System.out.println("停止了");
                    break;
                }
                if(flag){
                    break;
                }
            }
        }).start();

        System.out.println("===================");

        new Thread(()->{
            flag = true;
        }).start();

        System.out.println(">>>>>>>>"+flag);

    }

    int  a=0;
    @Test
    public void testStart(){


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(a);
            }
        });

        a=10;

        t1.start();

    }




}
