package io.mycat.agent.controller;

import io.mycat.agent.service.StatementService;
import io.mycat.agent.service.SuggestionService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class AgentController {
    @Resource
    private StatementService statementService;

    @Resource
    private SuggestionService suggestionService;

    /**
     * 查看执行计划
     *
     * @param request
     * @return
     * @throws
     * @Title: getExplain
     */
    @RequestMapping(value = "/get/explain", method = {RequestMethod.POST, RequestMethod.GET})
    public Object getExplain(HttpServletRequest request) {
        Long serverId = new Long(request.getParameter("serverId").toString());
        String schema = request.getParameter("schema");
        String sql = request.getParameter("sql");

        return statementService.getExplain(serverId, schema, sql);
    }

    /**
     * 根据指定MySQL节点的状态，获取优化建议
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getSuggestion
     */
    @RequestMapping(value = "/suggestion/{serverId}", method = {RequestMethod.POST, RequestMethod.GET})
    public Object getSuggestion(@PathVariable Long serverId) {
        return suggestionService.getSuggestion(serverId);
    }

}
