package io.mycat.agent.service;

import io.mycat.agent.entity.InnodbLockWaits;
import io.mycat.agent.entity.InnodbTrx;
import io.mycat.agent.dto.PagedDto;

public interface InnodbService {
    /**
     * 获取innodb状态
     *
     * @param serverId
     * @return
     */
    String getStatus(Long serverId);

    /**
     * 获取innodb事务信息
     *
     * @param serverId
     * @return
     */
    PagedDto<InnodbTrx> getInnodbTrxs(Long serverId);

    /**
     * 获取innodb锁等待信息
     *
     * @param serverId
     * @return
     */
    PagedDto<InnodbLockWaits> getInnodbLockWaits(Long serverId);


}
