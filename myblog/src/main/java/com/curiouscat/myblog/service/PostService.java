package com.curiouscat.myblog.service;

import com.curiouscat.myblog.payload.PostDto;
import com.curiouscat.myblog.payload.PostResponse;

import java.util.List;

/**
 * @Description: define basic CRUD methods for posts
 * @Author: theresa
 * @Date: 11/4/22
 */
public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPost();

    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

    PostResponse searchPostByContentContains(String content);

}
