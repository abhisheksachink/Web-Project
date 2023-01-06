package com.web.service;

import java.util.List;

import com.web.dao.LoginDaO;
import com.web.dao.LoginDaOImpl;
import com.web.model.user;

public class LoginServiceImplement implements LoginService {
	
	public boolean isValidUser_det(String userId, String phone) {
		LoginDaO dao = new LoginDaOImpl();
		boolean isValid1 = false;
		List<user> userList1 = dao.getUsers();
		for (user user : userList1) {
			if (user.getUserId().equals(userId) && user.getPhone().equals(phone)) {
				isValid1 = true;
			}
		}
		return isValid1;
	}

}
