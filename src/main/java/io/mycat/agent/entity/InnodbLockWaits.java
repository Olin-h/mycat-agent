package io.mycat.agent.entity;

import java.io.Serializable;

/**
 * TODO
 *
 * @author : OlinH
 * @version : v1.0
 * @since : 2021-03-01
 */
public class InnodbLockWaits implements Serializable {
    private String requestingTrxId;

    private String requestedLockId;

    private String blockingTrxId;

    private String blockingLockId;

    private static final long serialVersionUID = 1L;

    public String getRequestingTrxId() {
        return requestingTrxId;
    }

    public void setRequestingTrxId(String requestingTrxId) {
        this.requestingTrxId = requestingTrxId == null ? null : requestingTrxId.trim();
    }

    public String getRequestedLockId() {
        return requestedLockId;
    }

    public void setRequestedLockId(String requestedLockId) {
        this.requestedLockId = requestedLockId == null ? null : requestedLockId.trim();
    }

    public String getBlockingTrxId() {
        return blockingTrxId;
    }

    public void setBlockingTrxId(String blockingTrxId) {
        this.blockingTrxId = blockingTrxId == null ? null : blockingTrxId.trim();
    }

    public String getBlockingLockId() {
        return blockingLockId;
    }

    public void setBlockingLockId(String blockingLockId) {
        this.blockingLockId = blockingLockId == null ? null : blockingLockId.trim();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", requestingTrxId=" + requestingTrxId +
                ", requestedLockId=" + requestedLockId +
                ", blockingTrxId=" + blockingTrxId +
                ", blockingLockId=" + blockingLockId +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}
