package business.abstracts;

import entities.concretes.Customer;
import entities.concretes.customerDataTransfer;

public interface AuthService {
	void register(Customer customer);

	void login(customerDataTransfer CustomerDataTransfer);

	boolean customerExists(String email);
}
