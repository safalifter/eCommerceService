package business.abstracts;

import entities.concretes.Producer;

public interface ProducerCheckService {

	boolean checkFirstName(Producer producer);

	boolean checkLastName(Producer producer);

	boolean checkPassword(Producer producer);

	boolean checkEmail(Producer producer);

	boolean isEmailRegistered(String email);
}
