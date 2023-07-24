package com.program.service.impl;

import com.program.dao.ProgramDao;
import com.program.domain.Program;
import com.program.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProgramImpl implements ProgramService {
    @Autowired
    private ProgramDao programDao;
    @Override
    public boolean save(Program program) {
        programDao.save(program);
        return true;
    }

    @Override
    public boolean update(Program program) {
        programDao.update(program);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        programDao.delete(id);
        return true;
    }

    @Override
    public List<Program> getByID(String type, Integer num, String name) {
        return programDao.getByID(type,num,name);
    }

    @Override
    public List<Program> getALL() {
        return programDao.getALL();
    }
}
