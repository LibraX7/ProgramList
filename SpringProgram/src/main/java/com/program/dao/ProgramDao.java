package com.program.dao;

import com.program.domain.Program;
import org.apache.ibatis.annotations.*;

import java.util.List;
/**
 * sql代码连接处
 */
@Mapper
public interface ProgramDao {
    public void save(Program program);
    public void update(Program program);
    public void delete(Integer id);
    public List<Program> getByID(String type,Integer num, String name);

    public List<Program> getALL();
}
