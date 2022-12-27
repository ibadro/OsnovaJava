package hib_test.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("spring_introduction/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("ilnur", "biwqerg", "34it", 500);
            Employee employee2 = new Employee("Ilnur", "biwsdfsdqerg", "34it", 500);
            Employee employee21 = new Employee("Ilnur", "bisdfsdfwqerg", "34it", 500);
            session.beginTransaction();
            session.save(employee);
            session.save(employee21);
            session.save(employee2);
            session.getTransaction().commit(); // всегда нужно закрывать сессию
            System.out.println(employee.toString());
        } finally {
            factory.close();
        }
    }
}