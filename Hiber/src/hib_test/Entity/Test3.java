package hib_test.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("resources/hibernate.cfg.xml") // имя можно не писать
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> emps = session.createQuery("from Employee " + "where name = 'ilnur' and  salary> 400")
                    .getResultList();
            for (Employee e: emps )
                System.out.println(e);
            session.getTransaction().commit();
            System.out.println("Done");


        } finally {
            factory.close();
        }
    }

}

