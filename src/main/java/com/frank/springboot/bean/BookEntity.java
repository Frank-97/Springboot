package com.frank.springboot.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @Package: com.frank.springboot.bean
 * @ClassName: BookEntity
 * @Author Frank
 * @Data 2022-03-15-12:13
 * @Description:
 */
@Getter
@Setter
public class BookEntity {

    private String isbn;
    private String book_name;
    private String price;

    @Override
    public String toString() {
        return "BookEntity{" +
                "isbn='" + isbn + '\'' +
                ", book_name='" + book_name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
