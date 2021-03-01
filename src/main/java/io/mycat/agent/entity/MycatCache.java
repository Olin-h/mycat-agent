package io.mycat.agent.entity;

import java.io.Serializable;

/**
 * TODO
 *
 * @author : OlinH
 * @version : v1.0
 * @since : 2021-03-01
 */
public class MycatCache implements Serializable {
    private Integer id;

    private String cache;

    private Integer cMax;

    private Integer cur;

    private Integer access;

    private Integer hit;

    private Integer put;

    private Integer lastAccess;

    private Integer lastPut;

    private Integer serverId;

    private Long collectTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public Integer getcMax() {
        return cMax;
    }

    public void setcMax(Integer cMax) {
        this.cMax = cMax;
    }

    public Integer getCur() {
        return cur;
    }

    public void setCur(Integer cur) {
        this.cur = cur;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public Integer getHit() {
        return hit;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
    }

    public Integer getPut() {
        return put;
    }

    public void setPut(Integer put) {
        this.put = put;
    }

    public Integer getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Integer lastAccess) {
        this.lastAccess = lastAccess;
    }

    public Integer getLastPut() {
        return lastPut;
    }

    public void setLastPut(Integer lastPut) {
        this.lastPut = lastPut;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
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
                ", cache=" + cache +
                ", cMax=" + cMax +
                ", cur=" + cur +
                ", access=" + access +
                ", hit=" + hit +
                ", put=" + put +
                ", lastAccess=" + lastAccess +
                ", lastPut=" + lastPut +
                ", serverId=" + serverId +
                ", collectTime=" + collectTime +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}
