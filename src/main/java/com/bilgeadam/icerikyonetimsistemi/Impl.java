package com.bilgeadam.icerikyonetimsistemi;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bilgeadam.icerikyonetimsistemi.repository.entity.Answer;
import com.bilgeadam.icerikyonetimsistemi.repository.entity.Lesson;
import com.bilgeadam.icerikyonetimsistemi.repository.entity.Question;
import com.bilgeadam.icerikyonetimsistemi.repository.entity.Role;
import com.bilgeadam.icerikyonetimsistemi.repository.entity.Subject;
import com.bilgeadam.icerikyonetimsistemi.repository.entity.SubjectDetail;
import com.bilgeadam.icerikyonetimsistemi.repository.entity.User;
import com.bilgeadam.icerikyonetimsistemi.utility.HibernateUtility;

public class Impl {

	private static Session session;
	private static Transaction transaction;
	private static EntityManager entityManager;
	private static CriteriaBuilder builder;

	public static void main(String[] args) {

		implData();
		entityManager = HibernateUtility.getSessionFactory().createEntityManager();
		builder = entityManager.getCriteriaBuilder();

		// enCokIcerikUretmisKullanici();

	}

	public static void implData() {

		session = HibernateUtility.getSessionFactory().openSession();
		transaction = session.beginTransaction();

		Lesson lesson = new Lesson("lesson1", "bu lesson1 tanımıdır", LocalDate.now(), LocalDate.now(), true);
		Lesson lesson2 = new Lesson("lesson2", "bu lesson2 tanımıdır", LocalDate.now(), LocalDate.now(), true);
		Lesson lesson3 = new Lesson("lesson3", "bu lesson3 tanımıdır", LocalDate.now(), LocalDate.now(), true);

		Subject subject = new Subject(lesson, LocalDate.now(), LocalDate.now(), true);
		Subject subject2 = new Subject(lesson2, LocalDate.now(), LocalDate.now(), true);
		Subject subject3 = new Subject(lesson3, LocalDate.now(), LocalDate.now(), true);

		session.save(subject);
		session.save(subject2);
		session.save(subject3);

		User user = new User("burak", "ozer", Role.ADITOR, LocalDate.now(), LocalDate.now(), true);
		User user2 = new User("emrah", "bas", Role.ADITOR, LocalDate.now(), LocalDate.now(), true);
		User user3 = new User("seda", "san", Role.ADITOR, LocalDate.now(), LocalDate.now(), true);
		User user4 = new User("kerim", "basak", Role.ADITOR, LocalDate.now(), LocalDate.now(), true);
		User user5 = new User("cengiz", "under", Role.ADITOR, LocalDate.now(), LocalDate.now(), true);
		User user6 = new User("hasan", "kaya", Role.ADITOR, LocalDate.now(), LocalDate.now(), true);

		Answer answer = new Answer("answer1", LocalDate.now(), LocalDate.now(), true);
		Question question = new Question("title1", "question1", LocalDate.now(), LocalDate.now(), false, answer);
		answer.setQuestion(question);

		Answer answer2 = new Answer("answer2", LocalDate.now(), LocalDate.now(), true);
		Question question2 = new Question("title2", "question2", LocalDate.now(), LocalDate.now(), false, answer);
		answer.setQuestion(question);

		Answer answer3 = new Answer("answer3", LocalDate.now(), LocalDate.now(), true);
		Question question3 = new Question("title3", "question3", LocalDate.now(), LocalDate.now(), false, answer);
		answer.setQuestion(question);

		Answer answer4 = new Answer("answer4", LocalDate.now(), LocalDate.now(), true);
		Question question4 = new Question("title4", "question4", LocalDate.now(), LocalDate.now(), false, answer);
		answer.setQuestion(question);

		SubjectDetail subjectDetail = new SubjectDetail(subject, user2, List.of(question, question2), "title1",
				"subject detail 1 in acıklaması", "article1", LocalDate.now(), LocalDate.now(), true);

		SubjectDetail subjectDetail2 = new SubjectDetail(subject3, user, List.of(question3), "title3",
				"subject detail 2 in acıklaması", "article3", LocalDate.now(), LocalDate.now(), true);

		SubjectDetail subjectDetail3 = new SubjectDetail(subject, user3, List.of(question4), "title3",
				"subject detail 3 in acıklaması", "article3", LocalDate.now(), LocalDate.now(), true);

		question.setSubjectDetail(subjectDetail);
		question2.setSubjectDetail(subjectDetail);
		question3.setSubjectDetail(subjectDetail2);
		question4.setSubjectDetail(subjectDetail3);

		session.save(subjectDetail);
		session.save(subjectDetail2);
		session.save(subjectDetail3);

		transaction.commit();
		session.close();

	}

	private static void enCokIcerikUretmisKullanici() {

		String hql = "select sd.user_id from SubjectDetail as sd group by s.user_id order by count(s.user_id) desc";

		Session session = HibernateUtility.getSessionFactory().openSession();
		Integer user_id = session.createQuery(hql, Integer.class).getSingleResult();
		System.out.println(user_id);

//		CriteriaQuery<User> criteria = builder.createQuery(User.class);
//		
//		Root<SubjectDetail> root = criteria.from(SubjectDetail.class);
//		
//		criteria.groupBy(root.get("id"), builder.count(root));

	}

	private static void sorularHangiDersteBul() {

		String hql = "select q.id from Question as q full join SubjectDetail as"
				+ " sd on q.subjected_id = sd.id full join Lesson as l on sd.lesson_id = l.id";

		Integer _id = session.createQuery(hql, Integer.class).getSingleResult();
		System.out.println();

	}

}
