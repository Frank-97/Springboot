package com.frank.springboot.bean;

import com.frank.springboot.deferred.DeferredImportSelectorDemo;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @Package: com.frank.springboot.bean
 * @ClassName: ImportBean
 * @Author Frank
 * @Data 2022-03-16-9:56
 * @Description:
 */
@Component
@Import(DeferredImportSelectorDemo.class)
public class ImportBean {
}
