package com.mytrading.modules.users.services;

import org.springframework.stereotype.Service;

import com.mytrading.modules.commons.services.CommonServiceImpl;
import com.mytrading.modules.users.models.entity.Alumno;
import com.mytrading.modules.users.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {


}
