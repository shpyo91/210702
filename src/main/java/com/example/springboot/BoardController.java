package com.example.springboot;

import com.example.springboot.domain.BoardService;
import com.example.springboot.domain.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<BoardVO> board = boardService.printBoard();

        model.addAttribute("list", board);

        return "list";
    }
}
