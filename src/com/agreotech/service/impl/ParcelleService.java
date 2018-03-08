package com.agreotech.service.impl;

import com.agreotech.dao.IParcelleDao;
import com.agreotech.dao.impl.ParcelleDao;
import com.agreotech.domaine.Parcelle;
import com.agreotech.service.IParcelleService;

public class ParcelleService implements IParcelleService {

	IParcelleDao iDao = new ParcelleDao();

	@Override
	public Parcelle getElementById(Integer pk) {
		if ((pk != null) && (!pk.equals("")) && (pk != 0)) {
			return iDao.read(pk);
		}
		return null;
	}

	@Override
	public boolean updateElement(Parcelle t) {
		if ((t.getId() != 0)  &&  (iDao.read(t.getId()) != null)) {
			return iDao.update(t);
		}
		return false;
	}

	@Override
	public void createElement(Parcelle t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteElementById(Integer pk) {
		// TODO Auto-generated method stub

	}

}
