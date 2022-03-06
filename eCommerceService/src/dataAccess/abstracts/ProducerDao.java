package dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import entities.concretes.Producer;

public interface ProducerDao {

	List<Producer> producers = new ArrayList<Producer>();

	public void add(Producer producer);

	public void update(Producer producer, int Id);

	public void delete(Producer producer);
}
