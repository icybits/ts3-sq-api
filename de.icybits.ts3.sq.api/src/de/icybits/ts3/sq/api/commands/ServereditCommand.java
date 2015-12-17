package de.icybits.ts3.sq.api.commands;

import java.math.BigInteger;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterBigIntegerValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterStringValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3Definitions;
import de.icybits.ts3.sq.api.interfaces.ITS3Definitions.CodecEncryptionMode;
import de.icybits.ts3.sq.api.interfaces.ITS3Definitions.HostBannerMode;
import de.icybits.ts3.sq.api.interfaces.ITS3Definitions.HostMessageMode;
import de.icybits.ts3.sq.api.interfaces.ITS3VirtualServerProperties;

/**
 * Changes the selected virtual servers configuration using given properties.
 * Note that this command accepts multiple properties which means that you're
 * able to change all settings of the selected virtual server at once.
 * <p>
 * For detailed information, see {@link ITS3VirtualServerProperties}.
 *
 * @author iceac_000
 */
public class ServereditCommand extends Command
		implements
			ITS3CommandNames,
			ITS3VirtualServerProperties {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_VIRTUALSERVER_MODIFY_NAME,
			Permissions.B_VIRTUALSERVER_MODIFY_WELCOMEMESSAGE,
			Permissions.B_VIRTUALSERVER_MODIFY_MAXCLIENTS,
			Permissions.B_VIRTUALSERVER_MODIFY_RESERVED_SLOTS,
			Permissions.B_VIRTUALSERVER_MODIFY_PASSWORD,
			Permissions.B_VIRTUALSERVER_MODIFY_DEFAULT_SERVERGROUP,
			Permissions.B_VIRTUALSERVER_MODIFY_DEFAULT_CHANNELGROUP,
			Permissions.B_VIRTUALSERVER_MODIFY_DEFAULT_CHANNELADMINGROUP,
			Permissions.B_VIRTUALSERVER_MODIFY_FT_SETTINGS,
			Permissions.B_VIRTUALSERVER_MODIFY_FT_QUOTAS,
			Permissions.B_VIRTUALSERVER_MODIFY_CHANNEL_FORCED_SILENCE,
			Permissions.B_VIRTUALSERVER_MODIFY_COMPLAIN,
			Permissions.B_VIRTUALSERVER_MODIFY_ANTIFLOOD,
			Permissions.B_VIRTUALSERVER_MODIFY_HOSTMESSAGE,
			Permissions.B_VIRTUALSERVER_MODIFY_HOSTBANNER,
			Permissions.B_VIRTUALSERVER_MODIFY_HOSTBUTTON,
			Permissions.B_VIRTUALSERVER_MODIFY_PORT,
			Permissions.B_VIRTUALSERVER_MODIFY_AUTOSTART,
			Permissions.B_VIRTUALSERVER_MODIFY_NEEDED_IDENTITY_SECURITY_LEVEL,
			Permissions.B_VIRTUALSERVER_MODIFY_PRIORITY_SPEAKER_DIMM_MODIFICATOR,
			Permissions.B_VIRTUALSERVER_MODIFY_LOG_SETTINGS,
			Permissions.B_VIRTUALSERVER_MODIFY_ICON_ID,
			Permissions.B_VIRTUALSERVER_MODIFY_WEBLIST,
			Permissions.B_VIRTUALSERVER_MODIFY_MIN_CLIENT_VERSION,
			Permissions.B_VIRTUALSERVER_MODIFY_CODEC_ENCRYPTION_MODE};

	/**
	 * Changes the selected virtual servers configuration using given
	 * properties. Note that this command accepts multiple properties which
	 * means that you're able to change all settings of the selected virtual
	 * server at once.
	 * <p>
	 * For detailed information, see {@link ITS3VirtualServerProperties}.
	 */
	public ServereditCommand() {
		super(COMMAND_SERVEREDIT);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.icybits.ts3.sq.api.interfaces.ITS3Permission#getPermissions()
	 */
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}

	/**
	 * Anti-flood points needed to block commands being executed by the client.
	 * 
	 * @param count
	 *            the count needed
	 * @return This command.
	 */
	public ServereditCommand setAntiFloodPointsNeededCommandBlock(int count) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_ANTIFLOOD_POINTS_NEEDED_COMMAND_BLOCK, count));
		return this;
	}

	/**
	 * Anti-flood points needed to block incoming connections from the client.
	 * 
	 * @param count
	 *            the count needed
	 * @return This command.
	 */
	public ServereditCommand setAntiFloodPointsNeededIPBlock(int count) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_ANTIFLOOD_POINTS_NEEDED_IP_BLOCK, count));
		return this;
	}

	/**
	 * Anti-flood points removed from a client for being good.
	 * 
	 * @param number
	 *            the number of points reduced
	 * @return This command.
	 */
	public ServereditCommand setAntiFloodPointsTickReduce(int number) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_ANTIFLOOD_POINTS_TICK_REDUCE, number));
		return this;
	}

	/**
	 * The display mode for the virtual servers hostbanner (see
	 * {@link ITS3Definitions}).
	 * 
	 * @param mode
	 *            the host banner mode
	 * @return This command.
	 */
	public ServereditCommand setAntiHostBannerMode(HostBannerMode mode) {
		setParameter(new ParameterIntegerValue(VIRTUALSERVER_HOSTBANNER_MODE,
				mode.getNumber()));
		return this;
	}

	/**
	 * Indicates whether the server starts automatically with the server
	 * instance or not.
	 * 
	 * @param autostart
	 *            an integer indicating autostart
	 * @return This command.
	 */
	public ServereditCommand setAutoStart(Integer autostart) {
		setParameter(
				new ParameterIntegerValue(VIRTUALSERVER_AUTOSTART, autostart));
		return this;
	}

	/**
	 * Status of the virtual server (online | virtual online | offline | booting
	 * up | shutting down | …).
	 * 
	 * @param status
	 *            the virtual server status
	 * @return This command.
	 */
	public ServereditCommand setAutoStart(String status) {
		setParameter(new ParameterStringValue(VIRTUALSERVER_STATUS, status));
		return this;
	}

	/**
	 * The global codec encryption mode of the virtual server.
	 * 
	 * @param mode
	 *            the codec encryption mode
	 * @return This command.
	 */
	public ServereditCommand setCodecEncryptionMode(CodecEncryptionMode mode) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_CODEC_ENCRYPTION_MODE, mode.getNumber()));
		return this;
	}

	/**
	 * Number of complaints needed to ban a client automatically.
	 * 
	 * @param count
	 *            the complaints count
	 * @return This command.
	 */
	public ServereditCommand setComplainAutoBanCount(int count) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_COMPLAIN_AUTOBAN_COUNT, count));
		return this;
	}

	/**
	 * Time in seconds used for automatic bans triggered by complaints.
	 * 
	 * @param time
	 *            the time in seconds
	 * @return This command.
	 */
	public ServereditCommand setComplainAutoBanTime(int time) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_COMPLAIN_AUTOBAN_TIME, time));
		return this;
	}

	/**
	 * Time in seconds before a complaint is deleted automatically.
	 * 
	 * @param time
	 *            the time in seconds
	 * @return This command.
	 */
	public ServereditCommand setComplainRemoveTime(int time) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_COMPLAIN_REMOVE_TIME, time));
		return this;
	}

	/**
	 * Default channel administrator group ID.
	 * 
	 * @param groupID
	 *            the group ID
	 * @return This command.
	 */
	public ServereditCommand setDefaultChannelAdminGroup(Integer groupID) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_DEFAULT_CHANNEL_ADMIN_GROUP, groupID));
		return this;
	}

	/**
	 * Default channel group ID.
	 * 
	 * @param groupID
	 *            the group ID
	 * @return This command.
	 */
	public ServereditCommand setDefaultChannelGroup(Integer groupID) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_DEFAULT_CHANNEL_GROUP, groupID));
		return this;
	}

	/**
	 * Default server group ID.
	 * 
	 * @param groupID
	 *            the group ID
	 * @return This command.
	 */
	public ServereditCommand setDefaultServerGroup(Integer groupID) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_DEFAULT_SERVER_GROUP, groupID));
		return this;
	}

	/**
	 * Download quota for the virtual server (MByte).
	 * 
	 * @param mByte
	 *            the download quota in MBytes
	 * @return This command.
	 */
	public ServereditCommand setDownloadQuota(Integer mByte) {
		setParameter(
				new ParameterIntegerValue(VIRTUALSERVER_DOWNLOAD_QUOTA, mByte));
		return this;
	}

	/**
	 * Interval for reloading the banner on client-side.
	 * 
	 * @param interval
	 *            the reload interval
	 * @return This command.
	 */
	public ServereditCommand setHostBannerGFXInterval(int interval) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_HOSTBANNER_GFX_INTERVAL, interval));
		return this;
	}

	/**
	 * Host banner URL used as image source.
	 * 
	 * @param gfxURL
	 *            the host banner image source URL
	 * @return This command.
	 */
	public ServereditCommand setHostBannerGFXURL(String gfxURL) {
		setParameter(new ParameterStringValue(VIRTUALSERVER_HOSTBANNER_GFX_URL,
				gfxURL));
		return this;
	}

	/**
	 * Host banner URL opened on click.
	 * 
	 * @param url
	 *            the host banner URL
	 * @return This command.
	 */
	public ServereditCommand setHostBannerURL(String url) {
		setParameter(
				new ParameterStringValue(VIRTUALSERVER_HOSTBANNER_URL, url));
		return this;
	}

	/**
	 * Text used for the tooltip of the host button on client-side.
	 * 
	 * @param gfxURL
	 *            the host button GFX URL
	 * @return This command.
	 */
	public ServereditCommand setHostButtonGFXURL(String gfxURL) {
		setParameter(new ParameterStringValue(VIRTUALSERVER_HOSTBUTTON_GFX_URL,
				gfxURL));
		return this;
	}

	/**
	 * Text used for the tooltip of the host button on client-side.
	 * 
	 * @param tooltip
	 *            the host button tooltip
	 * @return This command.
	 */
	public ServereditCommand setHostButtonTooltip(String tooltip) {
		setParameter(new ParameterStringValue(VIRTUALSERVER_HOSTBUTTON_TOOLTIP,
				tooltip));
		return this;
	}

	/**
	 * URL opened on click on the host button.
	 * 
	 * @param url
	 *            the host button URL
	 * @return This command.
	 */
	public ServereditCommand setHostButtonURL(String url) {
		setParameter(
				new ParameterStringValue(VIRTUALSERVER_HOSTBUTTON_URL, url));
		return this;
	}

	/**
	 * Host message of the virtual server.
	 * 
	 * @param message
	 *            the host message
	 * @return This command.
	 */
	public ServereditCommand setHostMessage(String message) {
		setParameter(
				new ParameterStringValue(VIRTUALSERVER_HOSTMESSAGE, message));
		return this;
	}

	/**
	 * Host message mode of the virtual server (see {@link ITS3Definitions}).
	 * 
	 * @param mode
	 *            the host message mode
	 * @return This command.
	 */
	public ServereditCommand setHostMessageMode(HostMessageMode mode) {
		setParameter(new ParameterIntegerValue(VIRTUALSERVER_HOSTMESSAGE_MODE,
				mode.getNumber()));
		return this;
	}

	/**
	 * CRC32 checksum of the virtual server icon.
	 * 
	 * @param iconID
	 *            the icon ID
	 * @return This command.
	 */
	public ServereditCommand setIconID(Integer iconID) {
		setParameter(new ParameterIntegerValue(VIRTUALSERVER_ICON_ID, iconID));
		return this;
	}

	/**
	 * Indicates whether the server logs events related to channels or not.
	 * 
	 * @param log
	 *            an integer indicating log for channel
	 * @return This command.
	 */
	public ServereditCommand setLogChannel(Integer log) {
		setParameter(new ParameterIntegerValue(VIRTUALSERVER_LOG_CHANNEL, log));
		return this;
	}

	/**
	 * Indicates whether the server logs events related to clients or not.
	 * 
	 * @param log
	 *            an integer indicating log for clients
	 * @return This command.
	 */
	public ServereditCommand setLogClient(Integer log) {
		setParameter(new ParameterIntegerValue(VIRTUALSERVER_LOG_CLIENT, log));
		return this;
	}

	/**
	 * Indicates whether the server logs events related to file transfers or
	 * not.
	 * 
	 * @param log
	 *            an integer indicating log for file transfer
	 * @return This command.
	 */
	public ServereditCommand setLogFileTransfer(Integer log) {
		setParameter(
				new ParameterIntegerValue(VIRTUALSERVER_LOG_FILETRANSFER, log));
		return this;
	}

	/**
	 * Indicates whether the server logs events related to permissions or not.
	 * 
	 * @param log
	 *            an integer indicating log for permissions
	 * @return This command.
	 */
	public ServereditCommand setLogPermission(Integer log) {
		setParameter(
				new ParameterIntegerValue(VIRTUALSERVER_LOG_PERMISSIONS, log));
		return this;
	}

	/**
	 * Indicates whether the server logs events related to ServerQuery clients
	 * or not.
	 * 
	 * @param log
	 *            an integer indicating log for server query clients
	 * @return This command.
	 */
	public ServereditCommand setLogQuery(Integer log) {
		setParameter(new ParameterIntegerValue(VIRTUALSERVER_LOG_QUERY, log));
		return this;
	}

	/**
	 * Indicates whether the server logs events related to server changes or
	 * not.
	 * 
	 * @param log
	 *            an integer indicating log for server
	 * @return This command.
	 */
	public ServereditCommand setLogServer(Integer log) {
		setParameter(new ParameterIntegerValue(VIRTUALSERVER_LOG_SERVER, log));
		return this;
	}

	/**
	 * Machine ID identifying the server instance associated with the virtual
	 * server in the database.
	 * 
	 * @param machineID
	 *            the machine ID
	 * @return This command.
	 */
	public ServereditCommand setMachineID(Integer machineID) {
		setParameter(
				new ParameterIntegerValue(VIRTUALSERVER_MACHINE_ID, machineID));
		return this;
	}

	/**
	 * Number of slots available on the virtual server.
	 * 
	 * @param maxNumber
	 *            the slot number
	 * @return This command.
	 */
	public ServereditCommand setMaxClients(int maxNumber) {
		setParameter(
				new ParameterIntegerValue(VIRTUALSERVER_MAXCLIENTS, maxNumber));
		return this;
	}

	/**
	 * Max bandwidth for outgoing file transfers on the virtual server
	 * (Bytes/s).
	 * 
	 * @param bytes
	 *            the bytes in seconds
	 * @return This command.
	 */
	public ServereditCommand setMaxDownloadTotalBandwidth(BigInteger bytes) {
		setParameter(new ParameterBigIntegerValue(
				VIRTUALSERVER_MAX_DOWNLOAD_TOTAL_BANDWIDTH, bytes));
		return this;
	}

	/**
	 * Max bandwidth for incoming file transfers on the virtual server
	 * (Bytes/s).
	 * 
	 * @param bytes
	 *            the bytes in seconds
	 * @return This command.
	 */
	public ServereditCommand setMaxUploadTotalBandwidth(BigInteger bytes) {
		setParameter(new ParameterBigIntegerValue(
				VIRTUALSERVER_MAX_UPLOAD_TOTAL_BANDWIDTH, bytes));
		return this;
	}

	/**
	 * Number of clients in the same channel needed to force silence.
	 * 
	 * @param count
	 *            the client count
	 * @return This command.
	 */
	public ServereditCommand setMinClientsInChannelBeforeForcedSilence(
			int count) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_MIN_CLIENTS_IN_CHANNEL_BEFORE_FORCED_SILENCE,
				count));
		return this;
	}

	/**
	 * Min client version required to connect.
	 * 
	 * @param version
	 *            the client version
	 * @return This command.
	 */
	public ServereditCommand setMinClientVersion(Integer version) {
		setParameter(new ParameterIntegerValue(VIRTUALSERVER_MIN_CLIENT_VERSION,
				version));
		return this;
	}

	/**
	 * Phonetic name of the virtual server.
	 * 
	 * @param phoneticName
	 *            the phonetic name
	 * @return This command.
	 */
	public ServereditCommand setNamePhonetic(String phoneticName) {
		setParameter(new ParameterStringValue(VIRTUALSERVER_NAME_PHONETIC,
				phoneticName));
		return this;
	}

	/**
	 * Minimum client identity security level required to connect to the virtual
	 * server.
	 * 
	 * @param level
	 *            the identity security level
	 * @return This command.
	 */
	public ServereditCommand setNeededIdentitySecurityLevel(Integer level) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_NEEDED_IDENTITY_SECURITY_LEVEL, level));
		return this;
	}

	/**
	 * Password of the virtual server.
	 * 
	 * @param password
	 *            a password
	 * @return This command.
	 */
	public ServereditCommand setPassword(String password) {
		setParameter(
				new ParameterStringValue(VIRTUALSERVER_PASSWORD, password));
		return this;
	}

	/**
	 * UDP port the virtual server is listening on.
	 * 
	 * @param port
	 *            the virtual server port
	 * @return This command.
	 */
	public ServereditCommand setPort(Integer port) {
		setParameter(new ParameterIntegerValue(VIRTUALSERVER_PORT, port));
		return this;
	}

	/**
	 * Client volume lowered automatically while a priority speaker is talking.
	 * 
	 * @param volume
	 *            the volume lowered
	 * @return This command.
	 */
	public ServereditCommand setPrioritySpeakerDimmModificator(int volume) {
		setParameter(new ParameterIntegerValue(
				VIRTUALSERVER_PRIORITY_SPEAKER_DIMM_MODIFICATOR, volume));
		return this;
	}

	/**
	 * Number of reserved slots available on the virtual server.
	 * 
	 * @param slots
	 *            the reserved slots
	 * @return This command.
	 */
	public ServereditCommand setReservedSlots(Integer slots) {
		setParameter(
				new ParameterIntegerValue(VIRTUALSERVER_RESERVED_SLOTS, slots));
		return this;
	}

	/**
	 * Upload quota for the virtual server (MByte).
	 * 
	 * @param mByte
	 *            the upload quota in MBytes
	 * @return This command.
	 */
	public ServereditCommand setUploadQuota(Integer mByte) {
		setParameter(
				new ParameterIntegerValue(VIRTUALSERVER_UPLOAD_QUOTA, mByte));
		return this;
	}

	/**
	 * Indicates whether the server appears in the global web server list or
	 * not.
	 * 
	 * @param weblist
	 *            an integer indicating web list enabled
	 * @return This command.
	 */
	public ServereditCommand setWeblistEnabled(Integer weblist) {
		setParameter(new ParameterIntegerValue(VIRTUALSERVER_WEBLIST_ENABLED,
				weblist));
		return this;
	}

	/**
	 * Welcome message of the virtual server.
	 * 
	 * @param message
	 *            the welcome message
	 * @return This command.
	 */
	public ServereditCommand setWelcomeMessage(String message) {
		setParameter(new ParameterStringValue(VIRTUALSERVER_WELCOMEMESSAGE,
				message));
		return this;
	}
}
