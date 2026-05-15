package ar.edu.unlp.info.oo1.ejercicio14;

public class BuilderIntermedio extends BuilderPC{

    @Override
    public void buildProcesador() {
        this.getPC().agregarComponente(Catalogo.getComponente("Procesador Intermedio"));
    }

    @Override
    public void buildRAM() {
        this.getPC().agregarComponente(Catalogo.getComponente("16 BG"));
    }

    @Override
    public void buildDisco() {
        this.getPC().agregarComponente(Catalogo.getComponente("SSD 500 GB"));
    }

    @Override
    public void buildGrafica() {
        this.getPC().agregarComponente(Catalogo.getComponente("GTX 500"));
    }

    @Override
    public void buidGabinete() {
        this.getPC().agregarComponente(Catalogo.getComponente("Gabinete Intermedio"));
        this.getPC().agregarComponente(Catalogo.getComponente("Fuente 800 w"));
    }

}
