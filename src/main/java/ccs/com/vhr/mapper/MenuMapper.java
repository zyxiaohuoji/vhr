package ccs.com.vhr.mapper;

import ccs.com.vhr.model.Menu;
import ccs.com.vhr.model.Role;

import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenuByHrId(Integer hrId);

    List<Menu> getAllMenusWithRole();
}