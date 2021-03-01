package io.mycat.agent.service;

import io.mycat.agent.entity.MysqlServer;
import io.mycat.agent.dto.*;


public interface MysqlService {
    /**
     * 验证MySQL登录身份、版本、内置schema
     *
     * @param host
     * @param port
     * @param username
     * @param password
     * @return
     * @throws
     * @Title: verify
     */
    RestResponse<Object> mysqlVerify(String host, Integer port, String username, String password);

    /**
     * 获取MySQL节点的分页列表
     *
     * @param draw
     * @param startIndex
     * @param pageSize
     * @return
     * @throws
     * @Title: getNodeList
     */
    PagedDto<MysqlNodeDto> getNodeList(int draw, int startIndex, int pageSize);

    /**
     * @param username  TODO
     * @param id        TODO
     *                  新增节点
     * @param host
     * @param port
     * @param password
     * @param tags
     * @param clusterId
     * @return
     * @throws
     * @Title: addNode
     */
    RestResponse<Object> saveNode(String username, Long id, String host, Integer port, String password, String tags, Long clusterId);

    /**
     * 删除节点信息
     *
     * @param id
     * @return
     * @throws
     * @Title: deleteNode
     */
    RestResponse<Object> deleteNode(Long id);

    /**
     * 获取MySQL节点信息
     *
     * @param id
     * @return
     * @throws
     * @Title: getNodeInfo
     */
    MysqlServer getNodeInfo(Long id);

    /**
     * 获取指定服务的二进制文件
     *
     * @param serverId 服务器ID
     * @return
     */
    RestResponse<Object> getBinaryLogs(Long serverId);

    /**
     * 获取指定服务器，指定二进制文件的内容
     *
     * @param serverId 服务器ID
     * @param logName  二进制日志文件名
     * @param begin    开始点
     * @param end      结束点
     * @return
     */
    RestResponse<Object> getBinaryLogData(Long serverId, String logName, Long begin, Long end);

    /**
     * 获取回话变量列表
     *
     * @param serverId
     * @return
     */
    RestResponse<Object> getSessionVariables(Long serverId);

    /**
     * 设置全局变量值
     *
     * @param serverId
     * @param name
     * @param value
     * @return
     */
    RestResponse<Object> setGlobalVariables(Long serverId, String name, String value);

    /**
     * 设置回话变量值
     *
     * @param serverId
     * @param name
     * @param value
     * @return
     */
    RestResponse<Object> setSessionVariables(Long serverId, String name, String value);

    /**
     * 获取数据库列表
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getDatabases
     */
    RestResponse<Object> getDatabases(Long serverId);

    /**
     * 获取指定数据库的表信息
     *
     * @param serverId
     * @param schema
     * @return
     * @throws
     * @Title: getTables
     */
    RestResponse<Object> getTables(Long serverId, String schema);

    /**
     * 根据schema获取相应的用户权限信息
     *
     * @param serverId
     * @param schema
     * @return
     * @throws
     * @Title: getUserPriv
     */
    RestResponse<Object> getUserPriv(Long serverId, String schema);

    /**
     * 获取节点概要信息
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getOverview
     */
    RestResponse<Object> getOverview(Long serverId);

    /**
     * 根据语句显示二进制文件内容
     *
     * @param serverId
     * @param showBinlogEvents
     * @return
     * @throws
     * @Title: getShowBinlogEvents
     */
    RestResponse<Object> getShowBinlogEvents(Long serverId, String showBinlogEvents);

    /**
     * 根据过滤条件获取全局变量
     *
     * @param serverId
     * @param filter
     * @return
     * @throws
     * @Title: getGlobalVariables
     */
    RestResponse<Object> getGlobalVariables(Long serverId, String filter);

    /**
     * 通过过滤条件查询状态
     *
     * @param serverId
     * @param filter
     * @return
     * @throws
     * @Title: getStatus
     */
    RestResponse<Object> getStatus(Long serverId, String filter);

    /**
     * 获取主库相关信息
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getMasterInfo
     */
    RestResponse<MasterInfoDto> getMasterInfo(Long serverId);

    /**
     * 获取从库相关信息
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getSlaveInfo
     */
    RestResponse<SlaveInfoDto> getSlaveInfo(Long serverId);
}
