package ar.edu.unlp.info.oo1.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class SingleThreadTCPServer {

    public abstract void handleMessage(String message, PrintWriter out);

    public final void startLoop(String[] args) {
        checkArguments(args);

        int portNumber = Integer.parseInt(args[0]);

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            displaySocketInformation(portNumber);
            while (true) {
                Socket clientSocket = acceptAndDisplaySocket(serverSocket);
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            displayAndExit(portNumber);
        }
    }

    protected void displayAndExit(int portNumber) {
        System.err.println("Could not listen on port " + portNumber);
        System.exit(-1);
    }

    protected Socket acceptAndDisplaySocket(ServerSocket serverSocket) throws IOException {
        Socket clientSocket = serverSocket.accept();
        displaySocketData(clientSocket);
        return clientSocket;
    }

    protected void displaySocketData(Socket clientSocket) {
        System.out.println("Client connected from: " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort());
    }

    protected void displaySocketInformation(int portNumber) {
        System.out.println(this.getClass().getName() + " server listening on port: " + portNumber);
    }

    protected void checkArguments(String[] args) {
        if (args.length != 1) {
            displayUsage();
            System.exit(1);
        }
    }

    protected void displayUsage() {
        System.err.println("Usage: java " + this.getClass().getName() + " <port number>");
    }

    // --- MÉTODOS HOOKS (Alternativa C e instrucciones del enunciado) ---

    /**
     * Hook que define la palabra que causa el fin de la sesión.
     * Por defecto es una cadena vacía, pero las subclases pueden cambiarlo.
     */
    protected String sessionTerminationWord() {
        return "";
    }

    /**
     * Hook opcional que se ejecuta al iniciar la sesión con el cliente.
     */
    protected void startedSession(PrintWriter out) {
        // Implementación vacía por defecto
    }

    /**
     * Hook opcional que se ejecuta al finalizar la sesión con el cliente.
     */
    protected void finishedSession() {
        // Implementación vacía por defecto
    }


    // --- EL TEMPLATE METHOD REFACTORIZADO ---
    protected final void handleClient(Socket clientSocket) {
        try (
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ) {
            // Invocar Hook de inicio de sesión
            this.startedSession(out);

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Received message: " + inputLine + " from "
                        + clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort());
                
                // Evaluar condición de cierre usando la palabra provista por el Hook (Alternativa C)
                if (inputLine.equalsIgnoreCase(this.sessionTerminationWord())) {
                    break; 
                }
                
                this.handleMessage(inputLine, out);
            }

            // Invocar Hook de fin de sesión
            this.finishedSession();
            
            System.out.println("Connection closed with " + clientSocket.getInetAddress().getHostAddress() + ":"
                    + clientSocket.getPort());
        } catch (IOException e) {
            System.err.println("Problem with communication with client: " + e.getMessage());
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("Error closing socket: " + e.getMessage());
            }
        }
    }
}