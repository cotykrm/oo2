package ar.edu.unlp.info.oo1.ejercicio14;

public class BuilderGamer extends BuilderPC {

    @Override
    public void buildProcesador() {
        this.getPC().agregarComponente(Catalogo.getComponente("Procesador Gamer"));
        this.getPC().agregarComponente(Catalogo.getComponente("Pad termico"));
        this.getPC().agregarComponente(Catalogo.getComponente("Cooler"));
    }

    @Override
    public void buildRAM() {
        this.getPC().agregarComponente(Catalogo.getComponente("32 GB"));
        this.getPC().agregarComponente(Catalogo.getComponente("32 GB"));
    }

    @Override
    public void buildDisco() {
        this.getPC().agregarComponente(Catalogo.getComponente("SSD 500 GB"));
        this.getPC().agregarComponente(Catalogo.getComponente("SSD 1 TB"));
    }

    @Override
    public void buildGrafica() {
        this.getPC().agregarComponente(Catalogo.getComponente("RTX 4090"));
    }

    @Override
    public void buidGabinete() {
        double aux = this.getPC().calcularConsumo();
        aux+= aux*0.50;
        String fuente = "fuente " + aux + "W";
        this.getPC().agregarComponente(Catalogo.getComponente(fuente));
        
    }

}
