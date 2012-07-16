package be.nordinh.simple_cqrs_java;

import java.util.UUID;

public class Repository<T extends AggregateRoot> implements IRepository<T> {

	private IEventStore storage;

	public Repository(IEventStore storage) {
		this.storage = storage;
	}

	public void save(T aggregate, int expectedVersion) {
		storage.saveEvents(aggregate.getId(),
				aggregate.getUncommittedChanges(), expectedVersion);
	}

	public T getById(UUID id) {
		T obj;
		obj.loadsFromHistory(storage.getEventsForAggregate(id));
		return obj;
	}

}
