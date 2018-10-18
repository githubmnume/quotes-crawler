package com.company.project.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.project.core.AbstractService;
import com.company.project.dao.FilmMapper;
import com.company.project.model.Film;
import com.company.project.service.FilmService;

/**
 * Created by CodeGenerator on 2018/10/18.
 */
@Service
@Transactional
public class FilmServiceImpl extends AbstractService<Film> implements FilmService {
	@Resource
	private FilmMapper filmMapper;

	@Override
	public void save(Film model) {
		
		super.save(model);
	}
	
	}
