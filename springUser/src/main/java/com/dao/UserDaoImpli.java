package com.dao;

import org.springframework.stereotype.Repository;

@Repository (value="UserDao")

public class UserDaoImpli implements UserDao {

	@Override
	public String readByName(String str) {
		//jdbc
		return "from dao" + str;
	}

}
