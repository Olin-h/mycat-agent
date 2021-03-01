package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatSqlExecute;
import io.mycat.agent.entity.MycatSqlExecuteExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatSqlExecuteMapper {
    long countByExample(MycatSqlExecuteExample example);

    int deleteByExample(MycatSqlExecuteExample example);

    int deleteByPrimaryKey(Long sqlId);

    int insert(MycatSqlExecute record);

    int insertSelective(MycatSqlExecute record);

    List<MycatSqlExecute> selectByExample(MycatSqlExecuteExample example);

    MycatSqlExecute selectByPrimaryKey(Long sqlId);

    int updateByExampleSelective(@Param("record") MycatSqlExecute record, @Param("example") MycatSqlExecuteExample example);

    int updateByExample(@Param("record") MycatSqlExecute record, @Param("example") MycatSqlExecuteExample example);

    int updateByPrimaryKeySelective(MycatSqlExecute record);

    int updateByPrimaryKey(MycatSqlExecute record);
}