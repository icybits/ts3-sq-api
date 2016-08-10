package de.icybits.ts3.sq.api;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.icybits.ts3.sq.api.basic.Response;
import de.icybits.ts3.sq.api.basic.interfaces.IResponse;
import de.icybits.ts3.sq.api.basic.interfaces.ITS3Connector;
import de.icybits.ts3.sq.api.client.TS3Client;
import de.icybits.ts3.sq.api.commands.BindinglistCommand;
import de.icybits.ts3.sq.api.commands.HelpCommand;
import de.icybits.ts3.sq.api.commands.HostinfoCommand;
import de.icybits.ts3.sq.api.commands.InstanceeditCommand;
import de.icybits.ts3.sq.api.commands.InstanceinfoCommand;
import de.icybits.ts3.sq.api.commands.LoginCommand;
import de.icybits.ts3.sq.api.commands.LogoutCommand;
import de.icybits.ts3.sq.api.commands.QuitCommand;
import de.icybits.ts3.sq.api.commands.ServeridgetbyportCommand;
import de.icybits.ts3.sq.api.commands.ServerlistCommand;
import de.icybits.ts3.sq.api.commands.UseCommand;
import de.icybits.ts3.sq.api.commands.VersionCommand;
import de.icybits.ts3.sq.api.exception.ErrorException;
import de.icybits.ts3.sq.api.exception.IllegalCommandException;
import de.icybits.ts3.sq.api.exception.ParseResponseException;

/**
 * @author Alias: Iceac Sarutobi
 */
public class CommandTests {

	private static final Logger LOGGER = Logger.getLogger(CommandTests.class.getName());
	TS3Client client = null;
	ITS3Connector telnetClient = null;

	@Before
	public void setUp() throws Exception {
//		telnetClient = new JUnitTestConnector();
		client = new TS3Client(telnetClient, "www.test-host.de", 10011);
	}

	@After
	public void tearDown() throws Exception {
		if (client != null) {
			client.interrupt();
		}
		if (telnetClient != null) {
			telnetClient.close();
		}
	}

	@Test
	public void testCommands() throws IOException, ErrorException, ParseResponseException, IllegalCommandException {
		IResponse helpResponse = client.execute(new HelpCommand());
		if (helpResponse == null) {
			fail("no response");
		} else {
			System.out.println("HelpCommand executed");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			LOGGER.log(Level.SEVERE, "JUnit interrupted?", e);
		}
		IResponse loginResponse = client.execute(new LoginCommand("serveradmin", ""));
		if (loginResponse != null) {
			fail("response on login");
		} else {
			System.out.println("LoginCommand executed");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			LOGGER.log(Level.SEVERE, "JUnit interrupted?", e);
		}
		IResponse versionResponse = client.execute(new VersionCommand());
		if (versionResponse instanceof Response) {
			Response entityResponse = (Response) versionResponse;
			System.out.println(entityResponse.getResponse());
		} else {
			fail("wrong response or no response");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			LOGGER.log(Level.SEVERE, "JUnit interrupted?", e);
		}
		IResponse hostinfoCommand = client.execute(new HostinfoCommand());
		if (hostinfoCommand instanceof Response) {
			Response entityResponse = (Response) hostinfoCommand;
			System.out.println(entityResponse.getResponse());
		} else {
			fail("wrong response or no response");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			LOGGER.log(Level.SEVERE, "JUnit interrupted?", e);
		}
		IResponse instanceinfoCommand = client.execute(new InstanceinfoCommand());
		if (instanceinfoCommand instanceof Response) {
			Response entityResponse = (Response) instanceinfoCommand;
			System.out.println(entityResponse.getResponse());
		} else {
			fail("wrong response or no response");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			LOGGER.log(Level.SEVERE, "JUnit interrupted?", e);
		}
		IResponse useCommand = client.execute(new UseCommand().setSID(1));
		if (useCommand != null) {
			fail("response on use");
		} else {
			System.out.println("UseCommand executed");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			LOGGER.log(Level.SEVERE, "JUnit interrupted?", e);
		}
		IResponse instanceeditCommand = client.execute(new InstanceeditCommand().setServerqueryFloodCommands(30));
		if (instanceeditCommand != null) {
			fail("response on login");
		} else {
			System.out.println("InstanceeditCommand executed");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			LOGGER.log(Level.SEVERE, "JUnit interrupted?", e);
		}
		IResponse bindinglistCommand = client.execute(new BindinglistCommand());
		if (bindinglistCommand instanceof Response) {
			Response entityResponse = (Response) bindinglistCommand;
			System.out.println(entityResponse.getResponse());
		} else {
			fail("wrong response or no response");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			LOGGER.log(Level.SEVERE, "JUnit interrupted?", e);
		}
		IResponse serverlistCommand = client.execute(new ServerlistCommand().toggleShort());
		if (serverlistCommand instanceof Response) {
			Response entityResponse = (Response) serverlistCommand;
			System.out.println(entityResponse.getResponse());
		} else {
			fail("wrong response or no response");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			LOGGER.log(Level.SEVERE, "JUnit interrupted?", e);
		}
		IResponse serveridgetbyportCommand = client.execute(new ServeridgetbyportCommand(9987));
		if (serveridgetbyportCommand instanceof Response) {
			Response entityResponse = (Response) serveridgetbyportCommand;
			System.out.println(entityResponse.getResponse());
		} else {
			fail("wrong response or no response");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			LOGGER.log(Level.SEVERE, "JUnit interrupted?", e);
		}
		IResponse logoutResponse = client.execute(new LogoutCommand());
		if (logoutResponse != null) {
			fail("response on logout");
		} else {
			System.out.println("LogoutCommand executed");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			LOGGER.log(Level.SEVERE, "JUnit interrupted?", e);
		}
		IResponse quitResponse = client.execute(new QuitCommand());
		if (quitResponse != null) {
			fail("response on quit");
		} else {
			System.out.println("QuitCommand executed");
		}
	}
}
