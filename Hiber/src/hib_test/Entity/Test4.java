package hib_test.Entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// получение работника и изменение его
public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("resources/hibernate.cfg.xml") // имя можно не писать
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {

            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1); // если хотим поменять значение одному работнику
//            employee.setSalary(1500);
            session.createQuery("update Employee set salary =7000" + //если хотим поменять значение многим с именем Ilnur
                    " where  name ='ilnur'").executeUpdate();

            session.getTransaction().commit();


        } finally {
            factory.close();
        }
    }
}
