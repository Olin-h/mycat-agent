package io.mycat.agent.service;

import io.mycat.agent.dto.PagedDto;
import io.mycat.agent.dto.Processlist;

public interface DashboardService {
    /**
     * 获取控制台概要信息
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getDashboardOverview
     */
    public Object getDashboardOverview(Long serverId);

    /**
     * 获取控制台显示数据
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getDashboardProcesslist
     */
    public PagedDto<Processlist> getDashboardProcesslist(Long serverId);
}
