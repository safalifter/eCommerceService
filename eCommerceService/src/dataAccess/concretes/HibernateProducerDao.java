package dataAccess.concretes;

import dataAccess.abstracts.ProducerDao;
import entities.concretes.Producer;

public class HibernateProducerDao implements ProducerDao {

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
