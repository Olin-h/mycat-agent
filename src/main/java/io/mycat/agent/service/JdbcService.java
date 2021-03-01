package io.mycat.agent.service;


import io.mycat.agent.dto.QueryResult;

import java.util.List;
import java.util.Map;

public interface JdbcService {
    /**
     * @param user     TODO
     * @param password TODO
     *                 查询数据集
     * @param url
     * @param sql
     * @return
     * @throws
     * @Title: queryForList
     */
    public QueryResult<List<Map<Object, Object>>> queryForList(String url, String sql, String user, String password);

    /**
     * 根据SQL查询记录数
     *
     * @param url
     * @param sql
     * @return
     * @throws
     * @Title: queryForCount
     */
    public QueryResult<Integer> queryForCount(String url, String sql, String user, String password);


    /**
     * 执行sql，返回是否执行成功
     *
     * @param url
     * @param sql
     * @return
     */
    public QueryResult<Integer> executeSqlForBoolean(String url, String sql, String user, String password);

    /**
     * 执行SQL
     *
     * @param url
     * @param sql
     * @throws
     * @Title: executeSql
     */
    public void executeSql(String url, String sql, String user, String password);

}
