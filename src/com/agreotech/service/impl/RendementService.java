package com.agreotech.service.impl;

import com.agreotech.dao.IRendementDao;
import com.agreotech.dao.impl.RendementDao;
import com.agreotech.domaine.Rendement;
import com.agreotech.service.IRendementService;

public class RendementService implements IRendementService {

	IRendementDao iDao = new RendementDao();

	@Override
	public Rendement getElementById(Integer pk) {
		if ((pk != null) && (!pk.equals("")) && (pk != 0)) {
			return iDao.read(pk);
		}
		return null;
	}

	@Override
	public boolean updateElement(Rendement t) {
		if ((t.getId() != 0)  &&  (iDao.read(t.getId()) != null)) {
			return iDao.update(t);
		}
		return false;
	}

	@Override
	public void createElement(Rendement t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteElementById(Integer pk) {
		// TODO Auto-generated method stub

	}

}
