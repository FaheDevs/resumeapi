package com.faheDevs.resumeapi.apiManagement.commentsManagment;

import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@Hidden
public interface CommentRepository  {

    List<Comment> getAllComments();
}
