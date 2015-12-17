package de.icybits.ts3.sq.api.client.event;

import java.util.List;

import de.icybits.ts3.sq.api.basic.interfaces.IParameter;
import de.icybits.ts3.sq.api.basic.parameter.ParameterBooleanValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValueList;
import de.icybits.ts3.sq.api.basic.parameter.ParameterStringValue;

/**
 * This class extends NotifyEvent and implements ITS3ClientProperty. An instance
 * of this class is an ClientEnterView event fired by the "TS3 Server Query".
 *
 * @author iceac_000
 */
public class NotifyClientEnterView extends NotifyEvent {

	/**
	 * Create a new NotifyClientEnterView from the event string
	 * 
	 * @param eventString
	 *          the event string
	 */
	public NotifyClientEnterView(String eventString) {
		super(NOTIFY_CLIENT_ENTER_VIEW);
		String[] split = eventString.split(" ");
		for (String parameterString : split) {
			if (parameterString.contains("=")) {
				IParameter<?> parameter = createParameter(parameterString);
				if (parameter != null) {
					addParameter(parameter);
				}
			}
		}
	}

	/**
	 * Create a parameter from the parameter string
	 * 
	 * @param parameter
	 *          the parameter string
	 * @return the corresponding Parameter
	 */
	private IParameter<?> createParameter(String parameter) {
		int separatorPos = parameter.indexOf("=");
		String parameterName = parameter.substring(0, separatorPos);
		String parameterValue = parameter.substring(separatorPos + 1);
		switch (parameterName) {
		case CFID:
			return new ParameterIntegerValue(CFID, parameterValue);
		case CTID:
			return new ParameterIntegerValue(CTID, parameterValue);
		case REASONID:
			return new ParameterIntegerValue(REASONID, parameterValue);
		case CLID:
			return new ParameterIntegerValue(CLID, parameterValue);
		case CLIENT_UNIQUE_IDENTIFIER:
			return new ParameterStringValue(CLIENT_UNIQUE_IDENTIFIER, parameterValue);
		case CLIENT_NICKNAME:
			return new ParameterStringValue(CLIENT_NICKNAME, parameterValue);
		case CLIENT_INPUT_MUTED:
			return new ParameterBooleanValue(CLIENT_INPUT_MUTED, parameterValue);
		case CLIENT_OUTPUT_MUTED:
			return new ParameterBooleanValue(CLIENT_OUTPUT_MUTED, parameterValue);
		case CLIENT_OUTPUTONLY_MUTED:
			return new ParameterBooleanValue(CLIENT_OUTPUT_MUTED, parameterValue);
		case CLIENT_INPUT_HARDWARE:
			return new ParameterBooleanValue(CLIENT_INPUT_HARDWARE, parameterValue);
		case CLIENT_OUTPUT_HARDWARE:
			return new ParameterBooleanValue(CLIENT_OUTPUT_HARDWARE, parameterValue);
		case CLIENT_META_DATA:
			return new ParameterStringValue(CLIENT_META_DATA, parameterValue);
		case CLIENT_IS_RECORDING:
			return new ParameterBooleanValue(CLIENT_IS_RECORDING, parameterValue);
		case CLIENT_DATABASE_ID:
			return new ParameterIntegerValue(CLIENT_DATABASE_ID, parameterValue);
		case CLIENT_CHANNEL_GROUP_ID:
			return new ParameterIntegerValue(CLIENT_CHANNEL_GROUP_ID, parameterValue);
		case CLIENT_SERVERGROUPS:
			return new ParameterIntegerValueList(CLIENT_SERVERGROUPS, parameterValue, ",");
		case CLIENT_AWAY:
			return new ParameterBooleanValue(CLIENT_AWAY, parameterValue);
		case CLIENT_AWAY_MESSAGE:
			return new ParameterStringValue(CLIENT_AWAY_MESSAGE, parameterValue);
		case CLIENT_TYPE:
			return new ParameterBooleanValue(CLIENT_TYPE, parameterValue);
		case CLIENT_FLAG_AVATAR:
			return new ParameterBooleanValue(CLIENT_FLAG_AVATAR, parameterValue);
		case CLIENT_TALK_POWER:
			return new ParameterIntegerValue(CLIENT_TALK_POWER, parameterValue);
		case CLIENT_TALK_REQUEST:
			return new ParameterBooleanValue(CLIENT_TALK_REQUEST, parameterValue);
		case CLIENT_TALK_REQUEST_MSG:
			return new ParameterStringValue(CLIENT_TALK_REQUEST_MSG, parameterValue);
		case CLIENT_DESCRIPTION:
			return new ParameterStringValue(CLIENT_DESCRIPTION, parameterValue);
		case CLIENT_IS_TALKER:
			return new ParameterBooleanValue(CLIENT_IS_TALKER, parameterValue);
		case CLIENT_IS_PRIORITY_SPEAKER:
			return new ParameterBooleanValue(CLIENT_IS_PRIORITY_SPEAKER, parameterValue);
		case CLIENT_UNREAD_MESSAGES:
			return new ParameterIntegerValue(CLIENT_UNREAD_MESSAGES, parameterValue);
		case CLIENT_NICKNAME_PHONETIC:
			return new ParameterStringValue(CLIENT_NICKNAME_PHONETIC, parameterValue);
		case CLIENT_NEEDED_SERVERQUERY_VIEW_POWER:
			return new ParameterIntegerValue(CLIENT_NEEDED_SERVERQUERY_VIEW_POWER, parameterValue);
		case CLIENT_ICON_ID:
			return new ParameterIntegerValue(CLIENT_ICON_ID, parameterValue);
		case CLIENT_IS_CHANNEL_COMMANDER:
			return new ParameterBooleanValue(CLIENT_IS_CHANNEL_COMMANDER, parameterValue);
		case CLIENT_COUNTRY:
			return new ParameterStringValue(CLIENT_COUNTRY, parameterValue);
		case CLIENT_CHANNEL_GROUP_INHERITED_CHANNEL_ID:
			return new ParameterIntegerValue(CLIENT_CHANNEL_GROUP_INHERITED_CHANNEL_ID, parameterValue);
		case CLIENT_BADGES:
			return new ParameterStringValue(CLIENT_BADGES, parameterValue);
		default:
			return null;
		}
	}

	/**
	 * @return the CFID
	 */
	public int getCFID() {
		return getIntegerValue(CFID);
	}

	/**
	 * @return the client id
	 */
	public int getCLID() {
		return getIntegerValue(CLID);
	}

	/**
	 * @return Indicates whether the client is away or not
	 */
	public boolean getClientAway() {
		return getBooleanValue(CLIENT_AWAY);
	}

	/**
	 * @return The away message of the client
	 */
	public String getClientAwayMessage() {
		return getStringValue(CLIENT_AWAY_MESSAGE);
	}

	/**
	 * @return The client badges
	 */
	public String getClientBadges() {
		return getStringValue(CLIENT_BADGES);
	}

	/**
	 * @return The current channel group ID of the client
	 */
	public int getClientChannelGroupID() {
		return getIntegerValue(CLIENT_CHANNEL_GROUP_ID);
	}

	/**
	 * @return The channel group inherited channel ID of the client
	 */
	public int getClientChannelGroupInheritedChannelID() {
		return getIntegerValue(CLIENT_CHANNEL_GROUP_INHERITED_CHANNEL_ID);
	}

	/**
	 * @return The country identifier of the client (i.e. DE)
	 */
	public String getClientCountry() {
		return getStringValue(CLIENT_COUNTRY);
	}

	/**
	 * @return The database ID of the client
	 */
	public int getClientDatabaseID() {
		return getIntegerValue(CLIENT_DATABASE_ID);
	}

	/**
	 * @return The brief description of the client
	 */
	public String getClientDescription() {
		return getStringValue(CLIENT_DESCRIPTION);
	}

	/**
	 * @return Indicates whether the client has set an avatar or not
	 */
	public int getClientFlagAvatar() {
		return getIntegerValue(CLIENT_FLAG_AVATAR);
	}

	/**
	 * @return CRC32 checksum of the client icon
	 */
	public int getClientIconID() {
		return getIntegerValue(CLIENT_ICON_ID);
	}

	/**
	 * @return Indicates whether the client has enabled their capture device or
	 *         not
	 */
	public boolean getClientInputHardware() {
		return getBooleanValue(CLIENT_INPUT_HARDWARE);
	}

	/**
	 * @return Indicates whether the client has their microphone muted or not
	 */
	public boolean getClientInputMuted() {
		return getBooleanValue(CLIENT_INPUT_MUTED);
	}

	/**
	 * @return Indicates whether the client is a channel commander or not
	 */
	public boolean getClientIsChannelCommander() {
		return getBooleanValue(CLIENT_IS_CHANNEL_COMMANDER);
	}

	/**
	 * @return Indicates whether the client is a priority speaker or not
	 */
	public boolean getClientIsPrioritySpeaker() {
		return getBooleanValue(CLIENT_IS_PRIORITY_SPEAKER);
	}

	/**
	 * @return Indicates whether the client is recording or not
	 */
	public boolean getClientIsRecording() {
		return getBooleanValue(CLIENT_IS_RECORDING);
	}

	/**
	 * @return Indicates whether the client is able to talk or not
	 */
	public boolean getClientIsTalker() {
		return getBooleanValue(CLIENT_IS_TALKER);
	}

	/**
	 * @return The client meta data
	 */
	public String getClientMetaData() {
		return getStringValue(CLIENT_META_DATA);
	}

	/**
	 * @return The clients current ServerQuery view power
	 */
	public int getClientNeededServerQueryViewPower() {
		return getIntegerValue(CLIENT_NEEDED_SERVERQUERY_VIEW_POWER);
	}

	/**
	 * @return The nickname of the client
	 */
	public String getClientNickname() {
		return getStringValue(CLIENT_NICKNAME);
	}

	/**
	 * @return Phonetic name of the client
	 */
	public String getClientNicknamePhonetic() {
		return getStringValue(CLIENT_NICKNAME_PHONETIC);
	}

	/**
	 * @return Indicates whether the client has enabled their playback device or
	 *         not
	 */
	public boolean getClientOutputHardware() {
		return getBooleanValue(CLIENT_OUTPUT_HARDWARE);
	}

	/**
	 * @return Indicates whether the client has their speakers muted or not
	 */
	public boolean getClientOutputMuted() {
		return getBooleanValue(CLIENT_OUTPUT_MUTED);
	}

	/**
	 * @return Indicates whether the client has only their speakers muted or not
	 */
	public boolean getClientOutputOnlyMuted() {
		return getBooleanValue(CLIENT_OUTPUTONLY_MUTED);
	}

	/**
	 * @return Current server group IDs of the client
	 */
	public List<Integer> getClientServerGroups() {
		return getIntegerValueSet(CLIENT_SERVERGROUPS);
	}

	/**
	 * @return The clients current talk power
	 */
	public int getClientTalkPower() {
		return getIntegerValue(CLIENT_TALK_POWER);
	}

	/**
	 * @return Indicates whether the client is requesting talk power or not
	 */
	public boolean getClientTalkRequest() {
		return getBooleanValue(CLIENT_TALK_REQUEST);
	}

	/**
	 * @return The clients current talk power request message
	 */
	public String getClientTalkRequestMSG() {
		return getStringValue(CLIENT_TALK_REQUEST_MSG);
	}

	/**
	 * @return Indicates whether the client is a ServerQuery client or not
	 */
	public boolean getClientType() {
		return getBooleanValue(CLIENT_TYPE);
	}

	/**
	 * @return The unique ID of the client
	 */
	public String getClientUniqueIdentifier() {
		return getStringValue(CLIENT_UNIQUE_IDENTIFIER);
	}

	/**
	 * @return Number of unread offline messages in this clients inbox
	 */
	public int getClientUnreadMessages() {
		return getIntegerValue(CLIENT_UNREAD_MESSAGES);
	}

	/**
	 * @return the CTID
	 */
	public int getCTID() {
		return getIntegerValue(CTID);
	}

	/**
	 * @return the reason id
	 */
	public int getReasonID() {
		return getIntegerValue(REASONID);
	}
}
