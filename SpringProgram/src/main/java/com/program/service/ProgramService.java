package com.program.service;

import com.program.domain.Program;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ProgramService {

    public boolean save(Program program);

    public boolean update(Program program);
    public boolean delete(Integer id);
    public List<Program> getByID(String type, Integer num, String name);

    public List<Program> getALL();
}
