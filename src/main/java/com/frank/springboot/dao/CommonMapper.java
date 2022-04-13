package com.frank.springboot.dao;

import com.frank.springboot.bean.BookEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Package: com.frank.springboot.dao
 * @ClassName: CommonMapper
 * @Author Frank
 * @Data 2022-03-15-12:10
 * @Description:
 */

public interface CommonMapper {

    @Select("select * from book")
    List<BookEntity> selectBookAll();

}
