package business.abstracts;

import entities.concretes.Producer;

public interface ProducerService {

	void signUp(Producer producer);

	void signIn(Producer producer);
}
