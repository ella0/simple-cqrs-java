package be.nordinh.simple_cqrs_java;

import java.util.UUID;

public interface IRepository<T extends AggregateRoot> {

	void save(T aggregate, int expectedVersion);

	T getById(UUID id);

}
