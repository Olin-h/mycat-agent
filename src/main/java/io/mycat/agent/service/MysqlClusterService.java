package io.mycat.agent.service;

import io.mycat.agent.entity.MysqlCluster;
import io.mycat.agent.dto.ClusterNetworkDto;
import io.mycat.agent.dto.RestResponse;

import java.util.List;

public interface MysqlClusterService {
    /**
     * 获取所有MySQL集群
     *
     * @return
     * @throws
     * @Title: getAllClusters
     */
    public List<MysqlCluster> getAllClusters();

    /**
     * 获取指定集群的拓扑节点信息
     *
     * @param clusterId
     * @return
     * @throws
     * @Title: getClusterNetworkById
     */
    public ClusterNetworkDto getClusterNetworkById(Long clusterId);

    /**
     * 保存集群
     *
     * @param id
     * @param name
     * @return
     * @throws
     * @Title: saveCluster
     */
    public RestResponse<String> saveCluster(Long id, String name);

    /**
     * 删除集群
     *
     * @param id
     * @return
     * @throws
     * @Title: deleteCluster
     */
    public RestResponse<String> deleteCluster(Long id);
}
