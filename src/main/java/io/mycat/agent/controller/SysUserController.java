package io.mycat.agent.controller;

import io.mycat.agent.dto.RestResponse;
import io.mycat.agent.service.SysUserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/sysuser")
public class SysUserController
{
    @Resource
    private SysUserService sysUserService;
    @RequestMapping("/login")
    @CrossOrigin(origins = "*")
    public RestResponse<String> login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        return sysUserService.login(username, password);
    }
    
    @RequestMapping("/modify-password")
    @CrossOrigin(origins = "*")
    public RestResponse<String> modifyPassword(HttpServletRequest request) {
        String username = request.getParameter("username");
        String newPassword = request.getParameter("newPassword");
        return sysUserService.modifyPassword(username, newPassword);
    }
}
