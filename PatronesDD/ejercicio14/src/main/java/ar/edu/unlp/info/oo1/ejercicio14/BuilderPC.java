package ar.edu.unlp.info.oo1.ejercicio14;

public abstract class BuilderPC {

    private PC pc;

    public BuilderPC(){
        this.reiniciar();
    }

    public void reiniciar(){
        this.pc = new PC();
    }

    public abstract void buildProcesador();

    public abstract void buildRAM();

    public abstract void buildDisco();

    public abstract void buildGrafica();

    public abstract void buidGabinete();

    public PC resultado(){
        return this.pc;
    }

    public PC getPC(){
        return this.pc;
    }

}
