package com.example.demo.entity;

import javax.persistence.Table;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2020/3/5
 * @time: 11:34
 * @fuction: about the role of class.
 */
@Table(name = "book")
public class BookInfo {
    private String bookId;
    private String bookName;
    private Integer number;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
