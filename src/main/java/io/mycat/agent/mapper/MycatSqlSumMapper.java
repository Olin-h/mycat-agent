package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatSqlSum;
import io.mycat.agent.entity.MycatSqlSumExample;
import io.mycat.agent.entity.MycatSqlSumKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatSqlSumMapper {
    long countByExample(MycatSqlSumExample example);

    int deleteByExample(MycatSqlSumExample example);

    int deleteByPrimaryKey(MycatSqlSumKey key);

    int insert(MycatSqlSum record);

    int insertSelective(MycatSqlSum record);

    List<MycatSqlSum> selectByExample(MycatSqlSumExample example);

    MycatSqlSum selectByPrimaryKey(MycatSqlSumKey key);

    int updateByExampleSelective(@Param("record") MycatSqlSum record, @Param("example") MycatSqlSumExample example);

    int updateByExample(@Param("record") MycatSqlSum record, @Param("example") MycatSqlSumExample example);

    int updateByPrimaryKeySelective(MycatSqlSum record);

    int updateByPrimaryKey(MycatSqlSum record);
}