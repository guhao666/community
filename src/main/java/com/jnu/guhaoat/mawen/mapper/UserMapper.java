package com.jnu.guhaoat.mawen.mapper;

import com.jnu.guhaoat.mawen.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author guhao
 * @creat 2021-07-12 16:38
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modify) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModify})")
    void insert(User user);
}
