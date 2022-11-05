package com.curiouscat.myblog.dao;

import com.curiouscat.myblog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author: theresa
 * @Date: 11/4/22
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> { ////operated on Comment entity, Long as its id type

    List<Comment> findCommentsByPostId(Long postId);
}
