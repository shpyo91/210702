package com.example.springboot.dao;

import com.example.springboot.domain.BoardVO;

import java.util.List;

public interface BoardDAO {
    List<BoardVO> getBoard();
}
