package org.example;

import org.beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.utilities.SessionFactoryProvider;

import java.util.Optional;

public class Retrieve {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Optional.ofNullable(session.get(Student.class, 101))
                .ifPresent(student -> {

                    System.out.println("Student Id: " + student.getId());
                    System.out.println("Student Name: " + student.getName());
                    System.out.println("Student Standard: " + student.getStd());


                }


                );

        session.close();
      sessionFactory.close();

    }

}
