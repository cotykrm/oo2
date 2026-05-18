package ar.edu.unlp.info.oo1.ejercicio17;

public class Connection4GAdapter implements Connection{
    
    private Connection4G fourG;
    
    public String sendData(String data, int crc){
        return this.fourG.transmit(data, crc);
    }
    
    public String pict(){
        return this.fourG.symb();
    }

}
