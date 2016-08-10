package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Parameter;
import de.icybits.ts3.sq.api.basic.parameter.ParameterStringValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;
import de.icybits.ts3.sq.api.properties.ChannelProperties;
/**
 * create a channel
 * 
 * @author Iceac
 * @author Saali
 */
public class ChannelcreateCommand extends Command 
		implements 
			ITS3CommandNames,
			ITS3ParameterNames{

	
	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.I_CHANNEL_MIN_DEPTH,
			Permissions.I_CHANNEL_MAX_DEPTH,
			Permissions.B_CHANNEL_CREATE_PERMANENT,
			Permissions.B_CHANNEL_CREATE_CHILD,
			Permissions.B_CHANNEL_CREATE_SEMI_PERMANENT,
			Permissions.B_CHANNEL_CREATE_TEMPORARY,
			Permissions.B_CHANNEL_CREATE_WITH_TOPIC,
			Permissions.B_CHANNEL_CREATE_WITH_DESCRIPTION,
			Permissions.B_CHANNEL_CREATE_WITH_PASSWORD,
			Permissions.B_CHANNEL_CREATE_MODIFY_WITH_CODEC_SPEEX8,
			Permissions.B_CHANNEL_CREATE_MODIFY_WITH_CODEC_SPEEX16,
			Permissions.B_CHANNEL_CREATE_MODIFY_WITH_CODEC_SPEEX32,
			Permissions.B_CHANNEL_CREATE_MODIFY_WITH_CODEC_CELTMONO48,
			Permissions.I_CHANNEL_CREATE_MODIFY_WITH_CODEC_MAXQUALITY,
			Permissions.I_CHANNEL_CREATE_MODIFY_WITH_CODEC_LATENCY_FACTOR_MIN,
			Permissions.B_CHANNEL_CREATE_WITH_MAXCLIENTS,
			Permissions.B_CHANNEL_CREATE_WITH_MAXFAMILYCLIENTS,
			Permissions.B_CHANNEL_CREATE_WITH_SORTORDER,
			Permissions.B_CHANNEL_CREATE_WITH_DEFAULT,
			Permissions.B_CHANNEL_CREATE_WITH_NEEDED_TALK_POWER
	};
	public ChannelcreateCommand(String channelname) {
		super(COMMAND_CHANNELCREATE);
		setParameter(new ParameterStringValue(CHANNEL_NAME, channelname));
	}
	
	public <K> ChannelcreateCommand setProperty(ChannelProperties<K> property, K value){
		setParameter(new Parameter<K>(property.getName(), value));
		return this;
	}
	
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}
}