package org.example;

import org.beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.utilities.SessionFactoryProvider;

public class Delete {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            //Student student = session.get(Student.class,101);
//            String hql = "Delete From Student";
//            Query query = session.createQuery(hql);
//            int result = query.executeUpdate();
            Student student = session.get(Student.class,101);
            session.delete(student);

            System.out.println("Deleted students! " +student.getId());
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }


    }

}
