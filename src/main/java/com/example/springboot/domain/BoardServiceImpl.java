package com.example.springboot.domain;

import com.example.springboot.dao.BoardDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardDAO dao;

    @Override
    public List<BoardVO> printBoard(){
        List<BoardVO> board = dao.getBoard();

        return board;
    }
}
