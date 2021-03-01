package io.mycat.agent.dto;

import io.mycat.agent.entity.MysqlServer;

import java.util.List;

public class ClusterNetworkDto {
    private List<MysqlServer> mysqlServers;
    private List<Relation> relations;

    /**
     * @return the mysqlServers
     */
    public List<MysqlServer> getMysqlServers() {
        return mysqlServers;
    }

    /**
     * @param mysqlServers the mysqlServers to set
     */
    public void setMysqlServers(List<MysqlServer> mysqlServers) {
        this.mysqlServers = mysqlServers;
    }

    /**
     * @return the relations
     */
    public List<Relation> getRelations() {
        return relations;
    }

    /**
     * @param relations the relations to set
     */
    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }
}
