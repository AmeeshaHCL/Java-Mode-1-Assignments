package com.dao;

//import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public Employee readEmployeeById(int empNo) {

		Session session = sessionFactory.getCurrentSession();
		Employee employee = session.get(Employee.class, empNo);
		return employee;
	}

}
