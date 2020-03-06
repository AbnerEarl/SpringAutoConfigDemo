package com.example.demo.controller;

import com.alibaba.dubbo.common.json.JSON;
import com.example.demo.entity.BookInfo;
import com.example.demo.mapper.BookMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2020/3/5
 * @time: 11:37
 * @fuction: about the role of class.
 */
@Controller
public class BookInfoController {
    private static Logger logger = Logger.getLogger(BookInfoController.class);
    @Autowired
    BookMapper bookMapper;

    @ResponseBody
    @RequestMapping("/book")
    public String getBookInfo() throws IOException {
        List<BookInfo> bookInfoList = bookMapper.select(new BookInfo());
        logger.error("测试异常");
        return JSON.json(bookInfoList);
    }
}
