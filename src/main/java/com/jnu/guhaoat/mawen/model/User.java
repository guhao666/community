package com.jnu.guhaoat.mawen.model;

import lombok.Data;

/**
 * @author guhao
 * @creat 2021-07-12 16:40
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModify;
}
