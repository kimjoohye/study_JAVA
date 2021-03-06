package com.pcwk.ex06.net;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
public class TcpIpServer06 {
	
	HashMap<String, DataOutputStream> clients;
	public TcpIpServer06() {
		clients = new HashMap<>();
		Collections.synchronizedMap(clients);// HashMap 동기화
	}
	
	public void start() {
		//ServerSocket
		//Socket
		//ServerReceiver 생성후 start()
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port	  = 9999;
		
		try {
			System.out.println("서버가 시작 되었습니다.\nport : "+port);
			serverSocket = new ServerSocket(port);
			while(true) {
			socket = serverSocket.accept();
			//[192.168.3.101:78979]에서 접속!
			System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"에서 접속!");
		
			ServerReceiver serverReceiver = new ServerReceiver(socket);
			serverReceiver.start();
			}	
		
		}catch(IOException e) {
			System.out.println("55--------------------------------");
			System.out.println(e.getMessage());
			
		}
	}//--start
	public static void main(String[] args) {
		TcpIpServer06 main = new TcpIpServer06();
		main.start();
	}
	//모든 사용자에게 메세지 보내기
	public void sendToAll(String msg) {
	
		Iterator iter = clients.keySet().iterator();
		while(iter.hasNext()==true) {
			
			DataOutputStream clientOut = (DataOutputStream ) clients.get(iter.next());
			try {
				clientOut.writeUTF(msg);
			}catch(IOException e) {
				
			}
		}
		
	}//--sendToAll
	
	
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;//client 읽기
		DataOutputStream out;//client 출력
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}// --ServerReveiver
		
		// 데이터 읽기, 데이터를 모든 사용자에게 전송
		@Override
		public void run() {
			String name = "";
			try {
				System.out.println("0-------------------------in-"+in);
				name = in.readUTF();//client의 대화명
				System.out.println("1-------------------------name-"+name);
				sendToAll("#"+name+"님이 입장했습니다.");
				clients.put(name, out);//대화명key, DataoutputStream value
				System.out.println("현재 접속자 수는"+clients.size()+" 입니다.");
			
				while(in != null) {
					//읽은 메시지를 모든 사용자에게 전송
					sendToAll(in.readUTF());
				}
			}catch(IOException e) {
				System.out.println("10-------------------------------");
				System.out.println(e.getMessage());	
			}finally {
				//접속 종료 처리
				sendToAll("#"+name+"님이 퇴장했습니다");
				
				clients.remove(name);//client정보를 hashMap에서 삭제
				System.out.println("["+socket.getInetAddress()+"] 에서 접속 종료 하였습니다.");
				System.out.println("현재 접속자 수는"+clients.size()+" 입니다.");
			}
			
			
		}// --run
	}// --ServerReceiver
}// --TcpipServer06