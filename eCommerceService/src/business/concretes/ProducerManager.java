package business.concretes;

import business.abstracts.ProducerService;
import entities.concretes.Producer;

public class ProducerManager implements ProducerService {

	ProducerCheckManager checkManager;
	ConfirmationManager confirmationManager;

	public ProducerManager(ProducerCheckManager checkManager, ConfirmationManager confirmationManager) {
		this.checkManager = checkManager;
		this.confirmationManager = confirmationManager;
	}

	@Override
	public void signUp(Producer producer) {

		boolean check1 = checkManager.isEmailRegistered(producer.getEmail());

		if (!check1) {
			System.out.print("Registration successful. ");
			confirmationManager.sendToConfirmationEmail("Please confirm your email to complete your registration.");

		} else {
			System.out.println("Registration failled.");
		}
	}

	@Override
	public void signIn(Producer producer) {
		if (confirmationManager.checkConfirmAccount(producer.getEmail())) {
			boolean check1 = checkManager.checkFirstName(producer);
			boolean check2 = checkManager.checkLastName(producer);
			boolean check3 = checkManager.checkPassword(producer);
			boolean check4 = checkManager.checkEmail(producer);

			if (check1 && check2 && check3 && check4) {
				System.out.println("Login successful. Welcome " + producer.getFirstName() + ".");
			} else {
				System.out.println("Login failled.");
			}
		} else {
			System.out.println("Please confirm your email.");
		}
	}
}