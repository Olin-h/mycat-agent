package io.mycat.agent.service;


import io.mycat.agent.dto.RestResponse;

public interface HealthCheckService {
    /**
     * 查询指定节点是否存在远程用户具备超级权限
     *
     * @param serverId
     * @return
     * @throws
     * @Title: superPriv
     */
    public RestResponse<Object> superPriv(Long serverId);

    /**
     * 检查是否有用户的密码是弱密码
     *
     * @param serverId
     * @return
     * @throws
     * @Title: weakPassword
     */
    public RestResponse<Object> weakPassword(Long serverId);

    /**
     * 检查是否有锁等待
     *
     * @param serverId
     * @return
     * @throws
     * @Title: lockWait
     */
    public RestResponse<Object> lockWait(Long serverId);

    /**
     * 检查是否有未完成的事务
     *
     * @param serverId
     * @return
     * @throws
     * @Title: transaction
     */
    public RestResponse<Object> transaction(Long serverId);

    /**
     * 检查是否有慢查询
     *
     * @param serverId
     * @return
     * @throws
     * @Title: slow
     */
    public RestResponse<Object> slow(Long serverId);

    /**
     * 检查是否存在非UTF8(UTF8MB4)的编码
     *
     * @param serverId
     * @return
     * @throws
     * @Title: charset
     */
    public RestResponse<Object> charset(Long serverId);

    /**
     * 检查连接数设置在当前环境下是否合理
     *
     * @param serverId
     * @return
     * @throws
     * @Title: connections
     */
    public RestResponse<Object> connections(Long serverId);

    /**
     * 检查复制状态是否正常
     *
     * @param serverId
     * @return
     * @throws
     * @Title: replication
     */
    public RestResponse<Object> replication(Long serverId);

    /**
     * 检查是否存在无用索引
     *
     * @param serverId
     * @return
     * @throws
     * @Title: unusedIndex
     */
    public RestResponse<Object> unusedIndex(Long serverId);

    /**
     * 检查是否存在没有设置主键的表
     *
     * @param serverId
     * @return
     * @throws
     * @Title: noPrimaryKey
     */
    public RestResponse<Object> noPrimaryKey(Long serverId);

    /**
     * 检查索引基数是否存在异常
     *
     * @param serverId
     * @return
     * @throws
     * @Title: indexCardinality
     */
    public RestResponse<Object> indexCardinality(Long serverId);

    /**
     * 检查是否存在冗余索引
     *
     * @param serverId
     * @return
     * @throws
     * @Title: redundantIndex
     */
    public RestResponse<Object> redundantIndex(Long serverId);
}
