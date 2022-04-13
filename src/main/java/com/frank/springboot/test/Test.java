package com.frank.springboot.test;


import com.frank.springboot.SpringbootStart;
import com.frank.springboot.aop.AopTest;
import com.frank.springboot.bean.BookEntity;
import com.frank.springboot.dao.CommonMapper;
import com.frank.springboot.log.Log;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.ClassUtils;

import javax.swing.text.StyledEditorKit;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Package: com.frank.springboot.test
 * @ClassName: Test
 * @Author Frank
 * @Data 2022-03-15-12:25
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootStart.class)
@WebAppConfiguration
public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    @Autowired
    private CommonMapper commonMapper;

    @org.junit.Test
    public void test() {
        List<BookEntity> bookEntities = commonMapper.selectBookAll();
        Iterator<BookEntity> iterator = bookEntities.iterator();
        while (iterator.hasNext()){
            BookEntity b =  (BookEntity)iterator.next();
            System.out.println(b.toString());
        }
    }

    @org.junit.Test
    public void testLoader(){

        List<String> strings = SpringFactoriesLoader.loadFactoryNames(Log.class, ClassUtils.getDefaultClassLoader());

        System.out.println(Arrays.asList(strings));
    }

    @org.junit.Test
    public void testLoaderInstance(){
        List<Log> logs = SpringFactoriesLoader.loadFactories(Log.class, ClassUtils.getDefaultClassLoader());
        Iterator<Log> iterator = logs.iterator();
        while(iterator.hasNext()){
            Log next = iterator.next();
            next.debug();
        }
    }

    @org.junit.Test
    public void testLoadingFactoryNames(){
        List<String> strings = SpringFactoriesLoader.loadFactoryNames(Log.class, ClassUtils.getDefaultClassLoader());
        for (String str:strings){
            System.out.println(str);
        }
    }


    @org.junit.Test
    public void testAop(){
        AopTest test = new AopTest();
        test.test();
    }

}
