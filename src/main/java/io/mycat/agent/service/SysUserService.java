package io.mycat.agent.service;

import io.mycat.agent.dto.RestResponse;

public interface SysUserService {

    /**
     * @param username TODO
     * @param password TODO
     *                 登录
     * @return
     * @throws
     * @Title: login
     */
    RestResponse<String> login(String username, String password);

    /**
     * 修改密码
     *
     * @param username
     * @param newPassword
     * @return
     * @throws
     * @Title: modifyPassword
     */
    RestResponse<String> modifyPassword(String username, String newPassword);

}
