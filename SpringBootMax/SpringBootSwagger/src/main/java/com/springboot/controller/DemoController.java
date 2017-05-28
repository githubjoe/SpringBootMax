package com.springboot.controller;

import com.springboot.vo.UserVo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shuai on 2017/5/28.
 */
@Controller
@RequestMapping(value = "/api/demo")
public class DemoController {

    @ResponseBody
    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    @ApiOperation(value="测试getUser", notes="getUser详细说明", response = UserVo.class)
    public UserVo getCount(
            @ApiParam( required = true, name = "user", value = "入参为User对象") @RequestBody UserVo user
    ) {
        return user;
    }

}
