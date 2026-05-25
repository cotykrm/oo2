package ar.edu.unlp.info.oo1.ejercicio23;
import java.time.LocalDate;


public class Mamifero implements IMamifero{
    private String id;
    private String especie;
    private LocalDate fechaNacimiento;
    private IMamifero padre;
    private IMamifero madre;

    public Mamifero(String id){
        this.id = id;
    }

    public Mamifero(){
        
    }

    @Override
    public String getIdentificador(){
        return this.id;
    }

    @Override
    public void setIdentificador(String id){
        this.id = id;
    }

    @Override
    public String getEspecie(){
        return this.especie;
    }

    @Override
    public void setEspecie(String especie){
        this.especie = especie;
    }

    @Override
    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    @Override
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public IMamifero getPadre(){
        return this.padre;
    }

    @Override
    public void setPadre(IMamifero padre){
        this.padre = padre;
    }

    @Override
    public IMamifero getMadre(){
        return this.madre;
    }

    @Override
    public void setMadre(IMamifero madre){
        this.madre = madre;
    }
    
    @Override
    public IMamifero getAbueloPaterno(){
        return this.getPadre().getPadre();
    }

    @Override
    public IMamifero getAbuelaPaterna(){
        return this.getPadre().getMadre();
    }

    @Override
    public IMamifero getAbueloMaterno(){
        return this.getMadre().getPadre();
    }

    @Override
    public IMamifero getAbueloMaterno2() {
        return this.getMadre().getPadre();
    }

    @Override
    public IMamifero getAbuelaMaterna(){
        return this.getMadre().getMadre();
    }

    @Override
    public boolean tieneComoAncestroA(IMamifero m){
        IMamifero madre = this.getMadre();
        IMamifero padre = this.getPadre();
        return madre == m || 
        padre == m || 
        madre.tieneComoAncestroA(m) || 
        padre.tieneComoAncestroA(m);
    }
}
