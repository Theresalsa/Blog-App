package com.curiouscat.myblog.controller;

import com.curiouscat.myblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: theresa
 * @Date: 11/4/22
 */
@Service
@RequestMapping("/api/v1/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    //TODO:
}
