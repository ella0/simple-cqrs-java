package be.nordinh.simple_cqrs_java;

import java.util.UUID;

public class ItemsRemovedFromInventory extends Event {

	private UUID id;
	private int count;

	public ItemsRemovedFromInventory(UUID id, int count) {
		this.id = id;
		this.count = count;
	}

	public UUID getId() {
		return id;
	}

	public int getCount() {
		return count;
	}

}
