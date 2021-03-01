package io.mycat.agent.controller;

import io.mycat.agent.service.MysqlService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/mysql")
public class MysqlController {

    @Resource
    private MysqlService mysqlService;

    /**
     * 获取二进制文件列表
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getBinaryLogs
     */
    @RequestMapping(value = "/{serverId}/binaryLogs", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getBinaryLogs(@PathVariable Long serverId) {
        return mysqlService.getBinaryLogs(serverId);
    }

    /**
     * 显示二进制文件内容
     *
     * @param serverId
     * @param logName
     * @param begin
     * @param end
     * @return
     * @throws
     * @Title: getBinaryLogData
     */
    @RequestMapping(value = "/{serverId}/binaryLogs/{logName}/{begin}/{end}", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getBinaryLogData(@PathVariable Long serverId, @PathVariable String logName, @PathVariable Long begin,
                                   @PathVariable Long end) {
        return mysqlService.getBinaryLogData(serverId, logName, begin, end);
    }

    /**
     * 根据语句显示二进制文件内容
     *
     * @param serverId
     * @param request
     * @return
     * @throws
     * @Title: getShowBinlogEvents
     */
    @RequestMapping(value = "/{serverId}/showBinlogEvents", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getShowBinlogEvents(@PathVariable Long serverId, HttpServletRequest request) {
        String showBinlogEvents = request.getParameter("showBinlogEvents");
        return mysqlService.getShowBinlogEvents(serverId, showBinlogEvents);
    }

    /**
     * 获取全局变量
     *
     * @param serverId
     * @param request
     * @return
     * @throws
     * @Title: getGlobalVariables
     */
    @RequestMapping(value = "/{serverId}/globalVariables", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getGlobalVariables(@PathVariable Long serverId, HttpServletRequest request) {
        String filter = request.getParameter("filter");
        return mysqlService.getGlobalVariables(serverId, filter);
    }

    /**
     * 获取会话变量
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getSessionVariables
     */
    @RequestMapping(value = "/{serverId}/sessionVariables", method = {RequestMethod.GET})
    public Object getSessionVariables(@PathVariable Long serverId) {
        return mysqlService.getSessionVariables(serverId);
    }

    /**
     * 设置全局变量值
     *
     * @param serverId
     * @param name
     * @param value
     * @return
     * @throws
     * @Title: setGlobalVariables
     */
    @RequestMapping(value = "/{serverId}/globalVariables/{name}/{value}/")
    @CrossOrigin(origins = "*")
    public Object setGlobalVariables(@PathVariable Long serverId, @PathVariable String name, @PathVariable String value) {
        return mysqlService.setGlobalVariables(serverId, name, value);
    }

    /**
     * 设置会话变量值
     *
     * @param serverId
     * @param name
     * @param value
     * @return
     * @throws
     * @Title: setSessionVariables
     */
    @RequestMapping(value = "/{serverId}/sessionVariables/{name}/{value}/", method = {RequestMethod.POST})
    public Object setSessionVariables(@PathVariable Long serverId, @PathVariable String name,
                                      @PathVariable String value) {
        return mysqlService.setSessionVariables(serverId, name, value);
    }

    /**
     * MySQL登录身份验证
     *
     * @param host
     * @param port
     * @param username
     * @param password
     * @return
     * @throws
     * @Title: mysqlVerify
     */
    @RequestMapping(value = "/verify/{host}/{port}/{username}/{password}", method = {RequestMethod.POST,
            RequestMethod.GET})
    public Object mysqlVerify(@PathVariable String host, @PathVariable Integer port, @PathVariable String username,
                              @PathVariable String password) {
        return mysqlService.mysqlVerify(host, port, username, password);
    }

    /**
     * 获取数据库列表
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getDatabases
     */
    @RequestMapping(value = "/{serverId}/databases", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getDatabases(@PathVariable Long serverId) {
        return mysqlService.getDatabases(serverId);
    }

    /**
     * 获取数据库列表
     *
     * @param serverId
     * @param schema
     * @return
     * @throws
     * @Title: getDatabases
     */
    @RequestMapping(value = "/{serverId}/{schema}/tables", method = {RequestMethod.GET})
    public Object getDatabases(@PathVariable Long serverId, @PathVariable String schema) {
        return mysqlService.getTables(serverId, schema);
    }

    /**
     * 根据Schema获取对应用户权限信息
     *
     * @param serverId
     * @param schema
     * @return
     * @throws
     * @Title: getUserPriv
     */
    @RequestMapping(value = "/{serverId}/{schema}/priv", method = {RequestMethod.GET})
    public Object getUserPriv(@PathVariable Long serverId, @PathVariable String schema) {
        return mysqlService.getUserPriv(serverId, schema);
    }

    /**
     * 获取状态
     *
     * @param serverId
     * @param request
     * @return
     * @throws
     * @Title: getStatus
     */
    @RequestMapping(value = "/{serverId}/status", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getStatus(@PathVariable Long serverId, HttpServletRequest request) {
        String filter = request.getParameter("filter");
        return mysqlService.getStatus(serverId, filter);
    }

    /**
     * 获取节点概要信息
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getOverview
     */
    @RequestMapping(value = "/get/overview/{serverId}", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getOverview(@PathVariable Long serverId) {
        return mysqlService.getOverview(serverId);
    }

    /**
     * 获取主库相关信息
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getMasterInfo
     */
    @RequestMapping(value = "/{serverId}/master-info", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getMasterInfo(@PathVariable Long serverId) {
        return mysqlService.getMasterInfo(serverId);
    }

    /**
     * 获取从库相关信息
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getSlaveInfo
     */
    @RequestMapping(value = "/{serverId}/slave-info", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getSlaveInfo(@PathVariable Long serverId) {
        return mysqlService.getSlaveInfo(serverId);
    }

    /**
     * 获取节点列表
     *
     * @param request
     * @return
     * @throws
     * @Title: getNodeList
     */
    @RequestMapping(value = "/node/list", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getNodeList(HttpServletRequest request) {
        int draw = Integer.parseInt(request.getParameter("draw"));
        int startIndex = Integer.parseInt(request.getParameter("start"));
        int pageSize = Integer.parseInt(request.getParameter("length"));
        return mysqlService.getNodeList(draw, startIndex, pageSize);
    }

    /**
     * 保存节点信息
     *
     * @param request
     * @return
     * @throws
     * @Title: saveNode
     */
    @RequestMapping(value = "/node/save", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object saveNode(HttpServletRequest request) {
        Long id = Long.parseLong(request.getParameter("id"));
        String host = request.getParameter("host");
        Integer port = Integer.parseInt(request.getParameter("port"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String tags = request.getParameter("tags");
        Long clusterId = Long.parseLong(request.getParameter("clusterId"));
        return mysqlService.saveNode(username, id, host, port, password, tags, clusterId);
    }

    /**
     * 删除节点信息
     *
     * @param request
     * @return
     * @throws
     * @Title: deleteNode
     */
    @RequestMapping(value = "/node/delete", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object deleteNode(HttpServletRequest request) {
        Long id = Long.parseLong(request.getParameter("id"));
        return mysqlService.deleteNode(id);
    }

    /**
     * 获取节点信息
     *
     * @param request
     * @return
     * @throws
     * @Title: getNodeInfo
     */
    @RequestMapping(value = "/node/info", method = {RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public Object getNodeInfo(HttpServletRequest request) {
        Long id = Long.parseLong(request.getParameter("id"));
        return mysqlService.getNodeInfo(id);
    }
}
