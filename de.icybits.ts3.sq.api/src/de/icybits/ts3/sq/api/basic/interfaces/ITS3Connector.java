package de.icybits.ts3.sq.api.basic.interfaces;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;

/**
 * The ITS3Connector interface is the convention for the TS3Client.
 *
 * @author Alias: Iceac Sarutobi
 */
public interface ITS3Connector {

	/**
	 * Close the TS3Connectors connection.
	 * 
	 * @throws IOException
	 *           If an I/O error occurs when closing this connection
	 */
	public void close() throws IOException;

	/**
	 * Connect the TS3Connector with the server query at the given address on
	 * given port.
	 * 
	 * @param address
	 *          The Internet address of the TS3 server query
	 * @param port
	 *          The port of the TS3 server query
	 * @throws IOException
	 *           If an I/O error occurs when connecting to the server
	 */
	public void connect(InetAddress address, int port) throws IOException;

	/**
	 * Returns <code>true</code> if there is content to receive. If hasInput()
	 * return <code>true</code> receive should not return <code>null</code>,
	 * except resetInput() is called before.
	 * 
	 * @return <code>true</code> if there is content to receive
	 */
	public boolean hasInput() throws IOException;

	/**
	 * Receive a String from the server if the server input contains a \n the
	 * string is only read to that and then return the line. Maybe more content is
	 * on the {@link InputStream} left. This method should be thread save.
	 * 
	 * @return The line from the {@link InputStream} as {@link String} or
	 *         <code>null</code> if there is nothing to read.
	 */
	public String receive() throws IOException;

	/**
	 * Deletes remaining content.
	 * 
	 * @return the remaining content.
	 */
	public String resetInput() throws IOException;

	/**
	 * Send a string to the telnet server.<br>
	 * If the {@link String} does not end with \n a \n is added this method should
	 * be thread save.
	 * 
	 * @param string
	 *          a string to send to the server
	 */
	public void send(String string) throws IOException;
}
