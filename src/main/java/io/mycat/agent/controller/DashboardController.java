package io.mycat.agent.controller;

import io.mycat.agent.service.DashboardService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/dashboard")
public class DashboardController {
    @Resource
    private DashboardService dashboardService;

    /**
     * 获取控制台概要信息
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getDashboardOverview
     */
    @RequestMapping(value = "/{serverId}/dashboard-overview", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getDashboardOverview(@PathVariable Long serverId) {
        return dashboardService.getDashboardOverview(serverId);
    }

    /**
     * 获取控制台显示数据
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getDashboardProcesslist
     */
    @RequestMapping(value = "/{serverId}/processlist", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getDashboardProcesslist(@PathVariable Long serverId) {
        return dashboardService.getDashboardProcesslist(serverId);
    }
}
