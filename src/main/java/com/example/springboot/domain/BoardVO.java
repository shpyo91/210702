package com.example.springboot.domain;

import lombok.Getter;

import java.util.Date;

@Getter
public class BoardVO {
    /*
     * CREATE TABLE `tab_board`
     * (`bno` int(11) NOT NULL AUTO_INCREMENT,
     * `title` varchar(45) NOT NULL,
     * `content` text NOT NULL,
     * `regDate` timestamp NOT NULL DEFAULT current_timestamp(),
     * `viewCnt` int(11) DEFAULT 0,
     * PRIMARY KEY (`bno`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;
     *
     *
     * bno : 각 게시물을 구분할 고유 번호
     * title : 게시물의 제목
     * content : 게시물 내용
     * regDate: 작성일
     * viewCnt : 조회수
     */

    private int bno;
    private String title;
    private String content;
    private Date regDate;
    private int viewCnt;

}
