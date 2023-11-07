package smvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import smvc.dto.Student;

@Repository
public class StudentDao {
	
	
	@Autowired
	private EntityManager entityManager;

	public void saveStudent(Student student) {
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(student);
	entityTransaction.commit();
		
	}

}
