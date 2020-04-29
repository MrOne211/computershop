package com.hbgs.computershop.service;

import com.hbgs.computershop.dao.ModuleMapper;
import com.hbgs.computershop.domain.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleService {
    @Autowired
    private ModuleMapper mapper;

    public List<Module> list() {
        return this.mapper.list();
    }
}
