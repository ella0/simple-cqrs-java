package be.nordinh.simple_cqrs_java;

import java.util.UUID;

public class ItemsCheckedInToInventory extends Event {

	private UUID id;
	private int count;

	public ItemsCheckedInToInventory(UUID id, int count) {
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
