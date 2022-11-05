package com.curiouscat.myblog.payload;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * @Description: dto class for Post
 * @Author: theresa
 * @Date: 11/4/22
 */
public class PostDto {

    private Long id;
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;
    //@JsonProperty("description_yyds")//if use "description" as the JSON field name, there will be an 500 internal error
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;
    @NotEmpty
    private String content;

    private Set<CommentDto> comments;

    public PostDto() {
    }

    public PostDto(Long id, String title, String description, String content, Set<CommentDto> comments) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<CommentDto> getComments() {
        return comments;
    }

    public void setComments(Set<CommentDto> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                //", comments=" + comments +
                '}';
    }
}
