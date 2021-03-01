package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatCache;
import io.mycat.agent.entity.MycatCacheExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatCacheMapper {
    long countByExample(MycatCacheExample example);

    int deleteByExample(MycatCacheExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MycatCache record);

    int insertSelective(MycatCache record);

    List<MycatCache> selectByExample(MycatCacheExample example);

    MycatCache selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MycatCache record, @Param("example") MycatCacheExample example);

    int updateByExample(@Param("record") MycatCache record, @Param("example") MycatCacheExample example);

    int updateByPrimaryKeySelective(MycatCache record);

    int updateByPrimaryKey(MycatCache record);
}