package com.curiouscat.myblog.dao;

import com.curiouscat.myblog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author: theresa
 * @Date: 11/4/22
 */

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {//operated on Post entity, Long as its id type

    //can create various methods for different queries
    public List<Post> searchPostsByContentContains(String content);

}
