/**
 * 
 */
package org.openhab.binding.vacuum.roomba;

import java.io.IOException;

/**
 * @author hkuhn
 *
 */
public class DockCommand {
	
	private static byte DOCK[] = {(byte)135};
	
	public void execute(TCPConnection connection) throws IOException {
		connection.sendCommand(DOCK);
	}
}