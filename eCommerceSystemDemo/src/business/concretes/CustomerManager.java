package business.concretes;

import java.util.List;

import business.abstracts.CustomerService;
import core.GoogleEmail;
import core.Regex;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	private CustomerDao customerDao;
	private GoogleEmail googleEmail;
	
	public CustomerManager(CustomerDao customerDao, GoogleEmail googleEmail) {
		this.customerDao = customerDao;
		this.googleEmail = googleEmail;
	}

	@Override
	public void add(Customer customer) {
		var result = checkNameLenght(customer);
		var mail=getByMail(customer.geteMail());
		if (result != false
				&&mail==null
				&&Regex.emailValidate(customer.geteMail())) {
			customerDao.add(customer);
			googleEmail.send(customer.geteMail(), "Eklendi!");
		} else {
			System.out.println("Tekrar Deneyin!");
		}
		
	}

	private boolean checkNameLenght(Customer customer) {
		if (customer.getName().length() >= 2 && customer.getSurname().length() >= 2) {
			return true;
		}
		System.out.println("Ad ve soyad en az iki karakterden oluþmalýdýr.");
		return false;	
		}

	@Override
	public Customer getByMail(String email) {
		return customerDao.getByEmail(email);
	}

	@Override
	public List<Customer> getAll() {
		for (Customer customer : customerDao.getAll()) {
			System.out.println(customer.getName() + " " + customer.getSurname());
		}
		return customerDao.getAll();
		}

}
