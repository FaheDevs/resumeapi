package com.faheDevs.resumeapi.controllers;

import com.faheDevs.resumeapi.apiManagement.commentsManagment.Comment;
import com.faheDevs.resumeapi.apiManagement.commentsManagment.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public ResponseEntity<List<Comment>> getAllComments() {
        return ResponseEntity.ok(commentService.getAllComments());
    }

    @PostMapping
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {
        Comment newComment = commentService.createComment(comment);
        return new ResponseEntity<>(newComment, HttpStatus.CREATED);
    }

    // Additional endpoints for updating or deleting comments can be added here.
}