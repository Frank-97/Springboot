package com.frank.springboot.deferred;


import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;


/**
 * @Package: com.frank.springboot.deferred
 * @ClassName: DeferredImportSelectorDemo
 * @Author Frank
 * @Data 2022-03-16-9:37
 * @Description:
 */
public class DeferredImportSelectorDemo implements DeferredImportSelector {


    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{};
    }

    //返回实现Group接口的类
    @Override
    public Class<? extends Group> getImportGroup() {
        return DeferredImportSelectorGroupDemo.class;
    }

    //自定义一个实现Group接口的类
    private static class DeferredImportSelectorGroupDemo implements Group{

        List<Entry> list = new ArrayList<>();
        //收集 需要实例化的类
        @Override
        public void process(AnnotationMetadata annotationMetadata, DeferredImportSelector deferredImportSelector) {

            String[] strings = deferredImportSelector.selectImports(annotationMetadata);

            for (String str : strings){
                list.add(new Entry(annotationMetadata,str));
            }
        }

        //把收集的类返回给spring容器
        @Override
        public Iterable<Entry> selectImports() {
            return list;
        }
    }
}



