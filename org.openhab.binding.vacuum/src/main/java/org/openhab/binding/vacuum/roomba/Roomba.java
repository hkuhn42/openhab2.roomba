package org.openhab.binding.vacuum.roomba;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.ByteBuffer;

public class Roomba {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Roomba r = new Roomba();
		r.test();
	}

    public static final int PLAY    =  141;  // 1

	
	public void test() throws Exception {
	//	BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));
		  Socket clientSocket = new Socket("10.0.1.24", 9001);
		  System.out.println(clientSocket.isConnected());
		 
		  byte cmd[] = {(byte)135};
		  
		  clientSocket.getOutputStream().write(cmd);
		  clientSocket.getOutputStream().flush();
//		  outToServer.writeBytes("1411");
//		  char[] buff = new char[400];
//		  int length = 0;
//		  while(length >= 0) {
//			length =  inFromServer.read(buff); 
//			System.out.println(new String(buff, 0, length));
//		  } 
		  
		  clientSocket.close();
//		  inFromServer.close();
		  
	}
	
	
}
