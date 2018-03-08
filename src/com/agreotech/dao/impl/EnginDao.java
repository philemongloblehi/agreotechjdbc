package com.agreotech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.agreotech.dao.IEnginDao;
import com.agreotech.domaine.Engin;

public class EnginDao implements IEnginDao {
	
	private final String CREATE_QUERY = "INSERT INTO engin(designation_engin,etat_engin,consoEssence_engin,prixEssence_engin,coutTotal_engin) VALUES (?,?,?,?,?)";
	private final String READ_QUERY = "SELECT * FROM engin WHERE id_engin = ?";
	private final String UPDATE_QUERY = "UPDATE engin SET designation_engin = ?, etat_engin = ?, consoEssence_engin = ?, prixEssence_engin = ?, coutTotal_engin = ? WHERE id_engin = ?";
	private final String DELETE_QUERY = "DELETE FROM engin WHERE id_engin = ?";
	Connection myConnection = Singleton.getInstance();
	PreparedStatement ps;

	@Override
	public void create(Engin t) {
		try {
			ps = myConnection.prepareStatement(CREATE_QUERY);
			ps.setString(1, t.getDesignation());
			ps.setString(2, t.getEtat());
			ps.setInt(3, t.getConsoEssenceJour());
			ps.setInt(5, t.getPrixEssence());
			ps.setDouble(6, t.getCoutTotalEssence());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public Engin read(Integer pk) {
		Engin engin = null;
		try {
			ps = myConnection.prepareStatement(READ_QUERY);
			ps.setInt(1, pk);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				engin = new Engin();
				engin.setId(rs.getInt("id_engin"));
				engin.setDesignation(rs.getString("designation_engin"));
				engin.setEtat(rs.getString("etat_engin"));
				engin.setConsoEssenceJour(rs.getInt("consoEssence_engin"));
				engin.setPrixEssence(rs.getInt("prixEssence_engin"));
				engin.setCoutTotalEssence(rs.getInt("coutTotalEngin"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return engin;
	}

	@Override
	public boolean update(Engin t) {
		int val = 0;
		try {
			ps = myConnection.prepareStatement(UPDATE_QUERY);
			ps.setString(1, t.getDesignation());
			ps.setString(2, t.getEtat());
			ps.setInt(3, t.getConsoEssenceJour());
			ps.setInt(4, t.getPrixEssence());
			ps.setInt(5, t.getCoutTotalEssence());
			ps.setInt(6, t.getId());
			val = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(val > 0) {
			return true;
		}
		return false;
   
	}

	@Override
	public void delete(Integer pk) {
		
		try {
			ps = myConnection.prepareStatement(DELETE_QUERY);
			ps.setInt(1, pk);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
