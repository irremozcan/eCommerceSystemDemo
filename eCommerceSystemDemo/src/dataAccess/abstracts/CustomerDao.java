package dataAccess.abstracts;

import entities.concretes.Customer;
import java.util.List;

public interface CustomerDao {
	
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	
	Customer getByEmail(String email);
	List<Customer>getAll();
	Customer getByEmailandpassw(String email, String password);
	

}
