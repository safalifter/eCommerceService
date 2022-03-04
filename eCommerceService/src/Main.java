import business.concretes.ConfirmationManager;
import business.concretes.ProducerCheckManager;
import business.concretes.ProducerManager;
import dataAccess.concretes.HibernateProducerDao;
import entities.concretes.Producer;

public class Main {

	public static void main(String[] args) {

		Producer producer = new Producer(1, "Safa", "Yeşilyurt", "safa.yesilyurt@icloud.com", "Password55");

		ProducerCheckManager checkManager = new ProducerCheckManager(new HibernateProducerDao());
		ConfirmationManager confirmationManager = new ConfirmationManager();
		ProducerManager manager = new ProducerManager(checkManager, confirmationManager);

		manager.signUp(producer);
		manager.signIn(producer);
	}
}
