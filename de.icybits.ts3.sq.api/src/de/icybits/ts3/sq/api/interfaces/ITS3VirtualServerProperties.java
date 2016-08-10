package de.icybits.ts3.sq.api.interfaces;

/**
 * This is a list of properties available for virtual servers:
 * <table border="1">
 * <tr>
 * <th>NAME</th>
 * <th>DESCRIPTION</th>
 * <th>CHANGABLE</th>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_NAME</td>
 * <td>Name of the virtual server</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_WELCOMEMESSAGE</td>
 * <td>Welcome message of the virtual server</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_MAXCLIENTS</td>
 * <td>Number of slots available on the virtual server</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_PASSWORD</td>
 * <td>Password of the virtual server</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_FLAG_PASSWORD</td>
 * <td>Indicates whether the server has a password set or not</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_CLIENTSONLINE</td>
 * <td>Number of clients connected to the virtual server</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_QUERYCLIENTSONLINE</td>
 * <td>Number of ServerQuery clients connected to the virtual server</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_CHANNELSONLINE</td>
 * <td>Number of channels created on the virtual server</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_CREATED</td>
 * <td>Creation date and time of the virtual server as UTC timestamp</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_UPTIME</td>
 * <td>Uptime in seconds</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_HOSTMESSAGE</td>
 * <td>Host message of the virtual server</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_HOSTMESSAGE_MODE</td>
 * <td>Host message mode of the virtual server (see Definitions)</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_DEFAULT_SERVER_GROUP</td>
 * <td>Default server group ID</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_DEFAULT_CHANNEL_GROUP</td>
 * <td>Default channel group ID</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_DEFAULT_CHANNEL_ADMIN_GROUP</td>
 * <td>Default channel administrator group ID</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_PLATFORM</td>
 * <td>Operating system the server is running on</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_VERSION</td>
 * <td>Server version information including build number</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_MAX_DOWNLOAD_TOTAL_BANDWIDTH</td>
 * <td>Max bandwidth for outgoing file transfers on the virtual server (Bytes/s)
 * </td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_MAX_UPLOAD_TOTAL_BANDWIDTH</td>
 * <td>Max bandwidth for incoming file transfers on the virtual server (Bytes/s)
 * </td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_HOSTBANNER_URL</td>
 * <td>Host banner URL opened on click</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_HOSTBANNER_GFX_URL</td>
 * <td>Host banner URL used as image source</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_HOSTBANNER_GFX_INTERVAL</td>
 * <td>Interval for reloading the banner on client-side</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_COMPLAIN_AUTOBAN_COUNT</td>
 * <td>Number of complaints needed to ban a client automatically</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_COMPLAIN_AUTOBAN_TIME</td>
 * <td>Time in seconds used for automatic bans triggered by complaints</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_COMPLAIN_REMOVE_TIME</td>
 * <td>Time in seconds before a complaint is deleted automatically</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_MIN_CLIENTS_IN_CHANNEL_BEFORE_FORCED_SILENCE</td>
 * <td>Number of clients in the same channel needed to force silence</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_PRIORITY_SPEAKER_DIMM_MODIFICATOR</td>
 * <td>Client volume lowered automatically while a priority speaker is talking
 * </td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_ANTIFLOOD_POINTS_TICK_REDUCE</td>
 * <td>Anti-flood points removed from a client for being good</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_ANTIFLOOD_POINTS_NEEDED_COMMAND_BLOCK</td>
 * <td>Anti-flood points needed to block commands being executed by the client
 * </td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_ANTIFLOOD_POINTS_NEEDED_IP_BLOCK</td>
 * <td>Anti-flood points needed to block incoming connections from the client
 * </td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_HOSTBANNER_MODE</td>
 * <td>The display mode for the virtual servers hostbanner (see Definitions)
 * </td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_ASK_FOR_PRIVILEGEKEY</td>
 * <td>Indicates whether the initial privilege key for the virtual server has
 * been used or not</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_CLIENT_CONNECTIONS</td>
 * <td>Total number of clients connected to the virtual server since it was last
 * started</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_QUERY_CLIENT_CONNECTIONS</td>
 * <td>Total number of ServerQuery clients connected to the virtual server since
 * it was last started</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_HOSTBUTTON_TOOLTIP</td>
 * <td>Text used for the tooltip of the host button on client-side</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_HOSTBUTTON_GFX_URL</td>
 * <td>Text used for the tooltip of the host button on client-side</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_HOSTBUTTON_URL</td>
 * <td>URL opened on click on the host button</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_DOWNLOAD_QUOTA</td>
 * <td>Download quota for the virtual server (MByte)</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_UPLOAD_QUOTA</td>
 * <td>Upload quota for the virtual server (MByte)</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_MONTH_BYTES_DOWNLOADED</td>
 * <td>Number of bytes downloaded from the virtual server on the current month
 * </td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_MONTH_BYTES_UPLOADED</td>
 * <td>Number of bytes uploaded to the virtual server on the current month</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_TOTAL_BYTES_DOWNLOADED</td>
 * <td>Number of bytes downloaded from the virtual server since it was last
 * started</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_ TOTAL_BYTES_UPLOADED</td>
 * <td>Number of bytes uploaded to the virtual server since it was last started
 * </td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_UNIQUE_IDENTIFER</td>
 * <td>Unique ID of the virtual server</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_ID</td>
 * <td>Database ID of the virtual server</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_MACHINE_ID</td>
 * <td>Machine ID identifying the server instance associated with the virtual
 * server in the database</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_PORT</td>
 * <td>UDP port the virtual server is listening on</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_AUTOSTART</td>
 * <td>Indicates whether the server starts automatically with the server
 * instance or not</td>
 * <td>Yes</td>
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
 * <td>VIRTUALSERVER_STATUS</td>
 * <td>Status of the virtual server (online | virtual online | offline | booting
 * up | shutting down | …)</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_LOG_CLIENT</td>
 * <td>Indicates whether the server logs events related to clients or not</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_LOG_QUERY</td>
 * <td>Indicates whether the server logs events related to ServerQuery clients
 * or not</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_LOG_CHANNEL</td>
 * <td>Indicates whether the server logs events related to channels or not</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_LOG_PERMISSIONS</td>
 * <td>Indicates whether the server logs events related to permissions or not
 * </td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_LOG_SERVER</td>
 * <td>Indicates whether the server logs events related to server changes or not
 * </td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_LOG_FILETRANSFER</td>
 * <td>Indicates whether the server logs events related to file transfers or not
 * </td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_MIN_CLIENT_VERSION</td>
 * <td>Min client version required to connect</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_NEEDED_IDENTITY_SECURITY_LEVEL</td>
 * <td>Minimum client identity security level required to connect to the virtual
 * server</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_NAME_PHONETIC</td>
 * <td>Phonetic name of the virtual server</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_ICON_ID</td>
 * <td>CRC32 checksum of the virtual server icon</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_RESERVED_SLOTS</td>
 * <td>Number of reserved slots available on the virtual server</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_TOTAL_PACKETLOSS_SPEECH</td>
 * <td>The average packet loss for speech data on the virtual server</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_TOTAL_PACKETLOSS_KEEPALIVE</td>
 * <td>The average packet loss for keep alive data on the virtual server</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_TOTAL_PACKETLOSS_CONTROL</td>
 * <td>The average packet loss for control data on the virtual server</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_TOTAL_PACKETLOSS_TOTAL</td>
 * <td>The average packet loss for all data on the virtual server</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_TOTAL_PING</td>
 * <td>The average ping of all clients connected to the virtual server</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_IP</td>
 * <td>The IPv4 address the virtual server is listening on</td>
 * <td>No</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_WEBLIST_ENABLED</td>
 * <td>Indicates whether the server appears in the global web server list or not
 * </td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_CODEC_ENCRYPTION_MODE</td>
 * <td>The global codec encryption mode of the virtual server</td>
 * <td>Yes</td>
 * </tr>
 * <tr>
 * <td>VIRTUALSERVER_FILEBASE</td>
 * <td>The directory where the virtual servers filebase is located</td>
 * <td>No</td>
 * </tr>
 * </table>
 *
 * @author Alias: Iceac Sarutobi
 */
public interface ITS3VirtualServerProperties {

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
	 * <b>VIRTUALSERVER_ANTIFLOOD_POINTS_NEEDED_COMMAND_BLOCK</b>: Anti-flood
	 * points needed to block commands being executed by the client<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_ANTIFLOOD_POINTS_NEEDED_COMMAND_BLOCK = "virtualserver_antiflood_points_needed_command_block";
	/**
	 * <b>VIRTUALSERVER_ANTIFLOOD_POINTS_NEEDED_IP_BLOCK</b>: Anti-flood points
	 * needed to block incoming connections from the client<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_ANTIFLOOD_POINTS_NEEDED_IP_BLOCK = "virtualserver_antiflood_points_needed_ip_block";
	/**
	 * <b>VIRTUALSERVER_ANTIFLOOD_POINTS_TICK_REDUCE</b>: Anti-flood points
	 * removed from a client for being good<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_ANTIFLOOD_POINTS_TICK_REDUCE = "virtualserver_antiflood_points_tick_reduce";
	/**
	 * <b>VIRTUALSERVER_ASK_FOR_PRIVILEGEKEY</b>: Indicates whether the initial
	 * privilege key for the virtual server has been used or not<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_ASK_FOR_PRIVILEGEKEY = "virtualserver_ask_for_privilegekey";
	/**
	 * <b>VIRTUALSERVER_AUTOSTART</b>: Indicates whether the server starts
	 * automatically with the server instance or not<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_AUTOSTART = "virtualserver_autostart";
	/**
	 * <b>VIRTUALSERVER_CHANNELSONLINE</b>: Number of channels created on the
	 * virtual server<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_CHANNELSONLINE = "virtualserver_channelsonline";
	/**
	 * <b>VIRTUALSERVER_CLIENT_CONNECTIONS</b>: Total number of clients connected
	 * to the virtual server since it was last started<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_CLIENT_CONNECTIONS = "virtualserver_client_connections";
	/**
	 * <b>VIRTUALSERVER_CLIENTSONLINE</b>: Number of clients connected to the
	 * virtual server<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_CLIENTSONLINE = "virtualserver_clientsonline";
	/**
	 * <b>VIRTUALSERVER_CODEC_ENCRYPTION_MODE</b>: The global codec encryption
	 * mode of the virtual server<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_CODEC_ENCRYPTION_MODE = "virtualserver_codec_encryption_mode";
	/**
	 * <b>VIRTUALSERVER_COMPLAIN_AUTOBAN_COUNT</b>: Number of complaints needed to
	 * ban a client automatically<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_COMPLAIN_AUTOBAN_COUNT = "virtualserver_complain_autoban_count";
	/**
	 * <b>VIRTUALSERVER_COMPLAIN_AUTOBAN_TIME</b>: Time in seconds used for
	 * automatic bans triggered by complaints<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_COMPLAIN_AUTOBAN_TIME = "virtualserver_complain_autoban_time";
	/**
	 * <b>VIRTUALSERVER_COMPLAIN_REMOVE_TIME</b>: Time in seconds before a
	 * complaint is deleted automatically<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_COMPLAIN_REMOVE_TIME = "virtualserver_complain_remove_time";
	/**
	 * <b>VIRTUALSERVER_CREATED</b>: Creation date and time of the virtual server
	 * as UTC timestamp<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_CREATED = "virtualserver_created";
	/**
	 * <b>VIRTUALSERVER_DEFAULT_CHANNEL_ADMIN_GROUP</b>: Default channel
	 * administrator group ID<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_DEFAULT_CHANNEL_ADMIN_GROUP = "virtualserver_default_channel_admin_group";
	/**
	 * <b>VIRTUALSERVER_DEFAULT_CHANNEL_GROUP</b>: Default channel group ID<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_DEFAULT_CHANNEL_GROUP = "virtualserver_default_channel_group";
	/**
	 * <b>VIRTUALSERVER_DEFAULT_SERVER_GROUP</b>: Default server group ID<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_DEFAULT_SERVER_GROUP = "virtualserver_default_server_group";
	/**
	 * <b>VIRTUALSERVER_DOWNLOAD_QUOTA</b>: Download quota for the virtual server
	 * (MByte)<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_DOWNLOAD_QUOTA = "virtualserver_download_quota";
	/**
	 * <b>VIRTUALSERVER_FILEBASE</b>: The directory where the virtual servers
	 * filebase is located<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_FILEBASE = "virtualserver_filebase";
	/**
	 * <b>VIRTUALSERVER_FLAG_PASSWORD</b>: Indicates whether the server has a
	 * password set or not<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_FLAG_PASSWORD = "virtualserver_flag_password";
	/**
	 * <b>VIRTUALSERVER_HOSTBANNER_GFX_INTERVAL</b>: Interval for reloading the
	 * banner on client-side<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_HOSTBANNER_GFX_INTERVAL = "virtualserver_hostbanner_gfx_interval";
	/**
	 * <b>VIRTUALSERVER_HOSTBANNER_GFX_URL</b>: Host banner URL used as image
	 * source<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_HOSTBANNER_GFX_URL = "virtualserver_hostbanner_gfx_url";
	/**
	 * <b>VIRTUALSERVER_HOSTBANNER_MODE</b>: The display mode for the virtual
	 * servers hostbanner (see Definitions)<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_HOSTBANNER_MODE = "virtualserver_hostbanner_mode";
	/**
	 * <b>VIRTUALSERVER_HOSTBANNER_URL</b>: Host banner URL opened on click<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_HOSTBANNER_URL = "virtualserver_hostbanner_url";
	/**
	 * <b>VIRTUALSERVER_HOSTBUTTON_GFX_URL</b>: Text used for the tooltip of the
	 * host button on client-side<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_HOSTBUTTON_GFX_URL = "virtualserver_hostbutton_gfx_url";
	/**
	 * <b>VIRTUALSERVER_HOSTBUTTON_TOOLTIP</b>: Text used for the tooltip of the
	 * host button on client-side<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_HOSTBUTTON_TOOLTIP = "virtualserver_hostbutton_tooltip";
	/**
	 * <b>VIRTUALSERVER_HOSTBUTTON_URL</b>: URL opened on click on the host button
	 * <br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_HOSTBUTTON_URL = "virtualserver_hostbutton_url";
	/**
	 * <b>VIRTUALSERVER_HOSTMESSAGE</b>: Host message of the virtual server<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_HOSTMESSAGE = "virtualserver_hostmessage";
	/**
	 * <b>VIRTUALSERVER_HOSTMESSAGE_MODE</b>: Host message mode of the virtual
	 * server (see Definitions)<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_HOSTMESSAGE_MODE = "virtualserver_hostmessage_mode";
	/**
	 * <b>VIRTUALSERVER_ICON_ID</b>: CRC32 checksum of the virtual server icon<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_ICON_ID = "virtualserver_icon_id";
	/**
	 * <b>VIRTUALSERVER_ID</b>: Database ID of the virtual server<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_ID = "virtualserver_id";
	/**
	 * <b>VIRTUALSERVER_IP</b>: The IPv4 address the virtual server is listening
	 * on<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_IP = "virtualserver_ip";
	/**
	 * <b>VIRTUALSERVER_LOG_CHANNEL</b>: Indicates whether the server logs events
	 * related to channels or not<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_LOG_CHANNEL = "virtualserver_log_channel";
	/**
	 * <b>VIRTUALSERVER_LOG_CLIENT</b>: Indicates whether the server logs events
	 * related to clients or not<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_LOG_CLIENT = "virtualserver_log_client";
	/**
	 * <b>VIRTUALSERVER_LOG_FILETRANSFER</b>: Indicates whether the server logs
	 * events related to file transfers or not<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_LOG_FILETRANSFER = "virtualserver_log_filetransfer";
	/**
	 * <b>VIRTUALSERVER_LOG_PERMISSIONS</b>: Indicates whether the server logs
	 * events related to permissions or not<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_LOG_PERMISSIONS = "virtualserver_log_permissions";
	/**
	 * <b>VIRTUALSERVER_LOG_QUERY</b>: Indicates whether the server logs events
	 * related to ServerQuery clients or not<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_LOG_QUERY = "virtualserver_log_query";
	/**
	 * <b>VIRTUALSERVER_LOG_SERVER</b>: Indicates whether the server logs events
	 * related to server changes or not<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_LOG_SERVER = "virtualserver_log_server";
	/**
	 * <b>VIRTUALSERVER_MACHINE_ID</b>: Machine ID identifying the server instance
	 * associated with the virtual server in the database<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_MACHINE_ID = "virtualserver_machine_id";
	/**
	 * <b>VIRTUALSERVER_MAX_DOWNLOAD_TOTAL_BANDWIDTH</b>: Max bandwidth for
	 * outgoing file transfers on the virtual server (Bytes/s)<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_MAX_DOWNLOAD_TOTAL_BANDWIDTH = "virtualserver_max_download_total_bandwidth";
	/**
	 * <b>VIRTUALSERVER_MAX_UPLOAD_TOTAL_BANDWIDTH</b>: Max bandwidth for incoming
	 * file transfers on the virtual server (Bytes/s)<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_MAX_UPLOAD_TOTAL_BANDWIDTH = "virtualserver_max_upload_total_bandwidth";
	/**
	 * <b>VIRTUALSERVER_MAXCLIENTS</b>: Number of slots available on the virtual
	 * server<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_MAXCLIENTS = "virtualserver_maxclients";
	/**
	 * <b>VIRTUALSERVER_MIN_CLIENT_VERSION</b>: Min client version required to
	 * connect<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_MIN_CLIENT_VERSION = "virtualserver_min_client_version";
	/**
	 * <b>VIRTUALSERVER_MIN_CLIENTS_IN_CHANNEL_BEFORE_FORCED_SILENCE</b>: Number
	 * of clients in the same channel needed to force silence<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_MIN_CLIENTS_IN_CHANNEL_BEFORE_FORCED_SILENCE = "virtualserver_min_clients_in_channel_before_forced_silence";
	/**
	 * <b>VIRTUALSERVER_MONTH_BYTES_DOWNLOADED</b>: Number of bytes downloaded
	 * from the virtual server on the current month<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_MONTH_BYTES_DOWNLOADED = "virtualserver_month_bytes_downloaded";
	/**
	 * <b>VIRTUALSERVER_MONTH_BYTES_UPLOADED</b>: Number of bytes uploaded to the
	 * virtual server on the current month<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_MONTH_BYTES_UPLOADED = "virtualserver_month_bytes_uploaded";
	/**
	 * <b>VIRTUALSERVER_NAME</b>: Name of the virtual server<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_NAME = "virtualserver_name";
	/**
	 * <b>VIRTUALSERVER_NAME_PHONETIC</b>: Phonetic name of the virtual server<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_NAME_PHONETIC = "virtualserver_name_phonetic";
	/**
	 * <b>VIRTUALSERVER_NEEDED_IDENTITY_SECURITY_LEVEL</b>: Minimum client
	 * identity security level required to connect to the virtual server<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_NEEDED_IDENTITY_SECURITY_LEVEL = "virtualserver_needed_identity_security_level";
	/**
	 * <b>VIRTUALSERVER_PASSWORD</b>: Password of the virtual server<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_PASSWORD = "virtualserver_password";
	/**
	 * <b>VIRTUALSERVER_PLATFORM</b>: Operating system the server is running on
	 * <br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_PLATFORM = "virtualserver_platform";
	/**
	 * <b>VIRTUALSERVER_PORT</b>: UDP port the virtual server is listening on<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_PORT = "virtualserver_port";
	/**
	 * <b>VIRTUALSERVER_PRIORITY_SPEAKER_DIMM_MODIFICATOR</b>: Client volume
	 * lowered automatically while a priority speaker is talking<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_PRIORITY_SPEAKER_DIMM_MODIFICATOR = "virtualserver_priority_speaker_dimm_modificator";
	/**
	 * <b>VIRTUALSERVER_QUERY_CLIENT_CONNECTIONS</b>: Total number of ServerQuery
	 * clients connected to the virtual server since it was last started<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_QUERY_CLIENT_CONNECTIONS = "virtualserver_query_client_connections";
	/**
	 * <b>VIRTUALSERVER_QUERYCLIENTSONLINE</b>: Number of ServerQuery clients
	 * connected to the virtual server<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_QUERYCLIENTSONLINE = "virtualserver_queryclientsonline";
	/**
	 * <b>VIRTUALSERVER_RESERVED_SLOTS</b>: Number of reserved slots available on
	 * the virtual server<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_RESERVED_SLOTS = "virtualserver_reserved_slots";
	/**
	 * <b>VIRTUALSERVER_STATUS</b>: Status of the virtual server (online | virtual
	 * online | offline | booting up | shutting down | …)<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_STATUS = "virtualserver_status";
	/**
	 * <b>VIRTUALSERVER_TOTAL_BYTES_DOWNLOADED</b>: Number of bytes downloaded
	 * from the virtual server since it was last started<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_TOTAL_BYTES_DOWNLOADED = "virtualserver_total_bytes_downloaded";
	/**
	 * <b>VIRTUALSERVER_TOTAL_BYTES_UPLOADED</b>: Number of bytes uploaded to the
	 * virtual server since it was last started<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_TOTAL_BYTES_UPLOADED = "virtualserver_total_bytes_uploaded";
	/**
	 * <b>VIRTUALSERVER_TOTAL_PACKETLOSS_CONTROL</b>: The average packet loss for
	 * control data on the virtual server<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_TOTAL_PACKETLOSS_CONTROL = "virtualserver_total_packetloss_control";
	/**
	 * <b>VIRTUALSERVER_TOTAL_PACKETLOSS_KEEPALIVE</b>: The average packet loss
	 * for keep alive data on the virtual server<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_TOTAL_PACKETLOSS_KEEPALIVE = "virtualserver_total_packetloss_keepalive";
	/**
	 * <b>VIRTUALSERVER_TOTAL_PACKETLOSS_SPEECH</b>: The average packet loss for
	 * speech data on the virtual server<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_TOTAL_PACKETLOSS_SPEECH = "virtualserver_total_packetloss_speech";
	/**
	 * <b>VIRTUALSERVER_TOTAL_PACKETLOSS_TOTAL</b>: The average packet loss for
	 * all data on the virtual server<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_TOTAL_PACKETLOSS_TOTAL = "virtualserver_total_packetloss_total";
	/**
	 * <b>VIRTUALSERVER_TOTAL_PING</b>: The average ping of all clients connected
	 * to the virtual server<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_TOTAL_PING = "virtualserver_total_ping";
	/**
	 * <b>VIRTUALSERVER_UNIQUE_IDENTIFER</b>: Unique ID of the virtual server<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_UNIQUE_IDENTIFER = "virtualserver_unique_identifer";
	/**
	 * <b>VIRTUALSERVER_UPLOAD_QUOTA</b>: Upload quota for the virtual server
	 * (MByte)<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_UPLOAD_QUOTA = "virtualserver_upload_quota";
	/**
	 * <b>VIRTUALSERVER_UPTIME</b>: Uptime in seconds<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_UPTIME = "virtualserver_uptime";
	/**
	 * <b>VIRTUALSERVER_VERSION</b>: Server version information including build
	 * number<br>
	 * <b>Changeable</b>: No
	 */
	public static final String VIRTUALSERVER_VERSION = "virtualserver_version";
	/**
	 * <b>VIRTUALSERVER_WEBLIST_ENABLED</b>: Indicates whether the server appears
	 * in the global web server list or not<br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_WEBLIST_ENABLED = "virtualserver_weblist_enabled";
	/**
	 * <b>VIRTUALSERVER_WELCOMEMESSAGE</b>: Welcome message of the virtual server
	 * <br>
	 * <b>Changeable</b>: Yes
	 */
	public static final String VIRTUALSERVER_WELCOMEMESSAGE = "virtualserver_welcomemessage";
}
