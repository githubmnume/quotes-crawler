package com.company.project.service.impl;

import com.company.project.dao.VrlistMapper;
import com.company.project.model.Vrlist;
import com.company.project.service.VrlistService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/28.
 */
@Service
@Transactional
public class VrlistServiceImpl extends AbstractService<Vrlist> implements VrlistService {
    @Resource
    private VrlistMapper vrlistMapper;

}
