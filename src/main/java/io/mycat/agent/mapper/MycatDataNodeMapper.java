package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatDataNode;
import io.mycat.agent.entity.MycatDataNodeExample;
import io.mycat.agent.entity.MycatDataNodeKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatDataNodeMapper {
    long countByExample(MycatDataNodeExample example);

    int deleteByExample(MycatDataNodeExample example);

    int deleteByPrimaryKey(MycatDataNodeKey key);

    int insert(MycatDataNode record);

    int insertSelective(MycatDataNode record);

    List<MycatDataNode> selectByExample(MycatDataNodeExample example);

    MycatDataNode selectByPrimaryKey(MycatDataNodeKey key);

    int updateByExampleSelective(@Param("record") MycatDataNode record, @Param("example") MycatDataNodeExample example);

    int updateByExample(@Param("record") MycatDataNode record, @Param("example") MycatDataNodeExample example);

    int updateByPrimaryKeySelective(MycatDataNode record);

    int updateByPrimaryKey(MycatDataNode record);
}