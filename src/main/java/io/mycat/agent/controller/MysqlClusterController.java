package io.mycat.agent.controller;

import io.mycat.agent.dto.ClusterNetworkDto;
import io.mycat.agent.dto.RestResponse;
import io.mycat.agent.entity.MysqlCluster;
import io.mycat.agent.service.MysqlClusterService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class MysqlClusterController {
    @Resource
    private MysqlClusterService mysqlClusterService;

    /**
     * 获取所有集群信息
     *
     * @return
     * @throws
     * @Title: getAllClusters
     */
    @RequestMapping("/mysql/cluster/all")
    @CrossOrigin(origins = "*")
    public List<MysqlCluster> getAllClusters() {
        return mysqlClusterService.getAllClusters();
    }

    /**
     * 获取指定集群的拓扑节点信息
     *
     * @return
     * @throws
     * @Title: getClusterNetWorkById
     */
    @RequestMapping("/mysql/cluster/network")
    @CrossOrigin(origins = "*")
    public ClusterNetworkDto getClusterNetworkById(HttpServletRequest request) {
        //请求数据
        Long clusterId = Long.valueOf(request.getParameter("clusterId"));
        return mysqlClusterService.getClusterNetworkById(clusterId);
    }

    /**
     * 新增集群
     *
     * @param name
     * @return
     * @throws
     * @Title: addCluster
     */
    @RequestMapping("/mysql/cluster/save")
    @CrossOrigin(origins = "*")
    public RestResponse<String> saveCluster(HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        return mysqlClusterService.saveCluster(id, name);
    }

    /**
     * 删除集群
     *
     * @param request
     * @return
     * @throws
     * @Title: deleteCluster
     */
    @RequestMapping("/mysql/cluster/delete")
    @CrossOrigin(origins = "*")
    public RestResponse<String> deleteCluster(HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        return mysqlClusterService.deleteCluster(id);
    }
}
