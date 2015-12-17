package de.icybits.ts3.sq.api.client.event.interfaces;

public interface INotifyTypes {

	public static final int EVERY_TYPE = 2147483647;
	public static final int NOTIFY_CLIENT_ENTER_VIEW = 1 << 1;
	public static final String NOTIFY_CLIENT_ENTER_VIEW_NAME = "notifycliententerview";
	public static final int NOTIFY_CLIENT_LEFT_VIEW = 1;
	public static final String NOTIFY_CLIENT_LEFT_VIEW_NAME = "notifyclientleftview";
	public static final String[] NOTIFY_TYPES = new String[] { NOTIFY_CLIENT_ENTER_VIEW_NAME,
			NOTIFY_CLIENT_LEFT_VIEW_NAME };
}
