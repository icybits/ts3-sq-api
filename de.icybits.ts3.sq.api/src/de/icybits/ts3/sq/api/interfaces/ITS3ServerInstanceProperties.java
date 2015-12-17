package de.icybits.ts3.sq.api.interfaces;

/**
 * This is a list of properties available for the server instance:
 * <table border="1">
 * <tr>
 * <th>NAME</th>
 * <th>DESCRIPTION</th>
 * <th>CHANGABLE</th>
 * </tr>
 * <tr>
 * <td>INSTANCE_UPTIME</td>
 * <td>Uptime in seconds</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>HOST_TIMESTAMP_UTC</td>
 * <td>Current server date and time as UTC timestamp</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVERS_RUNNING_TOTAL</td>
 * <td>Number of virtual servers running</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>CONNECTION_FILETRANSFER_BANDWIDTH_SENT</td>
 * <td>Current bandwidth used for outgoing file transfers (Bytes/s)</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>CONNECTION_FILETRANSFER_BANDWIDTH_RECEIVED</td>
 * <td>Current bandwidth used for incoming file transfers (Bytes/s)</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>CONNECTION_PACKETS_SENT_TOTAL</td>
 * <td>Total amount of packets sent</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>CONNECTION_PACKETS_RECEIVED_TOTAL</td>
 * <td>Total amount of packets received</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>CONNECTION_BYTES_SENT_TOTAL</td>
 * <td>Total amount of bytes sent</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>CONNECTION_BYTES_RECEIVED_TOTAL</td>
 * <td>Total amount of bytes received</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>CONNECTION_BANDWIDTH_SENT_LAST_SECOND_TOTAL</td>
 * <td>Average bandwidth used for outgoing data in the last second (Bytes/s)
 * </td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>CONNECTION_BANDWIDTH_RECEIVED_LAST_SECOND_TOTAL</td>
 * <td>Average bandwidth used for incoming data in the last second (Bytes/s)
 * </td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>CONNECTION_BANDWIDTH_SENT_LAST_MINUTE_TOTAL</td>
 * <td>Average bandwidth used for outgoing data in the last minute (Bytes/s)
 * </td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL</td>
 * <td>Average bandwidth used for incoming data in the last minute (Bytes/s)
 * </td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>SERVERINSTANCE_DATABASE_VERSION</td>
 * <td>Database revision number</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>SERVERINSTANCE_GUEST_SERVERQUERY_GROUP</td>
 * <td>Default ServerQuery group ID</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>SERVERINSTANCE_TEMPLATE_SERVERADMIN_GROUP</td>
 * <td>Default template group ID for administrators on new virtual servers (used
 * to create initial token)</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>SERVERINSTANCE_FILETRANSFER_PORT</td>
 * <td>TCP port used for file transfers</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>SERVERINSTANCE_MAX_DOWNLOAD_TOTAL_BANDWIDTH</td>
 * <td>Max bandwidth available for outgoing file transfers (Bytes/s)</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>SERVERINSTANCE_MAX_UPLOAD_TOTAL_BANDWIDTH</td>
 * <td>Max bandwidth available for incoming file transfers (Bytes/s)</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>SERVERINSTANCE_TEMPLATE_SERVERDEFAULT_GROUP</td>
 * <td>Default server group ID used in templates</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>SERVERINSTANCE_TEMPLATE_CHANNELDEFAULT_GROUP</td>
 * <td>Default channel group ID used in templates</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>SERVERINSTANCE_TEMPLATE_CHANNELADMIN_GROUP</td>
 * <td>Default channel administrator group ID used in templates</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVERS_TOTAL_MAXCLIENTS</td>
 * <td>Max number of clients for all virtual servers</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVERS_TOTAL_CLIENTS_ONLINE</td>
 * <td>Number of clients online on all virtual servers</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVERS_TOTAL_CHANNELS_ONLINE</td>
 * <td>Number of channels on all virtual servers</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>SERVERINSTANCE_SERVERQUERY_FLOOD_COMMANDS</td>
 * <td>Max number of commands allowed in
 * <SERVERINSTANCE_SERVERQUERY_FLOOD_TIME> seconds</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>SERVERINSTANCE_SERVERQUERY_FLOOD_TIME</td>
 * <td>Timeframe in seconds for
 * <SERVERINSTANCE_SERVERQUERY_FLOOD_COMMANDS> commands</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>SERVERINSTANCE_SERVERQUERY_FLOOD_BAN_TIME</td>
 * <td>Time in seconds used for automatic bans triggered by the ServerQuery
 * flood protection</td>
 * <td>Yes</td>
 * </tr>
 * </table>
 * <p>
 *
 * @author iceac
 */
public interface ITS3ServerInstanceProperties {

	/**
	 * <b>CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL</b>: Average bandwidth
	 * used for incoming data in the last minute (Bytes/s)<br>
	 * <b>Changeable</b>: No
	 */
	public static final String CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL = "connection_bandwidth_received_last_minute_total";
	/**
	 * <b>CONNECTION_BANDWIDTH_RECEIVED_LAST_SECOND_TOTAL</b>: Average bandwidth
	 * used for incoming data in the last second (Bytes/s)<br>
	 * <b>Changeable</b>: No
	 */
	public static final String CONNECTION_BANDWIDTH_RECEIVED_LAST_SECOND_TOTAL = "connection_bandwidth_received_last_second_total";
	/**
	 * <b>CONNECTION_BANDWIDTH_SENT_LAST_MINUTE_TOTAL</b>: Average bandwidth used
	 * for outgoing data in the last minute (Bytes/s)<br>
	 * <b>Changeable</b>: No
	 */
	public static final String CONNECTION_BANDWIDTH_SENT_LAST_MINUTE_TOTAL = "connection_bandwidth_sent_last_minute_total";
	/**
	 * <b>CONNECTION_BANDWIDTH_SENT_LAST_SECOND_TOTAL</b>: Average bandwidth used
	 * for outgoing data in the last second (Bytes/s)<br>
	 * <b>Changeable</b>: No
	 */
	public static final String CONNECTION_BANDWIDTH_SENT_LAST_SECOND_TOTAL = "connection_bandwidth_sent_last_second_total";
	/**
	 * <b>CONNECTION_BYTES_RECEIVED_TOTAL</b>: Total amount of bytes received<br>
	 * <b>Changeable</b>: No
	 */
	public static final String CONNECTION_BYTES_RECEIVED_TOTAL = "connection_bytes_received_total";
	/**
	 * <b>CONNECTION_BYTES_SENT_TOTAL</b>: Total amount of bytes sent<br>
	 * <b>Changeable</b>: No
	 */
	public static final String CONNECTION_BYTES_SENT_TOTAL = "connection_bytes_sent_total";
	/**
	 * <b>CONNECTION_FILETRANSFER_BANDWIDTH_RECEIVED</b>: Current bandwidth used
	 * for incoming file transfers (Bytes/s)<br>
	 * <b>Changeable</b>: No
	 */
	public static final String CONNECTION_FILETRANSFER_BANDWIDTH_RECEIVED = "connection_filetransfer_bandwidth_received";
	/**
	 * <b>CONNECTION_FILETRANSFER_BANDWIDTH_SENT</b>: Current bandwidth used for
	 * outgoing file transfers (Bytes/s)<br>
	 * <b>Changeable</b>: No
	 */
	public static final String CONNECTION_FILETRANSFER_BANDWIDTH_SENT = "connection_filetransfer_bandwidth_sent";
	/**
	 * <b>CONNECTION_PACKETS_RECEIVED_TOTAL</b>: Total amount of packets received
	 * <br>
	 * <b>Changeable</b>: No
	 */
	public static final String CONNECTION_PACKETS_RECEIVED_TOTAL = "connection_packets_received_total";
	/**
	 * <b>CONNECTION_PACKETS_SENT_TOTAL</b>: Total amount of packets sent<br>
	 * <b>Changeable</b>: No
	 */
	public static final String CONNECTION_PACKETS_SENT_TOTAL = "connection_packets_sent_total";
	/**
	 * <b>HOST_TIMESTAMP_UTC</b>: Current server date and time as UTC timestamp
	 * <br>
	 * <b>Changeable</b>: No
	 */
	public static final String HOST_TIMESTAMP_UTC = "host_timestamp_utc";
	/**
	 * <b>INSTANCE_UPTIME</b>: Uptime in seconds<br>
	 * <b>Changeable</b>: No
	 */
	public static final String INSTANCE_UPTIME = "instance_uptime";
	/**
	 * <b>SERVERINSTANCE_DATABASE_VERSION</b>: Database revision number<br>
	 * <b>Changeable</b>: No
	 */
	public static final String SERVERINSTANCE_DATABASE_VERSION = "serverinstance_database_version";
	/**
	 * <b>SERVERINSTANCE_FILETRANSFER_PORT</b>: TCP port used for file transfers
	 * <br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String SERVERINSTANCE_FILETRANSFER_PORT = "serverinstance_filetransfer_port";
	/**
	 * <b>SERVERINSTANCE_GUEST_SERVERQUERY_GROUP</b>: Default ServerQuery group ID
	 * <br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String SERVERINSTANCE_GUEST_SERVERQUERY_GROUP = "serverinstance_guest_serverquery_group";
	/**
	 * <b>SERVERINSTANCE_MAX_DOWNLOAD_TOTAL_BANDWIDTH</b>: Max bandwidth available
	 * for outgoing file transfers (Bytes/s)<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String SERVERINSTANCE_MAX_DOWNLOAD_TOTAL_BANDWIDTH = "serverinstance_max_download_total_bandwidth";
	/**
	 * <b>SERVERINSTANCE_MAX_UPLOAD_TOTAL_BANDWIDTH</b>: Max bandwidth available
	 * for incoming file transfers (Bytes/s)<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String SERVERINSTANCE_MAX_UPLOAD_TOTAL_BANDWIDTH = "serverinstance_max_upload_total_bandwidth";
	/**
	 * <b>SERVERINSTANCE_SERVERQUERY_FLOOD_BAN_TIME</b>: Time in seconds used for
	 * automatic bans triggered by the ServerQuery flood protection<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String SERVERINSTANCE_SERVERQUERY_FLOOD_BAN_TIME = "serverinstance_serverquery_flood_ban_time";
	/**
	 * <b>SERVERINSTANCE_SERVERQUERY_FLOOD_COMMANDS</b>: Max number of commands
	 * allowed in <SERVERINSTANCE_SERVERQUERY_FLOOD_TIME> seconds<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String SERVERINSTANCE_SERVERQUERY_FLOOD_COMMANDS = "SERVERINSTANCE_SERVERQUERY_FLOOD_COMMANDS";
	/**
	 * <b>SERVERINSTANCE_SERVERQUERY_FLOOD_TIME</b>: Timeframe in seconds for
	 * <SERVERINSTANCE_SERVERQUERY_FLOOD_COMMANDS> commands<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String SERVERINSTANCE_SERVERQUERY_FLOOD_TIME = "serverinstance_serverquery_flood_time";
	/**
	 * <b>SERVERINSTANCE_TEMPLATE_CHANNELADMIN_GROUP</b>: Default channel
	 * administrator group ID used in templates<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String SERVERINSTANCE_TEMPLATE_CHANNELADMIN_GROUP = "serverinstance_template_channeladmin_group";
	/**
	 * <b>SERVERINSTANCE_TEMPLATE_CHANNELDEFAULT_GROUP</b>: Default channel group
	 * ID used in templates<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String SERVERINSTANCE_TEMPLATE_CHANNELDEFAULT_GROUP = "serverinstance_template_channeldefault_group";
	/**
	 * <b>SERVERINSTANCE_TEMPLATE_SERVERADMIN_GROUP</b>: Default template group ID
	 * for administrators on new virtual servers (used to create initial token)
	 * <br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String SERVERINSTANCE_TEMPLATE_SERVERADMIN_GROUP = "serverinstance_template_serveradmin_group";
	/**
	 * <b>SERVERINSTANCE_TEMPLATE_SERVERDEFAULT_GROUP</b>: Default server group ID
	 * used in templates<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String SERVERINSTANCE_TEMPLATE_SERVERDEFAULT_GROUP = "serverinstance_template_serverdefault_group";
	/**
	 * <b>VIRTUALSERVERS_RUNNING_TOTAL</b>: Number of virtual servers running<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVERS_RUNNING_TOTAL = "virtualservers_running_total";
	/**
	 * <b>VIRTUALSERVERS_TOTAL_CHANNELS_ONLINE</b>: Number of channels on all
	 * virtual servers<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVERS_TOTAL_CHANNELS_ONLINE = "virtualservers_total_channels_online";
	/**
	 * <b>VIRTUALSERVERS_TOTAL_CLIENTS_ONLINE</b>: Number of clients online on all
	 * virtual servers<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVERS_TOTAL_CLIENTS_ONLINE = "virtualservers_total_clients_online";
	/**
	 * <b>VIRTUALSERVERS_TOTAL_MAXCLIENTS</b>: Max number of clients for all
	 * virtual servers<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVERS_TOTAL_MAXCLIENTS = "virtualservers_total_maxclients";
}
