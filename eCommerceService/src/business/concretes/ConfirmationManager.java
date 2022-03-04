package business.concretes;

import business.abstracts.ConfirmationService;

public class ConfirmationManager implements ConfirmationService {

	@Override
	public void sendToConfirmationEmail(String email) {
		System.out.println(email);
	}

	@Override
	public boolean checkConfirmAccount(String email) {
		// mail onaylama işlemi kontol simülasyon
		return true;
	}
}
