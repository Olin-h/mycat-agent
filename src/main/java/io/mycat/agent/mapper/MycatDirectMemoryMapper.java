package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatDirectMemory;
import io.mycat.agent.entity.MycatDirectMemoryExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatDirectMemoryMapper {
    long countByExample(MycatDirectMemoryExample example);

    int deleteByExample(MycatDirectMemoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MycatDirectMemory record);

    int insertSelective(MycatDirectMemory record);

    List<MycatDirectMemory> selectByExample(MycatDirectMemoryExample example);

    MycatDirectMemory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MycatDirectMemory record, @Param("example") MycatDirectMemoryExample example);

    int updateByExample(@Param("record") MycatDirectMemory record, @Param("example") MycatDirectMemoryExample example);

    int updateByPrimaryKeySelective(MycatDirectMemory record);

    int updateByPrimaryKey(MycatDirectMemory record);
}