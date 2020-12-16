package ccs.com.vhr.mapper;

import ccs.com.vhr.model.Position;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PositionMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    List<Position> getAllPosition();

    int deletePositionByIds(@Param("ids") Integer[] ids);
}