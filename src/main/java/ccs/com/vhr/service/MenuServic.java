package ccs.com.vhr.service;

import ccs.com.vhr.mapper.MenuMapper;
import ccs.com.vhr.model.Hr;
import ccs.com.vhr.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServic {

    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getMenuByHrId(){

        return menuMapper.getMenuByHrId(((Hr)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
}
