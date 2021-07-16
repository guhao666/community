package com.jnu.guhaoat.mawen.model;

import lombok.Data;

/**
 * @author guhao
 * @creat 2021-07-12 22:54
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
}
