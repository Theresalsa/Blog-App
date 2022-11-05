package com.curiouscat.myblog.service.impl;

import com.curiouscat.myblog.dao.PostRepository;
import com.curiouscat.myblog.payload.PostDto;
import com.curiouscat.myblog.payload.PostResponse;
import com.curiouscat.myblog.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: implementation class for post service //TODO:
 * @Author: theresa
 * @Date: 11/4/22
 */

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PostDto createPost(PostDto postDto) {
        return null;
    }

    @Override
    public List<PostDto> getAllPost() {
        return null;
    }

    @Override
    public PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir) {
        return null;
    }

    @Override
    public PostDto getPostById(long id) {
        return null;
    }

    @Override
    public PostDto updatePost(PostDto postDto, long id) {
        return null;
    }

    @Override
    public void deletePostById(long id) {

    }

    @Override
    public PostResponse searchPostByContentContains(String content) {
        return null;
    }
}
