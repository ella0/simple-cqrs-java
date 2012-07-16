package be.nordinh.simple_cqrs_java;

import java.util.UUID;

public class InventoryItemDeactivated extends Event {

	private UUID id;

	public InventoryItemDeactivated(UUID id) {
		this.id = id;
	}

	public UUID getId() {
		return id;
	}

}
