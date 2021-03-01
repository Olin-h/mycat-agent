package io.mycat.agent.mapper;

import io.mycat.agent.entity.MysqlServer;
import io.mycat.agent.entity.MysqlServerExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MysqlServerMapper {
    int countByExample(MysqlServerExample example);

    int deleteByExample(MysqlServerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MysqlServer record);

    int insertSelective(MysqlServer record);

    List<MysqlServer> selectByExample(MysqlServerExample example);

    MysqlServer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MysqlServer record, @Param("example") MysqlServerExample example);

    int updateByExample(@Param("record") MysqlServer record, @Param("example") MysqlServerExample example);

    int updateByPrimaryKeySelective(MysqlServer record);

    int updateByPrimaryKey(MysqlServer record);
}