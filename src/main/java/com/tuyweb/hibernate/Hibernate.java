package com.tuyweb.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Hibernate {
    
     public static void main(String[] args) {
        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Transaction transaction = null;

        try (Session session = sessionFactory.openSession()) {
            // Iniciar una transacción
            transaction = session.beginTransaction();

            // Crear una instancia de la entidad Usuario
            Usuario usuario = new Usuario("Adrian Brody");

            // Guardar la entidad en la base de datos
            session.save(usuario);

            // Commit de la transacción
            transaction.commit();

            System.out.println("Usuario guardado con éxito");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            // Cerrar el SessionFactory al final del programa
            HibernateUtil.shutdown();
        }
    }

    private static SessionFactory getSessionFactory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
