package com.springboot.dao.master;

import com.springboot.vo.UserVo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by shuai on 2017/5/28.
 */
public interface UserDao {

    public UserVo findById (@Param(value = "id") Long id);
}
