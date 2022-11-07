package com.curiouscat.myblog.controller;

import com.curiouscat.myblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: theresa
 * @Date: 11/4/22
 */
@Controller
@RequestMapping("/api/v1/posts")
public class PostController {

    @Autowired
    private PostService postService;

    private MessageSource messageSource;

    //TODO:
}
