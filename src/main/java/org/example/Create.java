package org.example;

import org.beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.utilities.SessionFactoryProvider;

public class Create {
    public static void main(String[] args) {
        System.out.println("Projcet Started!");
        SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student(101,"satish",10);
        session.save(student);
        System.out.println("Student created!");
        transaction.commit();
        session.close();



    }
}