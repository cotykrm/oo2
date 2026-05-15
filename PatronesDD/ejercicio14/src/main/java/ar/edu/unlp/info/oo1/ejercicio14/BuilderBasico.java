package ar.edu.unlp.info.oo1.ejercicio14;

public class BuilderBasico extends BuilderPC{
    

    @Override
    public void buildProcesador() {
        this.getPC().agregarComponente(Catalogo.getComponente("Procesador Básico"));
    }

    @Override
    public void buildRAM() {
        this.getPC().agregarComponente(Catalogo.getComponente("8 GB"));
    }

     @Override
    public void buildDisco() {
       this.getPC().agregarComponente(Catalogo.getComponente("HDD 500 GB"));
    }

    @Override
    public void buildGrafica() {
        throw new UnsupportedOperationException("Unimplemented method 'buildGrafica'");
    }
    

    @Override
    public void buidGabinete() {
        this.getPC().agregarComponente(Catalogo.getComponente("Gabinete Estandar"));
    }


}
