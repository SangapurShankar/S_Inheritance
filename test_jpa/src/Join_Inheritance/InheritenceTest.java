package Join_Inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritenceTest {

	public static void main(String[] args) {
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		
		
		EntityManager em = fact.createEntityManager();
		
		em.getTransaction().begin();
		
		//create one emp
		Employee emp = new Employee();
		emp.setName("Sam");
		emp.setSalary(20000);
		em.persist(emp);
		
		//create one manager
		
		Manager man = new Manager();
		man.setName("Sateesh");
		man.setSalary(20000);
		man.setDept_name("cse");
		em.persist(man);
		
		em.getTransaction().commit();
		System.out.println("added one employee nad manager to database...");
		em.close();
		fact.close();

	}

}
