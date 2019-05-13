package edu.mum.cs.cs425.prodmgmt;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import edu.mum.cs.cs425.prodmgmt.model.Product;

/**
 * Hello world!
 *
 */
public class ProductMgmtApp 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
    	Product a = new Product();
    	//a.setPid(1);
    	a.setName("Mati");
    	a.setDateMfd(LocalDate.of(2009, 5, 20));
    	a.setProductNumber((long) 34);
    	a.setUnitPrice((float) 2000);
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
   	em.getTransaction().begin();
    	em.persist(a);
   	em.getTransaction().commit();
    	
    	Product b = em.find(Product.class,1);
    	System.out.println(b);
    }
}
