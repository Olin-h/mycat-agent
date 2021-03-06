package io.mycat.agent.entity;

import java.io.Serializable;

public class MycatConnection implements Serializable {
    private Integer id;

    private String processor;

    private String cHost;

    private Integer cPort;

    private Integer lPort;

    private Long netIn;

    private Long netOut;

    private String cUser;

    private String cSchema;

    private String cCharset;

    private Long aliveTime;

    private Integer recvBuffer;

    private Integer sendQueue;

    private String txlevel;

    private String autocommit;

    private Integer mycatId;

    private Long collectTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getcHost() {
        return cHost;
    }

    public void setcHost(String cHost) {
        this.cHost = cHost;
    }

    public Integer getcPort() {
        return cPort;
    }

    public void setcPort(Integer cPort) {
        this.cPort = cPort;
    }

    public Integer getlPort() {
        return lPort;
    }

    public void setlPort(Integer lPort) {
        this.lPort = lPort;
    }

    public Long getNetIn() {
        return netIn;
    }

    public void setNetIn(Long netIn) {
        this.netIn = netIn;
    }

    public Long getNetOut() {
        return netOut;
    }

    public void setNetOut(Long netOut) {
        this.netOut = netOut;
    }

    public String getcUser() {
        return cUser;
    }

    public void setcUser(String cUser) {
        this.cUser = cUser;
    }

    public String getcSchema() {
        return cSchema;
    }

    public void setcSchema(String cSchema) {
        this.cSchema = cSchema;
    }

    public String getcCharset() {
        return cCharset;
    }

    public void setcCharset(String cCharset) {
        this.cCharset = cCharset;
    }

    public Long getAliveTime() {
        return aliveTime;
    }

    public void setAliveTime(Long aliveTime) {
        this.aliveTime = aliveTime;
    }

    public Integer getRecvBuffer() {
        return recvBuffer;
    }

    public void setRecvBuffer(Integer recvBuffer) {
        this.recvBuffer = recvBuffer;
    }

    public Integer getSendQueue() {
        return sendQueue;
    }

    public void setSendQueue(Integer sendQueue) {
        this.sendQueue = sendQueue;
    }

    public String getTxlevel() {
        return txlevel;
    }

    public void setTxlevel(String txlevel) {
        this.txlevel = txlevel;
    }

    public String getAutocommit() {
        return autocommit;
    }

    public void setAutocommit(String autocommit) {
        this.autocommit = autocommit;
    }

    public Integer getMycatId() {
        return mycatId;
    }

    public void setMycatId(Integer mycatId) {
        this.mycatId = mycatId;
    }

    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", processor=").append(processor);
        sb.append(", cHost=").append(cHost);
        sb.append(", cPort=").append(cPort);
        sb.append(", lPort=").append(lPort);
        sb.append(", netIn=").append(netIn);
        sb.append(", netOut=").append(netOut);
        sb.append(", cUser=").append(cUser);
        sb.append(", cSchema=").append(cSchema);
        sb.append(", cCharset=").append(cCharset);
        sb.append(", aliveTime=").append(aliveTime);
        sb.append(", recvBuffer=").append(recvBuffer);
        sb.append(", sendQueue=").append(sendQueue);
        sb.append(", txlevel=").append(txlevel);
        sb.append(", autocommit=").append(autocommit);
        sb.append(", mycatId=").append(mycatId);
        sb.append(", collectTime=").append(collectTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}