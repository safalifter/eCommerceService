package business.abstracts;

public interface ConfirmationService {

	void sendToConfirmationEmail(String email);

	boolean checkConfirmAccount(String email);
}
