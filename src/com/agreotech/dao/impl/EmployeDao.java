package com.agreotech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.agreotech.dao.IEmployeDao;
import com.agreotech.domaine.Employe;

public class EmployeDao implements IEmployeDao {
	
	private final String CREATE_QUERY = "INSERT INTO employe(matricule_employe,nom_employe,prenom_employe,fonction_employe,horaire_employe,tarif_employe,salaire_employe) VALUES (?,?,?,?,?,?,?)";
	private final String READ_QUERY = "SELECT * FROM employe WHERE id_employe = ?";
	private final String UPDATE_QUERY = "UPDATE employe SET matricule_employe = ?, nom_employe = ?, prenom_employe = ?, fonction_employe = ?, horaire_employe = ?, tarif_employe = ?, salaire_employe = ? WHERE id_employe = ?";
	private final String DELETE_QUERY = "DELETE FROM employe WHERE id_employe = ?";
	Connection myConnection = Singleton.getInstance();
	PreparedStatement ps;

	@Override
	public void create(Employe t) {
		try {
			ps = myConnection.prepareStatement(CREATE_QUERY);
			ps.setString(1, t.getMatricule());
			ps.setString(2, t.getNom());
			ps.setString(3, t.getPrenom());
			ps.setInt(4, t.getHoraireDeTravail());
			ps.setInt(5, t.getTarifHoraire());
			ps.setString(6, t.getFonction());
			ps.setDouble(7, t.getSalaire());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public Employe read(Integer pk) {
		Employe employe = null;
		try {
			ps = myConnection.prepareStatement(READ_QUERY);
			ps.setInt(1, pk);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				employe = new Employe();
				employe.setId(rs.getInt("id_employe"));
				employe.setMatricule(rs.getString("matricule_employe"));
				employe.setNom(rs.getString("nom_employe"));
				employe.setPrenom(rs.getString("prenom_employe"));
				employe.setFonction(rs.getString("fonction_employe"));				
				employe.setHoraireDeTravail(rs.getInt("horaire_employe"));
				employe.setTarifHoraire(rs.getInt("tarif_employe"));
				employe.setSalaire(rs.getDouble("salaire_employe"));				

				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employe;
	}

	@Override
	public boolean update(Employe t) {
		int val = 0;
		try {
			ps = myConnection.prepareStatement(UPDATE_QUERY);
			ps.setString(1, t.getMatricule());
			ps.setString(2, t.getNom());
			ps.setString(3, t.getPrenom());
			ps.setString(4, t.getFonction());
			ps.setInt(5, t.getHoraireDeTravail());
			ps.setInt(6, t.getTarifHoraire());
			ps.setDouble(7, t.getSalaire());
			ps.setInt(8, t.getId());
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
