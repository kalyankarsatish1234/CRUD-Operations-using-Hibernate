package org.example;

import org.beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.utilities.SessionFactoryProvider;

public class update {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class, 101);
        student.setName("pratik");
        student.setStd(11);
        session.save(student);
        System.out.println("Student updated!");
        transaction.commit();

//        session.close();
       sessionFactory.close();
    }
}
