import business.abstracts.AuthService;
import business.abstracts.CustomerService;
import business.concretes.AuthManager;
import business.concretes.CustomerManager;
import core.GoogleLoginAdapter;
import dataAccess.concretes.HibernateCustomerDao;
import entities.concretes.Customer;
import entities.concretes.customerDataTransfer;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao(), new GoogleLoginAdapter());
		Customer customer = new Customer(1,"Ýrem","ÖZCAN","iremozcan@gmail.com","123456");
		customerService.add(customer);

		AuthService authService = new AuthManager(new CustomerManager(new HibernateCustomerDao(), new GoogleLoginAdapter()));

		customerService.getAll();

		customerDataTransfer customerDto = new customerDataTransfer();
		customerDto.setEmail("iremozcan@gmail.com");
		customerDto.setPassword("123456");

		authService.login(customerDto);

		customerDataTransfer customerDto2 = new customerDataTransfer();

		customerDto2.setEmail("baharkýlýc@hotmail.com");
		customerDto2.setPassword("78901");
	}

}
