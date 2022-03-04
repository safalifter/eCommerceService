package business.concretes;

import java.util.regex.Pattern;

import business.abstracts.ProducerCheckService;
import dataAccess.concretes.HibernateProducerDao;
import entities.concretes.Producer;

public class ProducerCheckManager implements ProducerCheckService {

	HibernateProducerDao dao;

	public ProducerCheckManager(HibernateProducerDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean checkFirstName(Producer producer) {
		if (producer.getFirstName().length() >= 2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkLastName(Producer producer) {
		if (producer.getLastName().length() >= 2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkPassword(Producer producer) {
		if (producer.getPassword().length() >= 6) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkEmail(Producer producer) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		if (producer.getEmail().isEmpty()) {
			System.out.println("Email field cannot be left blank.");
			return false;
		} else {
			if (pattern.matcher(producer.getEmail()).find() == false) {
				System.out.println(
						"The entered email address is not suitable for the format. (for example abc.gmail.com)");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isEmailRegistered(String email) {
		for (Producer producer : dao.getProducers()) {
			if (producer.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}
}
