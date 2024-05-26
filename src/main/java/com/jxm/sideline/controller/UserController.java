package com.jxm.sideline.controller;

import com.jxm.sideline.model.DO.CommonResponse;
import com.jxm.sideline.model.vo.WxUserInfoVO;
import com.jxm.sideline.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jiangyunkai <jiangyunkai@kuaishou.com>
 * Created on 2024-05-26
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    IUserService userService;

    @PostMapping("list")
    @ResponseBody
    public CommonResponse<?> list() {
        List<WxUserInfoVO> list = userService.list();

        return new CommonResponse<>(list);
    }
}
