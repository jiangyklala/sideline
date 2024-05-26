package com.jxm.sideline.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.jxm.sideline.model.DO.WxUserInfoDO;
import com.jxm.sideline.model.service.WxUserInfoManager;
import com.jxm.sideline.model.vo.WxUserInfoVO;
import com.jxm.sideline.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jiangyk
 * Created on 2024-05-26
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    WxUserInfoManager wxUserInfoManager;

    @Override
    public List<WxUserInfoVO> list() {
        List<WxUserInfoDO> list = new LambdaQueryChainWrapper<>(wxUserInfoManager.getBaseMapper())
                .list();

        return list.stream()
                .map(this::convert)
                .toList();
    }

    private WxUserInfoVO convert(WxUserInfoDO wxUserInfoDO) {
        return WxUserInfoVO.builder()
                .name(wxUserInfoDO.getName())
                .type(wxUserInfoDO.getType())
                .points(wxUserInfoDO.getPoints())
                .openId(wxUserInfoDO.getOpenId())
                .build();
    }
}
