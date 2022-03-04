package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ProducerDao;
import entities.concretes.Producer;

public class HibernateProducerDao implements ProducerDao {

	List<Producer> producers = new ArrayList<Producer>();

	public List<Producer> getProducers() {
		return producers;
	}

	@Override
	public void add(Producer producer) {
		producers.add(producer);
	}

	@Override
	public void update(Producer producer, int Id) {
		producers.set(Id, producer);
	}

	@Override
	public void delete(Producer producer) {
		producers.remove(producer);
	}
}
