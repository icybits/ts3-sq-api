package de.icybits.ts3.sq.api.interfaces;

/**
 * The following enumerations can be used to change the behavior of various
 * ServerQuery commands:
 *
 * @author Alias: Iceac Sarutobi
 */
public interface ITS3Definitions {

	/**
	 * <table border="1">
	 * <tr>
	 * <th>name</th>
	 * <th>number</th>
	 * <th>description</th>
	 * </tr>
	 * <tr>
	 * <td>CODEC_SPEEX_NARROWBAND</td>
	 * <td>0</td>
	 * <td>speex narrowband (mono, 16bit, 8kHz)</td>
	 * </tr>
	 * <tr>
	 * <td>CODEC_SPEEX_WIDEBAND</td>
	 * <td>1</td>
	 * <td>speex wideband (mono, 16bit, 16kHz)</td>
	 * </tr>
	 * <tr>
	 * <td>CODEC_SPEEX_ULTRAWIDEBAND</td>
	 * <td>2</td>
	 * <td>speex ultra-wideband (mono, 16bit, 32kHz)</td>
	 * </tr>
	 * <tr>
	 * <td>CODEC_CELT_MONO</td>
	 * <td>3</td>
	 * <td>celt mono (mono, 16bit, 48kHz)</td>
	 * </tr>
	 * </table>
	 * 
	 * @author Alias: Iceac Sarutobi
	 */
	public enum Codec {
		CODEC_CELT_MONO(3), CODEC_SPEEX_NARROWBAND(0), CODEC_SPEEX_ULTRAWIDEBAND(2), CODEC_SPEEX_WIDEBAND(1);

		private final int number;

		private Codec(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	};

	/**
	 * <table border="1">
	 * <tr>
	 * <th>name</th>
	 * <th>number</th>
	 * <th>description</th>
	 * </tr>
	 * <tr>
	 * <td>CODEC_CRYPT_INDIVIDUAL</td>
	 * <td>0</td>
	 * <td>configure per channel</td>
	 * </tr>
	 * <tr>
	 * <td>CODEC_CRYPT_DISABLED</td>
	 * <td>1</td>
	 * <td>globally disabled</td>
	 * </tr>
	 * <tr>
	 * <td>CODEC_CRYPT_ENABLED</td>
	 * <td>2</td>
	 * <td>globally enabled</td>
	 * </tr>
	 * </table>
	 * 
	 * @author Alias: Iceac Sarutobi
	 */
	public enum CodecEncryptionMode {
		CODEC_CRYPT_DISABLED(1), CODEC_CRYPT_ENABLED(2), CODEC_CRYPT_INDIVIDUAL(0);

		private final int number;

		private CodecEncryptionMode(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	};

	/**
	 * <table border="1">
	 * <tr>
	 * <th>name</th>
	 * <th>number</th>
	 * <th>description</th>
	 * </tr>
	 * <tr>
	 * <td>HostMessageMode_NOADJUST</td>
	 * <td>0</td>
	 * <td>do not adjust</td>
	 * </tr>
	 * <tr>
	 * <td>HostMessageMode_IGNOREASPECT</td>
	 * <td>1</td>
	 * <td>adjust but ignore aspect ratio (like TeamSpeak 2)</td>
	 * </tr>
	 * <tr>
	 * <td>HostMessageMode_KEEPASPECT</td>
	 * <td>2</td>
	 * <td>adjust and keep aspect ratio</td>
	 * </tr>
	 * </table>
	 * 
	 * @author Alias: Iceac Sarutobi
	 */
	public enum HostBannerMode {
		HostMessageMode_IGNOREASPECT(1), HostMessageMode_KEEPASPECT(2), HostMessageMode_NOADJUST(0);

		private final int number;

		private HostBannerMode(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	};

	/**
	 * <table border="1">
	 * <tr>
	 * <th>name</th>
	 * <th>number</th>
	 * <th>description</th>
	 * </tr>
	 * <tr>
	 * <td>HostMessageMode_LOG</td>
	 * <td>1</td>
	 * <td>display message in chatlog</td>
	 * </tr>
	 * <tr>
	 * <td>HostMessageMode_MODAL</td>
	 * <td>2</td>
	 * <td>display message in modal dialog</td>
	 * </tr>
	 * <tr>
	 * <td>HostMessageMode_MODALQUIT</td>
	 * <td>3</td>
	 * <td>display message in modal dialog and close connection</td>
	 * </tr>
	 * </table>
	 * 
	 * @author Alias: Iceac Sarutobi
	 */
	public enum HostMessageMode {
		HostMessageMode_LOG(1), HostMessageMode_MODAL(2), HostMessageMode_MODALQUIT(3);

		private final int number;

		private HostMessageMode(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	};

	/**
	 * <table border="1">
	 * <tr>
	 * <th>name</th>
	 * <th>number</th>
	 * <th>description</th>
	 * </tr>
	 * <tr>
	 * <td>LogLevel_ERROR</td>
	 * <td>1</td>
	 * <td>everything that is really bad</td>
	 * </tr>
	 * <tr>
	 * <td>LogLevel_WARNING</td>
	 * <td>2</td>
	 * <td>everything that might be bad</td>
	 * </tr>
	 * <tr>
	 * <td>LogLevel_DEBUG</td>
	 * <td>3</td>
	 * <td>output that might help find a problem</td>
	 * </tr>
	 * <tr>
	 * <td>LogLevel_INFO</td>
	 * <td>4</td>
	 * <td>informational output</td>
	 * </tr>
	 * </table>
	 * 
	 * @author Alias: Iceac Sarutobi
	 */
	public enum LogLevel {
		LogLevel_DEBUG(3), LogLevel_ERROR(1), LogLevel_INFO(4), LogLevel_WARNING(2);

		private final int number;

		private LogLevel(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	};

	/**
	 * <table border="1">
	 * <tr>
	 * <th>name</th>
	 * <th>number</th>
	 * <th>description</th>
	 * </tr>
	 * <tr>
	 * <td>PermGroupDBTypeTemplate</td>
	 * <td>0</td>
	 * <td>template group (used for new virtual servers)</td>
	 * </tr>
	 * <tr>
	 * <td>PermGroupDBTypeRegular</td>
	 * <td>1</td>
	 * <td>regular group (used for regular clients)</td>
	 * </tr>
	 * <tr>
	 * <td>PermGroupDBTypeQuery</td>
	 * <td>2</td>
	 * <td>global query group (used for ServerQuery clients)</td>
	 * </tr>
	 * </table>
	 * 
	 * @author Alias: Iceac Sarutobi
	 */
	public enum PermissionGroupDatabaseTypes {
		PermGroupDBTypeQuery(2), PermGroupDBTypeRegular(1), PermGroupDBTypeTemplate(0);

		private final int number;

		private PermissionGroupDatabaseTypes(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	};

	/**
	 * <table border="1">
	 * <tr>
	 * <th>name</th>
	 * <th>number</th>
	 * <th>description</th>
	 * </tr>
	 * <tr>
	 * <td>PermGroupTypeServerGroup</td>
	 * <td>0</td>
	 * <td>server group permission</td>
	 * </tr>
	 * <tr>
	 * <td>PermGroupTypeGlobalClient</td>
	 * <td>1</td>
	 * <td>client specific permission</td>
	 * </tr>
	 * <tr>
	 * <td>PermGroupTypeChannel</td>
	 * <td>2</td>
	 * <td>channel specific permission</td>
	 * </tr>
	 * <tr>
	 * <td>PermGroupTypeChannelGroup</td>
	 * <td>3</td>
	 * <td>channel group permission</td>
	 * </tr>
	 * <tr>
	 * <td>PermGroupTypeChannelClient</td>
	 * <td>4</td>
	 * <td>channel-client specific permission</td>
	 * </tr>
	 * </table>
	 * 
	 * @author Alias: Iceac Sarutobi
	 */
	public enum PermissionGroupTypes {
		PermGroupTypeChannel(2), PermGroupTypeChannelClient(4), PermGroupTypeChannelGroup(3), PermGroupTypeGlobalClient(
				1), PermGroupTypeServerGroup(0);

		private final int number;

		private PermissionGroupTypes(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	};

	/**
	 * <table border="1">
	 * <tr>
	 * <th>name</th>
	 * <th>number</th>
	 * <th>description</th>
	 * </tr>
	 * <tr>
	 * <td>REASON_KICK_CHANNEL</td>
	 * <td>4</td>
	 * <td>kick client from channel</td>
	 * </tr>
	 * <tr>
	 * <td>REASON_KICK_SERVER</td>
	 * <td>5</td>
	 * <td>kick client from server</td>
	 * </tr>
	 * </table>
	 * 
	 * @author Alias: Iceac Sarutobi
	 */
	public enum ReasonIdentifier {
		REASON_KICK_CHANNEL(4), REASON_KICK_SERVER(5);

		private final int number;

		private ReasonIdentifier(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	};

	/**
	 * <table border="1">
	 * <tr>
	 * <th>name</th>
	 * <th>number</th>
	 * <th>description</th>
	 * </tr>
	 * <tr>
	 * <td>TextMessageTarget_CLIENT</td>
	 * <td>1</td>
	 * <td>target is a client</td>
	 * </tr>
	 * <tr>
	 * <td>TextMessageTarget_CHANNEL</td>
	 * <td>2</td>
	 * <td>target is a channel</td>
	 * </tr>
	 * <tr>
	 * <td>TextMessageTarget_SERVER</td>
	 * <td>3</td>
	 * <td>target is a virtual server</td>
	 * </tr>
	 * </table>
	 * 
	 * @author Alias: Iceac Sarutobi
	 */
	public enum TextMessageTargetMode {
		TextMessageTarget_CHANNEL(2), TextMessageTarget_CLIENT(1), TextMessageTarget_SERVER(3);

		private final int number;

		private TextMessageTargetMode(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	};

	/**
	 * <table border="1">
	 * <tr>
	 * <th>name</th>
	 * <th>number</th>
	 * <th>description</th>
	 * </tr>
	 * <tr>
	 * <td>TokenServerGroup</td>
	 * <td>0</td>
	 * <td>server group token (id1={groupID} id2=0)</td>
	 * </tr>
	 * <tr>
	 * <td>TokenChannelGroup</td>
	 * <td>1</td>
	 * <td>channel group token (id1={groupID} id2={channelID})</td>
	 * </tr>
	 * </table>
	 * 
	 * @author Alias: Iceac Sarutobi
	 */
	public enum TokenType {
		TokenChannelGroup(1), TokenServerGroup(0);

		private final int number;

		private TokenType(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	};
}
