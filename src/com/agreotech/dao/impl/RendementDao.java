package com.agreotech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.agreotech.dao.IRendementDao;
import com.agreotech.domaine.Rendement;

public class RendementDao implements IRendementDao {
	
	private final String CREATE_QUERY = "INSERT INTO rendement(designation_rendement,annee_rendement,total_rendement) VALUES (?,?,?)";
	private final String READ_QUERY = "SELECT * FROM rendement WHERE id_rendement = ?";
	private final String UPDATE_QUERY = "UPDATE rendement SET designation_rendement = ?, annee_rendement = ?, total_rendement = ? WHERE id_rendement = ?";
	private final String DELETE_QUERY = "DELETE FROM rendement WHERE id_rendement = ?";
	Connection myConnection = Singleton.getInstance();
	PreparedStatement ps;

	@Override
	public void create(Rendement t) {
		try {
			ps = myConnection.prepareStatement(CREATE_QUERY);
			ps.setString(1, t.getDesignation());
			ps.setString(2, t.getAnnee());
			ps.setDouble(3, t.getTotalRecolte());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public Rendement read(Integer pk) {
		Rendement rendement = null;
		try {
			ps = myConnection.prepareStatement(READ_QUERY);
			ps.setInt(1, pk);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				rendement = new Rendement();
				rendement.setId(rs.getInt("id_rendement"));
				rendement.setDesignation(rs.getString("designation_rendement"));
				rendement.setAnnee(rs.getString("annee_rendement"));
				rendement.setTotalRecolte(rs.getDouble("total_rendement"));				

				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rendement;
	}

	@Override
	public boolean update(Rendement t) {
		int val = 0;
		try {
			ps = myConnection.prepareStatement(UPDATE_QUERY);
			ps.setString(1, t.getDesignation());
			ps.setString(2, t.getAnnee());
			ps.setDouble(3, t.getTotalRecolte());
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
