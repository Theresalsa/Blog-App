package com.curiouscat.myblog.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @Description:
 * @Author: theresa
 * @Date: 11/4/22
 */
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("name") //fine not to add, will use "name" as the default
    private String name;

    private String email;

    private String body;

    private LocalDateTime createDateTime;

    private LocalDateTime updateDateTime;
    @ManyToOne(fetch = FetchType.LAZY)//TODO: to check whether it is fine to keep just one (under Comment and Post)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    public Comment() {
    }

    public Comment(Long id, String name, String email, String body, LocalDateTime createDateTime, LocalDateTime updateDateTime, Post post) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
        this.createDateTime = createDateTime;
        this.updateDateTime = updateDateTime;
        this.post = post;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                //", createDateTime=" + createDateTime +
                //", updateDateTime=" + updateDateTime +
                ", post=" + post +
                '}';
    }
}
