package core;
import entities.concretes.customerDataTransfer;

public interface GoogleAuth {
	void register(String email);

	void login(customerDataTransfer CustomerDataTransfer);

	void customerExists(String email);


}
