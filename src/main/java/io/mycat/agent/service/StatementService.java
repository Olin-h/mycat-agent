package io.mycat.agent.service;

public interface StatementService {
    Object getExplain(Long serverId, String schema, String sql);

    Object getTables(Long serverId, String statementExample);

    Object getShowCreateTable(Long serverId, String schema, String tableName);

    Object getShowIndexFromTable(Long serverId, String schema, String tableName);

    Object getStatementHistory(Long serverId, String orderBy);

    Object getShowTableStatus(Long serverId, String schema, String table);

    Object executeSql(Long serverId, String schema, String sql);

    Object getStatementSlow(Long serverId, String orderBy, Integer pageIndex, Integer pageSize);
}
