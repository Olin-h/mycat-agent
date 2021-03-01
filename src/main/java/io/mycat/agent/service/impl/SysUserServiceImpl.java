package io.mycat.agent.service.impl;

import io.mycat.agent.entity.Constant;
import io.mycat.agent.entity.SysUser;
import io.mycat.agent.entity.SysUserExample;
import io.mycat.agent.entity.SysUserExample.Criteria;
import io.mycat.agent.dto.RestResponse;
import io.mycat.agent.mapper.SysUserMapper;
import io.mycat.agent.service.SysUserService;
import io.mycat.agent.util.Md5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    /* (non-Javadoc)
     * @see io.mycat.eye.agent.service.LoginService#login()
     */
    @Override
    public RestResponse<String> login(String username, String password) {
        RestResponse<String> restResponse = new RestResponse<>();
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(example);
        if (sysUsers.isEmpty()) {
            restResponse.setCode(Constant.FAIL_SYS_USER_NOT_EXIST_CODE);
            restResponse.setMessage(Constant.FAIL_SYS_USER_NOT_EXIST_MESSAGE);
        } else {
            SysUser sysUser = sysUsers.get(0);
            String md5Password = Md5Util.getMd5(password);
            if (sysUser.getPassword().equals(md5Password)) {
                restResponse.setCode(Constant.SUCCESS_CODE);
                restResponse.setMessage(Constant.SUCCESS_MESSAGE);
                restResponse.setData(username);
            } else {
                restResponse.setCode(Constant.FAIL_SYS_USER_PASSWORD_ERROR_CODE);
                restResponse.setMessage(Constant.FAIL_SYS_USER_PASSWORD_ERROR_MESSAGE);
            }
        }
        return restResponse;
    }

    @Override
    public RestResponse<String> modifyPassword(String username, String newPassword) {
        RestResponse<String> restResponse = new RestResponse<>();
        SysUserExample example = new SysUserExample();
        Criteria createCriteria = example.createCriteria();
        createCriteria.andUsernameEqualTo(username);
        List<SysUser> list = sysUserMapper.selectByExample(example);
        if (list == null || list.isEmpty()) {
            restResponse.setCode(Constant.FAIL_SYS_USER_NOT_EXIST_CODE);
            restResponse.setMessage(Constant.FAIL_SYS_USER_NOT_EXIST_MESSAGE);
        } else {
            try {
                SysUser sysUser = list.get(0);
                String passwordMD5 = Md5Util.getMd5(newPassword);
                sysUser.setPassword(passwordMD5);
                sysUserMapper.updateByPrimaryKey(sysUser);
                restResponse.setCode(Constant.SUCCESS_CODE);
                restResponse.setMessage(Constant.SUCCESS_MESSAGE);
                restResponse.setData(username);
            } catch (Exception e) {
                restResponse.setCode(Constant.FAIL_SYS_USER_MODIFY_PASSWORD_ERROR_CODE);
                restResponse.setMessage(Constant.FAIL_SYS_USER_MODIFY_PASSWORD_ERROR_MESSAGE);
            }
        }
        return restResponse;
    }
}
