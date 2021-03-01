package io.mycat.agent.dto;


import io.mycat.agent.entity.MysqlServer;

public class MysqlNodeDto {
    private MysqlServer mysqlServer;

    private String clusterName = "";

    /**
     * @return the mysqlServer
     */
    public MysqlServer getMysqlServer() {
        return mysqlServer;
    }

    /**
     * @param mysqlServer the mysqlServer to set
     */
    public void setMysqlServer(MysqlServer mysqlServer) {
        this.mysqlServer = mysqlServer;
    }

    /**
     * @return the clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * @param clusterName the clusterName to set
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

}
