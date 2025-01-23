import java.io.*;  
import java.net.*;  

class MyClient {  
    public static void main(String args[]) throws Exception {  
        // Connect to the server at localhost on port 3333
        Socket s = new Socket("localhost", 4444);  
  
        System.out.println("Connected to the server!");

        // Create input stream to read data from the server
        DataInputStream din = new DataInputStream(s.getInputStream());  
        // Create output stream to send data to the server
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());  
        // To read input from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

        String clientMessage = "", serverMessage = "";  
        
        // Loop until the client sends "stop"
        while (!clientMessage.equals("stop")) {  
            // Read client message from the console
            clientMessage = br.readLine();  
            // Send client message to the server
            dout.writeUTF(clientMessage);  
            dout.flush();  

            // Read server response from the input stream
            serverMessage = din.readUTF();  
            System.out.println("Server says: " + serverMessage);  
        }  
        
        // Close resources
        dout.close();  
        din.close();  
        s.close();  
        System.out.println("Client stopped.");  
    }  
}
