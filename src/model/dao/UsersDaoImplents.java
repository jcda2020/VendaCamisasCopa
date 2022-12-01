package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.UsersDao;
import db.DB;
import model.People;
import model.Users;
import model.People;

public class UsersDaoImplents implements UsersDao{

	private Connection conn;
	
	
	public UsersDaoImplents(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public void inseriUsers(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users findById(Integer id) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM users WHERE id = ?";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			
			rs = stmt.executeQuery();
			Users user = new Users(); 
			People people = new People();
			while (rs.next()) {			
				//user.setCpf_people(people.setCpf(rs.getString("cpf_pessoas")));		
			}
			
			return user;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DB.closeStatement(stmt);
			DB.closeResultset(rs);
		}
		
		
		return null;
	}

	@Override
	public void updateUsers(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUsers(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
