package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.Parameter;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ParameterNames;
import de.icybits.ts3.sq.api.properties.ChannelProperties;
/**
 * change channel properties
 * 
 * @author Alias: Iceac Sarutobi
 * @author Saali
 */
public class ChanneleditCommand extends Command 
		implements 
			ITS3CommandNames,
			ITS3ParameterNames {
	private static final Permissions[] PERMISSIONS = new Permissions[] {
			Permissions.I_CHANNEL_MIN_DEPTH,
			Permissions.I_CHANNEL_MAX_DEPTH,
			Permissions.B_CHANNEL_MODIFY_PARENT,
			Permissions.B_CHANNEL_MODIFY_MAKE_DEFAULT,
			Permissions.B_CHANNEL_MODIFY_MAKE_PERMANENT,
			Permissions.B_CHANNEL_MODIFY_MAKE_SEMI_PERMANENT,
			Permissions.B_CHANNEL_MODIFY_MAKE_TEMPORARY,
			Permissions.B_CHANNEL_MODIFY_NAME,
			Permissions.B_CHANNEL_MODIFY_TOPIC,
			Permissions.B_CHANNEL_MODIFY_DESCRIPTION,
			Permissions.B_CHANNEL_MODIFY_PASSWORD,
			Permissions.B_CHANNEL_MODIFY_CODEC,
			Permissions.B_CHANNEL_CREATE_MODIFY_WITH_CODEC_SPEEX8,
			Permissions.B_CHANNEL_CREATE_MODIFY_WITH_CODEC_SPEEX16,
			Permissions.B_CHANNEL_CREATE_MODIFY_WITH_CODEC_SPEEX32,
			Permissions.B_CHANNEL_CREATE_MODIFY_WITH_CODEC_CELTMONO48,
			Permissions.B_CHANNEL_MODIFY_CODEC_QUALITY,
			Permissions.I_CHANNEL_CREATE_MODIFY_WITH_CODEC_MAXQUALITY,
			Permissions.B_CHANNEL_MODIFY_CODEC_LATENCY_FACTOR,
			Permissions.B_CHANNEL_MODIFY_MAKE_CODEC_ENCRYPTED,
			Permissions.B_CHANNEL_MODIFY_MAXCLIENTS,
			Permissions.B_CHANNEL_MODIFY_MAXFAMILYCLIENTS,
			Permissions.B_CHANNEL_MODIFY_SORTORDER,
			Permissions.B_CHANNEL_MODIFY_NEEDED_TALK_POWER,
			Permissions.I_CHANNEL_MODIFY_POWER,
			Permissions.I_CHANNEL_NEEDED_MODIFY_POWER
	};
	
	public ChanneleditCommand() {
		super(COMMAND_CHANNELEDIT);
	}
	
	public <K> ChanneleditCommand editProperty(ChannelProperties<K> propertyname, K value){  //TODO ChannelProperty<K>, K value
		setParameter(new Parameter<K>(propertyname.getName(), value));
		return this;
	}
	
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}
}