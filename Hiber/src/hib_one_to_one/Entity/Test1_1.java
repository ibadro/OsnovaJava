package hib_one_to_one.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1_1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("resources/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class) // Добавляем детайл класс
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 1); // получаем детали о работнике
            System.out.println(employee.getEmpDetail());

            session.getTransaction().commit(); // всегда нужно закрывать сессию
            System.out.println("done!");
        } finally {
            factory.close();
            session.close();
        }
    }
}
