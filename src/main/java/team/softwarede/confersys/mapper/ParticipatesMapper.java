package team.softwarede.confersys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import team.softwarede.confersys.entity.Participates;
import team.softwarede.confersys.entity.ParticipatesKey;

@Mapper
public interface ParticipatesMapper {

    int deleteByPrimaryKey(ParticipatesKey key);
    
    int insert(Participates record);

    int insertSelective(Participates record);

    Participates selectByPrimaryKey(ParticipatesKey key);
    
    List<String> selectByMtId(Integer meetingId);

    int updateByPrimaryKeySelective(Participates record);

    int updateByPrimaryKey(Participates record);
    
    int updateStatus(@Param("userId")String userId, @Param("meetingId")int meetingId, @Param("status")String status);
}