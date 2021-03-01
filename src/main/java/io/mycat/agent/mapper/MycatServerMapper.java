package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatServer;
import io.mycat.agent.entity.MycatServerExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatServerMapper {
    long countByExample(MycatServerExample example);

    int deleteByExample(MycatServerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MycatServer record);

    int insertSelective(MycatServer record);

    List<MycatServer> selectByExample(MycatServerExample example);

    MycatServer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MycatServer record, @Param("example") MycatServerExample example);

    int updateByExample(@Param("record") MycatServer record, @Param("example") MycatServerExample example);

    int updateByPrimaryKeySelective(MycatServer record);

    int updateByPrimaryKey(MycatServer record);
}