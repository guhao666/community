package com.jnu.guhaoat.mawen.dto;

import com.jnu.guhaoat.mawen.model.User;
import lombok.Data;

/**
 * @author guhao
 * @creat 2021-07-13 14:49
 */
@Data
public class QuestionDTO {
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
    private User user;
}
