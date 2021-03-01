package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatSqlLarge;
import io.mycat.agent.entity.MycatSqlLargeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatSqlLargeMapper {
    long countByExample(MycatSqlLargeExample example);

    int deleteByExample(MycatSqlLargeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MycatSqlLarge record);

    int insertSelective(MycatSqlLarge record);

    List<MycatSqlLarge> selectByExampleWithBLOBs(MycatSqlLargeExample example);

    List<MycatSqlLarge> selectByExample(MycatSqlLargeExample example);

    MycatSqlLarge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MycatSqlLarge record, @Param("example") MycatSqlLargeExample example);

    int updateByExampleWithBLOBs(@Param("record") MycatSqlLarge record, @Param("example") MycatSqlLargeExample example);

    int updateByExample(@Param("record") MycatSqlLarge record, @Param("example") MycatSqlLargeExample example);

    int updateByPrimaryKeySelective(MycatSqlLarge record);

    int updateByPrimaryKeyWithBLOBs(MycatSqlLarge record);

    int updateByPrimaryKey(MycatSqlLarge record);
}