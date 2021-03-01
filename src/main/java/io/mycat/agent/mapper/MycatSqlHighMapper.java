package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatSqlHigh;
import io.mycat.agent.entity.MycatSqlHighExample;
import io.mycat.agent.entity.MycatSqlHighKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatSqlHighMapper {
    long countByExample(MycatSqlHighExample example);

    int deleteByExample(MycatSqlHighExample example);

    int deleteByPrimaryKey(MycatSqlHighKey key);

    int insert(MycatSqlHigh record);

    int insertSelective(MycatSqlHigh record);

    List<MycatSqlHigh> selectByExampleWithBLOBs(MycatSqlHighExample example);

    List<MycatSqlHigh> selectByExample(MycatSqlHighExample example);

    MycatSqlHigh selectByPrimaryKey(MycatSqlHighKey key);

    int updateByExampleSelective(@Param("record") MycatSqlHigh record, @Param("example") MycatSqlHighExample example);

    int updateByExampleWithBLOBs(@Param("record") MycatSqlHigh record, @Param("example") MycatSqlHighExample example);

    int updateByExample(@Param("record") MycatSqlHigh record, @Param("example") MycatSqlHighExample example);

    int updateByPrimaryKeySelective(MycatSqlHigh record);

    int updateByPrimaryKeyWithBLOBs(MycatSqlHigh record);

    int updateByPrimaryKey(MycatSqlHigh record);
}