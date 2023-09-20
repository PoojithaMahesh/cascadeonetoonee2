package cascadeonetoonee2.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import cascadeonetoonee2.dto.Person;
import cascadeonetoonee2.dto.VoterCard;

public class PersonVoterCont {
public static void main(String[] args) {

	Person person=new Person();
	person.setId(2);
	person.setName("poojithaJMpooji");
	person.setAddress("bangalore");
	
	VoterCard voterCard=new  VoterCard();
	voterCard.setId(200);
	voterCard.setName("POOJITHAMahesh");
	voterCard.setAge(18);
	
	
	
	person.setVoterCard(voterCard);
	
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Person person2=entityManager.find(Person.class, 2);
	entityTransaction.begin();
	entityManager.remove(person2);
	entityTransaction.commit();
}
}
