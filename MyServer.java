import java.io.*;  
import java.net.*;  

class MyServer {  
    public static void main(String args[]) throws Exception {  
        // Create a server socket that listens on port 3333
        ServerSocket ss = new ServerSocket(4444);  
  
        System.out.println("Server is running and waiting for a client...");  

        // Accept a connection from the client
        Socket s = ss.accept();  
        System.out.println("Client connected!");  

        // Create input stream to read data from the client
        DataInputStream din = new DataInputStream(s.getInputStream());  
        // Create output stream to send data to the client
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());  
        // To read input from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

        String clientMessage = "", serverResponse = "";  
        
        // Loop until the client sends "stop"
        while (!clientMessage.equals("stop")) {  
            // Read message from the client
            clientMessage = din.readUTF();  
            System.out.println("Client says: " + clientMessage);  

            // Read server response from the console
            serverResponse = br.readLine();  
            // Send server response to the client
            dout.writeUTF(serverResponse);  
            dout.flush();  
        }  
        
        // Close resources
        din.close();  
        dout.close();  
        s.close();  
        ss.close();  
        System.out.println("Server stopped.");  
    }  
}
