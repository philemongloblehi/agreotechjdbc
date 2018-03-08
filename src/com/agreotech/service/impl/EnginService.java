package com.agreotech.service.impl;

import com.agreotech.dao.IEnginDao;
import com.agreotech.dao.impl.EnginDao;
import com.agreotech.domaine.Engin;
import com.agreotech.service.IEnginService;

public class EnginService implements IEnginService {

	IEnginDao iDao = new EnginDao();

	@Override
	public Engin getElementById(Integer pk) {
		if ((pk != null) && (!pk.equals("")) && (pk != 0)) {
			return iDao.read(pk);
		}
		return null;
	}

	@Override
	public boolean updateElement(Engin t) {
		if ((t.getId() != 0)  &&  (iDao.read(t.getId()) != null)) {
			return iDao.update(t);
		}
		return false;
	}

	@Override
	public void createElement(Engin t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteElementById(Integer pk) {
		// TODO Auto-generated method stub

	}

}
