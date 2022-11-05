package com.curiouscat.myblog.service;

import com.curiouscat.myblog.payload.CommentDto;

import java.util.List;

/**
 * @Description: define basic CRUD methods for comments
 * @Author: theresa
 * @Date: 11/4/22
 */
public interface CommentService {

    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getcommentById(long postId, long commentId);

    CommentDto updateComment(long postId, long commentId, CommentDto commentDtoRequest);

    void deleteComment(long postId, long commentId);

}
