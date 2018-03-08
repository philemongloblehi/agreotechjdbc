package com.agreotech.service.impl;

import com.agreotech.dao.IProduitDao;
import com.agreotech.dao.impl.ProduitDao;
import com.agreotech.domaine.Produit;
import com.agreotech.service.IProduitService;

public class ProduitService implements IProduitService {

	IProduitDao iDao = new ProduitDao();

	@Override
	public Produit getElementById(Integer pk) {
		if ((pk != null) && (!pk.equals("")) && (pk != 0)) {
			return iDao.read(pk);
		}
		return null;
	}

	@Override
	public boolean updateElement(Produit t) {
		if ((t.getId() != 0)  &&  (iDao.read(t.getId()) != null)) {
			return iDao.update(t);
		}
		return false;
	}

	@Override
	public void createElement(Produit t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteElementById(Integer pk) {
		// TODO Auto-generated method stub

	}

}
