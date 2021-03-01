package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatSqlLargeRs;
import io.mycat.agent.entity.MycatSqlLargeRsExample;
import io.mycat.agent.entity.MycatSqlLargeRsKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatSqlLargeRsMapper {
    long countByExample(MycatSqlLargeRsExample example);

    int deleteByExample(MycatSqlLargeRsExample example);

    int deleteByPrimaryKey(MycatSqlLargeRsKey key);

    int insert(MycatSqlLargeRs record);

    int insertSelective(MycatSqlLargeRs record);

    List<MycatSqlLargeRs> selectByExampleWithBLOBs(MycatSqlLargeRsExample example);

    List<MycatSqlLargeRs> selectByExample(MycatSqlLargeRsExample example);

    MycatSqlLargeRs selectByPrimaryKey(MycatSqlLargeRsKey key);

    int updateByExampleSelective(@Param("record") MycatSqlLargeRs record, @Param("example") MycatSqlLargeRsExample example);

    int updateByExampleWithBLOBs(@Param("record") MycatSqlLargeRs record, @Param("example") MycatSqlLargeRsExample example);

    int updateByExample(@Param("record") MycatSqlLargeRs record, @Param("example") MycatSqlLargeRsExample example);

    int updateByPrimaryKeySelective(MycatSqlLargeRs record);

    int updateByPrimaryKeyWithBLOBs(MycatSqlLargeRs record);

    int updateByPrimaryKey(MycatSqlLargeRs record);
}