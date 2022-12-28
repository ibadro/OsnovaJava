package hib_one_to_one.Entity;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("resources/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class) // Добавляем детайл класс
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("ilnur", "big", "it", 1000);
            Detail detail = new Detail("Ekat", "52533", "werwe@fd.com");
            employee.setEmpDetail(detail);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit(); // всегда нужно закрывать сессию
            System.out.println("done!");

        } finally {
            factory.close();
        }
    }
}