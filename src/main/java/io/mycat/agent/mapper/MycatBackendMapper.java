package io.mycat.agent.mapper;

import io.mycat.agent.entity.MycatBackend;
import io.mycat.agent.entity.MycatBackendExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MycatBackendMapper {
    long countByExample(MycatBackendExample example);

    int deleteByExample(MycatBackendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MycatBackend record);

    int insertSelective(MycatBackend record);

    List<MycatBackend> selectByExample(MycatBackendExample example);

    MycatBackend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MycatBackend record, @Param("example") MycatBackendExample example);

    int updateByExample(@Param("record") MycatBackend record, @Param("example") MycatBackendExample example);

    int updateByPrimaryKeySelective(MycatBackend record);

    int updateByPrimaryKey(MycatBackend record);
}