package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatConnection;
import io.mycat.agent.entity.MycatConnectionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatConnectionMapper {
    long countByExample(MycatConnectionExample example);

    int deleteByExample(MycatConnectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MycatConnection record);

    int insertSelective(MycatConnection record);

    List<MycatConnection> selectByExample(MycatConnectionExample example);

    MycatConnection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MycatConnection record, @Param("example") MycatConnectionExample example);

    int updateByExample(@Param("record") MycatConnection record, @Param("example") MycatConnectionExample example);

    int updateByPrimaryKeySelective(MycatConnection record);

    int updateByPrimaryKey(MycatConnection record);
}