package io.mycat.agent.entity;

import java.io.Serializable;

/**
 * TODO
 *
 * @author : OlinH
 * @version : v1.0
 * @since : 2021-03-01
 */
public class MycatBackend implements Serializable {
    private Integer id;

    private String processor;

    private Integer mysqlid;

    private String cHost;

    private Integer cPort;

    private Integer lPort;

    private Long netIn;

    private Long netOut;

    private Long life;

    private String closed;

    private String borrowed;

    private Integer sendQueue;

    private String cSchema;

    private String cCharset;

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

    public Integer getMysqlid() {
        return mysqlid;
    }

    public void setMysqlid(Integer mysqlid) {
        this.mysqlid = mysqlid;
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

    public Long getLife() {
        return life;
    }

    public void setLife(Long life) {
        this.life = life;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public String getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(String borrowed) {
        this.borrowed = borrowed;
    }

    public Integer getSendQueue() {
        return sendQueue;
    }

    public void setSendQueue(Integer sendQueue) {
        this.sendQueue = sendQueue;
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
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", processor=" + processor +
                ", mysqlid=" + mysqlid +
                ", cHost=" + cHost +
                ", cPort=" + cPort +
                ", lPort=" + lPort +
                ", netIn=" + netIn +
                ", netOut=" + netOut +
                ", life=" + life +
                ", closed=" + closed +
                ", borrowed=" + borrowed +
                ", sendQueue=" + sendQueue +
                ", cSchema=" + cSchema +
                ", cCharset=" + cCharset +
                ", txlevel=" + txlevel +
                ", autocommit=" + autocommit +
                ", mycatId=" + mycatId +
                ", collectTime=" + collectTime +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}
