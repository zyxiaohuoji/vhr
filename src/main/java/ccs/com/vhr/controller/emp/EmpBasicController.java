package ccs.com.vhr.controller.emp;

import ccs.com.vhr.model.Employee;
import ccs.com.vhr.model.RespBean;
import ccs.com.vhr.model.RespPageBean;
import ccs.com.vhr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp/basic")
public class EmpBasicController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public RespPageBean getEmployeeByPage(@RequestParam(defaultValue = "1") Integer page,
                                          @RequestParam(defaultValue = "10") Integer size, String keyword) {
        return employeeService.getEmployeeByPage(page, size, keyword);
    }

    @PostMapping("/")
    public RespBean addEmpp(@RequestBody Employee employee) {
        if (employeeService.addEmp(employee) == 1){
            return RespBean.ok("添加成功!", employee);
        }
        return RespBean.error("添加失败!");
    }

}
