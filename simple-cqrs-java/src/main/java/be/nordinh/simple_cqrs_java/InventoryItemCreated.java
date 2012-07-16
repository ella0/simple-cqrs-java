package be.nordinh.simple_cqrs_java;

import java.util.UUID;

public class InventoryItemCreated extends Event {

	private UUID id;
	private String name;

	public InventoryItemCreated(UUID id, String name) {
		this.id = id;
		this.name = name;
	}

	public UUID getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

}
