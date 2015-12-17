package de.icybits.ts3.sq.api.client.event;

abstract public class NotifyListener {

	private int types;

	public NotifyListener(int types) {
		this.types = types;
	}

	public int getTypes() {
		return types;
	}

	public abstract void notify(NotifyEvent event);
}
