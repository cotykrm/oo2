package ar.edu.unlp.info.oo1.ejercicio17;

public class Connection4G {
    private String symb;
	
	public Connection4G() {
		this.symb = "4G";
	}
	
	public String transmit (String data, int crc) {
		return "4G: " + data + " " + crc;
	}
	
	public String symb() {
		return this.symb;
	}

}
