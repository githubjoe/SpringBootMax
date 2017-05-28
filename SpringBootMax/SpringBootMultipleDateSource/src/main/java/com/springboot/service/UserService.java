package com.springboot.service;

import com.springboot.dao.master.UserDao;
import com.springboot.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.PriorityQueue;

/**
 * Created by shuai on 2017/5/28.
 */
public interface UserService {

    public UserVo getUser(Long id);


}
