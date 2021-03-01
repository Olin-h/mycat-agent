package io.mycat.agent.dto;

public class Pager<T> {
    private T rows;
    private Integer total;

    /**
     * @return the rows
     */
    public T getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(T rows) {
        this.rows = rows;
    }

    /**
     * @return the total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

}
