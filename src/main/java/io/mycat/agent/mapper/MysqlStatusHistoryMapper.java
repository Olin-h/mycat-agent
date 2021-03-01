package io.mycat.agent.mapper;

import io.mycat.agent.entity.MysqlStatusHistory;
import io.mycat.agent.entity.MysqlStatusHistoryExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MysqlStatusHistoryMapper {
    int countByExample(MysqlStatusHistoryExample example);

    int deleteByExample(MysqlStatusHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MysqlStatusHistory record);

    int insertSelective(MysqlStatusHistory record);

    List<MysqlStatusHistory> selectByExample(MysqlStatusHistoryExample example);

    MysqlStatusHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MysqlStatusHistory record, @Param("example") MysqlStatusHistoryExample example);

    int updateByExample(@Param("record") MysqlStatusHistory record, @Param("example") MysqlStatusHistoryExample example);

    int updateByPrimaryKeySelective(MysqlStatusHistory record);

    int updateByPrimaryKey(MysqlStatusHistory record);
    
    Long maxByExample(MysqlStatusHistoryExample example);
}