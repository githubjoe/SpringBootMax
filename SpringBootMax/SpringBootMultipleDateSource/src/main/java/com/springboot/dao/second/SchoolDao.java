package com.springboot.dao.second;

import com.springboot.vo.SchoolVo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by shuai on 2017/5/28.
 */
public interface SchoolDao {

    public SchoolVo findByName(@Param(value = "schoolName") String schoolName);
}
