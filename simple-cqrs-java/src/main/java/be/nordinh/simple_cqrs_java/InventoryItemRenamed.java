package be.nordinh.simple_cqrs_java;

import java.util.UUID;

public class InventoryItemRenamed extends Event {

	private UUID id;
	private String newName;

	public InventoryItemRenamed(UUID id, String newName) {
		this.id = id;
		this.newName = newName;
	}

	public UUID getId() {
		return id;
	}

	public String getNewName() {
		return newName;
	}
}
