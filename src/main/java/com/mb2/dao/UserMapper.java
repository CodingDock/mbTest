package com.mb2.dao;

import com.mb2.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/12/16.
 */
@Repository
public interface UserMapper {

    @Select("SELECT * FROM t_user WHERE id = #{userId}")
    User getUser(@Param("userId") int userId);
    
    User getFirstrecord(String time);
    
}
