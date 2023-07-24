package com.program.controller;
/**
 * 使用全注解式开发
 * 基于restful风格开发
 */

import com.program.domain.Program;
import com.program.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProgramController {

    @Autowired
    private ProgramService programService;
    @PostMapping("/add/program")
    public Result save(@RequestBody Program program) {
        boolean flag = programService.save(program);
        System.out.println("123");
        return new Result("00000",flag?"请求正常":"请求失败");

    }

    @PutMapping("/update/program")
    public Result update(@RequestBody Program program) {
        boolean flag = programService.update(program);
        return new Result("00000",flag?"更新成功":"更新失败");
    }


    @DeleteMapping("/delete/program/{id}")//Restful
    public Result delete(@PathVariable Integer id) {
        boolean flag = programService.delete(id);
        return new Result("00000",flag?"删除成功":"删除失败");
    }

    @GetMapping("/get/search")//根据条件查询
    public Result getByID(String type, Integer num,String name) {
        List<Program> list = programService.getByID(type,num,name);
        String code = "00000";
        String msg = list != null ? "请求正常":"数据查询失败，请重试";
        return new Result(code,list,msg);

    }

    @GetMapping("get/programlist")
    public Result getALL() {
        List<Program> list = programService.getALL();
        String code = "00000";
        String msg = list != null ? "请求正常":"数据查询失败，请检查";
        return new Result(code,list,msg);
    }
}
