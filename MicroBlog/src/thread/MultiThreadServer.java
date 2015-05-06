package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer {
	public static final int PORT=3021;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				ServerSocket serverSocket = new ServerSocket(PORT);
				int count=1;
				while(true){
				Socket clientSocket = serverSocket.accept();
				BufferedReader in =
							new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				Thread new_thread = new Thread(new ThreadHandler(clientSocket,count));
				new_thread.start();

				}
			} 
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
