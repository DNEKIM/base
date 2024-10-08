package com.kim.ggami.service;

import com.kim.ggami.dto.BoardSaveDto;
import com.kim.ggami.entity.QBoard;
import com.kim.ggami.entity.QComment;
import com.kim.ggami.entity.QUser;
import com.kim.ggami.entity.User;
import com.kim.ggami.repository.BoardRepository;
import com.kim.ggami.repository.CommentRepository;
import com.kim.ggami.repository.UserRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {

    private final JPAQueryFactory jpaQueryFactory;
    private final BoardRepository boardRepository;
    private final UserRepository userRepository;
    private final CommentRepository commentRepository;
    QUser qUser = QUser.user;
    QBoard qBoard = QBoard.board;
    QComment qComment = QComment.comment;

    public String boardSave(){


        try {

            BoardSaveDto boardSaveDto = new BoardSaveDto("dani", "1");
            User user = new User();
            user.setName(boardSaveDto.getName());
            user.setPassword(boardSaveDto.getPassword());
            userRepository.save(user);
            return "true";
        } catch (Exception e) {
            log.info("{}",e);
            return "false";
        }

    }

}
