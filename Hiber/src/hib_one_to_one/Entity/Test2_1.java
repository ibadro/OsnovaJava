package hib_one_to_one.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
// отношение один к одному
public class Test2_1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("resources/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class) // Добавляем детайл класс
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 4);
//           // System.out.println(detail.getEmployee()); // получаем детали о работнике
//            session.delete(detail);
//            session.getTransaction().commit(); // всегда нужно закрывать сессию
//            System.out.println("done!");

            session = factory.getCurrentSession();
            session.beginTransaction();
            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null); // для разрыва связи между таблицами (1,ilnur,big,it,1000, null)

            session.delete(detail);
            session.getTransaction().commit(); // всегда нужно закрывать сессию
            System.out.println("done!");
        } finally {
            factory.close();
            session.close();
        }
    }
}
