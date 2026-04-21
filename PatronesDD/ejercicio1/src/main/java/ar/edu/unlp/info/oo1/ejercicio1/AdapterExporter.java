package ar.edu.unlp.info.oo1.ejercicio1;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import netscape.javascript.JSObject;

public class AdapterExporter implements Exporter{

    public String exportar(List<Socio> socios){
        JSONArray array = new JSONArray();
        socios.stream()
        .forEach(socio -> exportarPriv(socio,array));
        return array.toJSONString();
        
    }

    private void exportarPriv (Socio socio, JSONArray array){
        JSONObject json = new JSONObject();
        json.put("Nombre: ",socio.getNombre());
        json.put("Legajo: ",socio.getLegajo());
        json.put("Email: ",socio.getEmail());

        array.add(json);
    }

}



