package dataAccess.abstracts;

import entities.concretes.Producer;

public interface ProducerDao {

	public void add(Producer producer);

	public void update(Producer producer, int Id);

	public void delete(Producer producer);
}
