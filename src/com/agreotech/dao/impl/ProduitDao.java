package com.agreotech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.agreotech.dao.IProduitDao;
import com.agreotech.domaine.Produit;

public class ProduitDao implements IProduitDao {
	
	private final String CREATE_QUERY = "INSERT INTO produit(designation_produit,prix_produit) VALUES (?,?)";
	private final String READ_QUERY = "SELECT * FROM produit WHERE id_produit = ?";
	private final String UPDATE_QUERY = "UPDATE produit SET designation_produit = ?, prix_produit = ? WHERE id_produit = ?";
	private final String DELETE_QUERY = "DELETE FROM produit WHERE id_produit = ?";
	Connection myConnection = Singleton.getInstance();
	PreparedStatement ps;

	@Override
	public void create(Produit t) {
		try {
			ps = myConnection.prepareStatement(CREATE_QUERY);
			ps.setString(1, t.getDesignation());
			ps.setInt(2, t.getPrix());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public Produit read(Integer pk) {
		Produit produit = null;
		try {
			ps = myConnection.prepareStatement(READ_QUERY);
			ps.setInt(1, pk);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				produit = new Produit();
				produit.setId(rs.getInt("id_produit"));
				produit.setDesignation(rs.getString("designation_produit"));
				produit.setPrix(rs.getInt("prix_produit"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return produit;
	}

	@Override
	public boolean update(Produit t) {
		int val = 0;
		try {
			ps = myConnection.prepareStatement(UPDATE_QUERY);
			ps.setString(1, t.getDesignation());
			ps.setInt(2, t.getPrix());
			ps.setInt(3, t.getId());
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
