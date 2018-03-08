package com.agreotech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.agreotech.dao.IParcelleDao;
import com.agreotech.domaine.Parcelle;

public class ParcelleDao implements IParcelleDao {
	
	private final String CREATE_QUERY = "INSERT INTO parcelle(designation_parcelle,activite_parcelle,observation_parcelle) VALUES (?,?,?)";
	private final String READ_QUERY = "SELECT * FROM parcelle WHERE id_parcelle = ?";
	private final String UPDATE_QUERY = "UPDATE parcelle SET designation_parcelle = ?, activite_parcelle = ?, observation_parcelle = ? WHERE id_parcelle = ?";
	private final String DELETE_QUERY = "DELETE FROM parcelle WHERE id_parcelle = ?";
	Connection myConnection = Singleton.getInstance();
	PreparedStatement ps;

	@Override
	public void create(Parcelle t) {
		try {
			ps = myConnection.prepareStatement(CREATE_QUERY);
			ps.setString(1, t.getDesignation());
			ps.setString(2, t.getActivite());
			ps.setString(3, t.getObservation());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public Parcelle read(Integer pk) {
		Parcelle parcelle = null;
		try {
			ps = myConnection.prepareStatement(READ_QUERY);
			ps.setInt(1, pk);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				parcelle = new Parcelle();
				parcelle.setId(rs.getInt("id_parcelle"));
				parcelle.setDesignation(rs.getString("designation_parcelle"));
				parcelle.setActivite(rs.getString("activite_parcelle"));
				parcelle.setObservation(rs.getString("observation_parcelle"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parcelle;
	}

	@Override
	public boolean update(Parcelle t) {
		int val = 0;
		try {
			ps = myConnection.prepareStatement(UPDATE_QUERY);
			ps.setString(1, t.getDesignation());
			ps.setString(2, t.getActivite());
			ps.setString(3, t.getObservation());
			ps.setInt(4, t.getId());
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
