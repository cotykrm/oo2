package ar.edu.unlp.info.oo1.ejercicio17;

public class Dispositivo {
    private Connection connection;
    private Ringer ringer;
    private Display display;
    private CrcCalculator crcCalculator;

    

    public Dispositivo(Connection connection, Ringer ringer, Display display, CrcCalculator crcCalculator) {
        this.connection = connection;
        this.ringer = ringer;
        this.display = display;
        this.crcCalculator = crcCalculator;
    }

    public void configurarCRC(CrcCalculator crcCalculator) {
        this.crcCalculator = crcCalculator;
    }

    public void conectarCon(Connection connection){
        this.connection = connection;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
    }

    public String send(String data){
        int crc = (int) this.crcCalculator.crcFor(data);
        return this.connection.sendData(data,crc);
    }

}
