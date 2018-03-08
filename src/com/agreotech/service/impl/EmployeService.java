package com.agreotech.service.impl;

import com.agreotech.dao.IEmployeDao;
import com.agreotech.dao.impl.EmployeDao;
import com.agreotech.domaine.Employe;
import com.agreotech.service.IEmployeService;

public class EmployeService implements IEmployeService {

	IEmployeDao iDao = new EmployeDao();

	@Override
	public Employe getElementById(Integer pk) {
		if ((pk != null) && (!pk.equals("")) && (pk != 0)) {
			return iDao.read(pk);
		}
		return null;
	}

	@Override
	public boolean updateElement(Employe t) {
		if ((t.getId() != 0)  &&  (iDao.read(t.getId()) != null)) {
			return iDao.update(t);
		}
		return false;
	}

	@Override
	public void createElement(Employe t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteElementById(Integer pk) {
		// TODO Auto-generated method stub

	}

}
