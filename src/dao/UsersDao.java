package dao;

import java.util.List;

import model.Users;


public interface UsersDao {

	
		void inseriUsers(Users user);
		List<Users> findAll();
		Users findById(Integer id);
		void updateUsers(Integer id);
		void deleteUsers(Integer id);
	
}
