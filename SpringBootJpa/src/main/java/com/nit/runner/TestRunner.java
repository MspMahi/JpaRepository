package com.nit.runner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nit.entity.Employe;
import com.nit.serive.ISerice;

public class TestRunner implements CommandLineRunner {
	@Autowired
	private ISerice serv;

	@Override
	public void run(String... args) throws Exception {
		
		try {
			Employe employe = serv.getbyId(101);
			System.out.println(employe);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
