package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import java.util.List;
import java.util.ArrayList;
import entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{
	
	private List<Customer> customers =new ArrayList<Customer>();
	
	public HibernateCustomerDao() {
		Customer customer1 = new Customer(1,"Ýrem","ÖZCAN","iremozcan@gmail.com","123456");
		Customer customer2 = new Customer(2,"Bahar","KILIÇ","baharkýlýc@hotmail.com", "78901");
		
		customers.add(customer1);
		customers.add(customer2);
	}

	@Override
	public void add(Customer customer) {
		customers.add(customer);
		System.out.println("Sevgili "+ customer.getName()+" Baþarýyla üye oldunuz!");
	}

	@Override
	public void delete(Customer customer) {
		customers.remove(customer);
		System.out.println(customer.getName()+ " Baþarýyla Silindi");
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Sayýn"+ customer.getName()+" bilgileriniz baþarýyla güncellendi!");
	}

	@Override
	public Customer getByEmail(String email) {
		for (Customer customer:customers) {
			if(customer.geteMail()==email)
				return customer;
		} 
		return null;
	}

	@Override
	public List<Customer> getAll() {
		return null;
	}

	@Override
	public Customer getByEmailandpassw(String email, String password) {
		for(Customer customer: customers) {
			if(customer.geteMail()==email)
				return customer;
		}
		return null;
	}
	

}
