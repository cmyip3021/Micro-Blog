package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadHandler implements Runnable{
	
	private Socket sock;
	private int count;
	
	public ThreadHandler(Socket sock, int count){
		this.sock=sock;
		this.count=count;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			PrintWriter out=
					new PrintWriter(sock.getOutputStream(),true);
			BufferedReader in =
					new BufferedReader(new InputStreamReader(sock.getInputStream()));
			while(true){
				String receive=in.readLine();
				if(receive !=null){
					if(receive.toLowerCase().equals("quit")){
						out.close();
						in.close();
						break;
					}
					if(receive.toLowerCase().equals("visitor")){
						out.print("you're the"+ Integer.toString(count)+" visitor today.");
						out.close();
						in.close();
					}
					else{
						out.print("echo:"+ receive);
						out.close();
						in.close();
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
