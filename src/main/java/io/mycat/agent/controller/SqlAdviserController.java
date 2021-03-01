package io.mycat.agent.controller;

import io.mycat.agent.service.SqlAdviserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/sql-adviser")
public class SqlAdviserController {
    @Resource
    private SqlAdviserService sqlAdviserService;

    /**
     * 获取SQL建议
     *
     * @param request
     * @return
     * @throws
     * @Title: getAdvice
     */
    @RequestMapping(value = "/advice", method = {RequestMethod.POST, RequestMethod.GET})
    public Object getAdvice(HttpServletRequest request) {
        Long serverId = new Long(request.getParameter("serverId").toString());
        String schema = request.getParameter("schema");
        String sql = request.getParameter("sql");
        return sqlAdviserService.getAdvice(serverId, schema, sql);
    }
}
