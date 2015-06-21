/**
 * 
 */
package org.openhab.binding.vacuum.roomba;

import java.io.IOException;

/**
 * @author hkuhn
 *
 */
public class CleanCommand {
	
	private static byte CLEAN[] = {(byte)135};
	
	public void execute(TCPConnection connection) throws IOException {
		connection.sendCommand(CLEAN);
	}
}