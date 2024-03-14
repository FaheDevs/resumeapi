package com.faheDevs.resumeapi.apiManagement.commentsManagment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepositoryImpl commentRepository;


    public List<Comment> getAllComments() {
        return commentRepository.getAllComments();
    }


}
