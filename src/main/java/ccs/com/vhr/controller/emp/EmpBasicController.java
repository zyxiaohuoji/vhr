package ccs.com.vhr.controller.emp;

import ccs.com.vhr.model.*;
import ccs.com.vhr.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp/basic")
public class EmpBasicController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    NationService nationService;

    @Autowired
    PoliticsStatusService politicsStatusService;

    @Autowired
    JobLevelService jobLevelService;

    @Autowired
    PositionService positionService;

    @Autowired
    DepartmentService departmentService;

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

    @GetMapping("/nations")
    public List<Nation> getAllNations() {
        return nationService.getAllNations();
    }

    @GetMapping("/politicsstatus")
    public List<PoliticsStatus> getAllPoliticsStatus(){
        return politicsStatusService.getAllPoliticsStatus();
    }

    @GetMapping("/joblevels")
    public List<JobLevel> getAllJobLevels(){
        return jobLevelService.getAllJobLevels();
    }

    @GetMapping("/positions")
    public List<Position> getAllPositions(){
        return positionService.getAllPositions();
    }

    @GetMapping("/maxWorkId")
    public RespBean maxWorkId() {
//        总长度为8 不够补0
        return RespBean.ok("", String.format("%08d", employeeService.maxWorkId() + 1));
    }

    @GetMapping("/deps")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

}
