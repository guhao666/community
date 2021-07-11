package com.jnu.guhaoat.mawen.provider;

import com.alibaba.fastjson.JSON;
import com.jnu.guhaoat.mawen.dto.AccessTokenDTO;
import com.jnu.guhaoat.mawen.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author guhao
 * @creat 2021-07-03 22:25
 */
@Component
public class GithubProvider {
    public String getAccessToken(AccessTokenDTO accessTokenDTO) {
       MediaType mediaType = MediaType.get("application/json; charset=utf-8");
       OkHttpClient client = new OkHttpClient();
       RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
       Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
       try (Response response = client.newCall(request).execute()) {
           String output = response.body().string();
           String[] split = output.split("&");
           String tokenString = split[0];
           String[] tokenSplit = tokenString.split("=");
           String accessToken = tokenSplit[1];
//           System.out.println(output);
//           return output;
           System.out.println(accessToken);
           return accessToken;
        }catch (IOException e){
            e.printStackTrace();
       }
       return null;
    }
    public static GithubUser getUser(String accessToken){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token="+accessToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String output = response.body().string();
            GithubUser githubUser = JSON.parseObject(output, GithubUser.class);
            return githubUser;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
