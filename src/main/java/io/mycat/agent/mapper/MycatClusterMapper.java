package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatCluster;
import io.mycat.agent.entity.MycatClusterExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatClusterMapper {
    long countByExample(MycatClusterExample example);

    int deleteByExample(MycatClusterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MycatCluster record);

    int insertSelective(MycatCluster record);

    List<MycatCluster> selectByExample(MycatClusterExample example);

    MycatCluster selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MycatCluster record, @Param("example") MycatClusterExample example);

    int updateByExample(@Param("record") MycatCluster record, @Param("example") MycatClusterExample example);

    int updateByPrimaryKeySelective(MycatCluster record);

    int updateByPrimaryKey(MycatCluster record);
}