package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatSql;
import io.mycat.agent.entity.MycatSqlExample;
import io.mycat.agent.entity.MycatSqlKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatSqlMapper {
    long countByExample(MycatSqlExample example);

    int deleteByExample(MycatSqlExample example);

    int deleteByPrimaryKey(MycatSqlKey key);

    int insert(MycatSql record);

    int insertSelective(MycatSql record);

    List<MycatSql> selectByExampleWithBLOBs(MycatSqlExample example);

    List<MycatSql> selectByExample(MycatSqlExample example);

    MycatSql selectByPrimaryKey(MycatSqlKey key);

    int updateByExampleSelective(@Param("record") MycatSql record, @Param("example") MycatSqlExample example);

    int updateByExampleWithBLOBs(@Param("record") MycatSql record, @Param("example") MycatSqlExample example);

    int updateByExample(@Param("record") MycatSql record, @Param("example") MycatSqlExample example);

    int updateByPrimaryKeySelective(MycatSql record);

    int updateByPrimaryKeyWithBLOBs(MycatSql record);

    int updateByPrimaryKey(MycatSql record);
}