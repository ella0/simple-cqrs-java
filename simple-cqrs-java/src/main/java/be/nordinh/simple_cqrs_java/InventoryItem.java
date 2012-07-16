package be.nordinh.simple_cqrs_java;

import java.util.UUID;

import org.apache.commons.lang.Validate;

public class InventoryItem extends AggregateRoot {

	private boolean activated;
	private UUID id;

	private void apply(InventoryItemCreated event) {
		this.id = event.getId();
		this.activated = true;
	}

	private void apply(InventoryItemDeactivated event) {
		this.activated = false;
	}

	public void changeName(String newName) {
		Validate.notEmpty(newName);
		applyChange(new InventoryItemRenamed(this.id, newName));
	}

	public void remove(int count) {
		Validate.isTrue(count > 0, "cant remove negative count from inventory");
		applyChange(new ItemsRemovedFromInventory(this.id, count));
	}

}
