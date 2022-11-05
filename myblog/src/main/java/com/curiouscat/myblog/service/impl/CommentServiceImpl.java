package com.curiouscat.myblog.service.impl;

import com.curiouscat.myblog.dao.CommentRepository;
import com.curiouscat.myblog.dao.PostRepository;
import com.curiouscat.myblog.payload.CommentDto;
import com.curiouscat.myblog.service.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: implementation class for comment service //TODO:
 * @Author: theresa
 * @Date: 11/4/22
 */

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDto createComment(long postId, CommentDto commentDto) {
        return null;
    }

    @Override
    public List<CommentDto> getCommentsByPostId(long postId) {
        return null;
    }

    @Override
    public CommentDto getcommentById(long postId, long commentId) {
        return null;
    }

    @Override
    public CommentDto updateComment(long postId, long commentId, CommentDto commentDtoRequest) {
        return null;
    }

    @Override
    public void deleteComment(long postId, long commentId) {

    }
}
