/**
 * 
 */
package org.openhab.binding.vacuum.roomba;

import java.io.IOException;
import java.net.Socket;

/**
 * @author hkuhn
 *
 */
public class TCPConnection {

	private String ipaddress;
	
	public TCPConnection(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	
	public byte[] sendCommand(byte[] command) throws IOException {
		Socket clientSocket = null;
		try {
			clientSocket = new Socket(ipaddress, 9001);

			clientSocket.getOutputStream().write(command);
			clientSocket.getOutputStream().flush();

			return new byte[0];
		} 
		finally {
			if(clientSocket != null) {
				clientSocket.close();
			}
		}
	}

}