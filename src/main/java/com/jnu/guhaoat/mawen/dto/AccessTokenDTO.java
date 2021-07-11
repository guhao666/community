package com.jnu.guhaoat.mawen.dto;

import lombok.Data;

/**
 * @author guhao
 * @creat 2021-07-03 22:33
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
