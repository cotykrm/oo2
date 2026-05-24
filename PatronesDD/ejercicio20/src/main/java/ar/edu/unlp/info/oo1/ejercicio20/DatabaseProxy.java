package ar.edu.unlp.info.oo1.ejercicio20;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{

    private boolean acceso;
    private DatabaseRealAccess db;
    private String contrasenia;

    public DatabaseProxy(DatabaseRealAccess db, String contra){
        this.acceso = false;
        this.db = db;
        this.contrasenia = contra;
    }

    public void iniciarSesion(String contra){
        if(!this.acceso){
            if(this.contrasenia.equals(contra)){
            this.acceso = true;
            }
            else {
                throw new RuntimeException("Contraseña incorrecta");
            }
	    } else {
			throw new RuntimeException("Sesión ya iniciada");
		}
        
    }

    public void cerrarSesion(){
        if(this.acceso){
            acceso = false;
        }
        else {
            throw new RuntimeException("Sesión no iniciada");
        }
    }


    @Override
    public Collection<String> getSearchResults(String queryString) {
        if(this.acceso){
            return this.db.getSearchResults(queryString);
        }
        else {
            throw new IllegalArgumentException("Sesión no iniciada");
        }

    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if(this.acceso){
            return this.db.insertNewRow(rowData);
        }
        else {
            throw new IllegalArgumentException("Sesión no iniciada");
        }
    }

    public boolean getAcceso(){
        return this.acceso;
    }

}
