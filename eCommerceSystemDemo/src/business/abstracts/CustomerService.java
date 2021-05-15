package business.abstracts;

import java.util.List;

import entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	Customer getByMail(String email);
	List<Customer> getAll();
}
