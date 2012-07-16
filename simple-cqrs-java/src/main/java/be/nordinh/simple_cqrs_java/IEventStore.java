package be.nordinh.simple_cqrs_java;

import java.util.List;
import java.util.UUID;

public interface IEventStore {

	void saveEvents(UUID aggregateId, Iterable<Event> events,
			int expectedVersion);

	List<Event> getEventsForAggregate(UUID aggregateId);

}
