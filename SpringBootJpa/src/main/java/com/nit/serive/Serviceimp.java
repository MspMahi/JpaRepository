package com.nit.serive;

import org.springframework.beans.factory.annotation.Autowired;

import com.nit.entity.Employe;
import com.nit.repo.Ijparepo;

public class Serviceimp implements ISerice {
	@Autowired
	private Ijparepo jpa;

	@Override
	public Employe getbyId(int id) {
		Employe emp=jpa.getReferenceById(id);
		return emp;
	}

}
