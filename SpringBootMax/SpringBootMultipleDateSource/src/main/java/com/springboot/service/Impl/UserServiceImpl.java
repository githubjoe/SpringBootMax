package com.springboot.service.Impl;

import com.springboot.dao.master.UserDao;
import com.springboot.dao.second.SchoolDao;
import com.springboot.service.UserService;
import com.springboot.vo.SchoolVo;
import com.springboot.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shuai on 2017/5/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private SchoolDao schoolDao;

    public UserVo getUser(Long id) {
        UserVo userVo = userDao.findById(id);
        SchoolVo schoolVo = schoolDao.findByName("清华");
        userVo.setSchoolVo(schoolVo);
        return userVo;
    }

}
