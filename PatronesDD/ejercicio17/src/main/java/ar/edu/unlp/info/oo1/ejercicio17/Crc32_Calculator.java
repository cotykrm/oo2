package ar.edu.unlp.info.oo1.ejercicio17;

import java.util.zip.CRC32;

public class Crc32_Calculator implements CrcCalculator{

    @Override
	public long crcFor(String data) {
		CRC32 crc = new CRC32();
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return result;
	}


}
