package be.nordinh.simple_cqrs_java;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;
import java.util.UUID;

public abstract class AggregateRoot {

	private List<Event> changes = newArrayList();
	private UUID id;
	private int version;

	public UUID getId() {
		return id;
	}

	public Iterable<Event> getUncommittedChanges() {
		return changes;
	}

	public void markChangesAsCommitted() {
		changes.clear();
	}

	public void loadsFromHistory(Iterable<Event> history) {
		for (Event event : history) {
			applyChange(event, false);
		}
	}

	protected void applyChange(Event event) {
		applyChange(event, true);
	}

	private void applyChange(Event event, boolean isNew) {
		// this.asDynamic().apply(event);
		if (isNew)
			changes.add(event);
	}

}
