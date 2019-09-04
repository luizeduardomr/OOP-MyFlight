public class Rota {
    private Aeroporto destino;
    private Aeroporto origem;
    private Aeronave aeronave;
    private CiaAerea ciaAerea;

    public Aeroporto getOrigem(){return origem;}
    public Aeroporto getDestino(){return destino;}
    public void setOrigem(Aeroporto origem){this.origem = origem;}
    public void setDestino(Aeroporto destino){this.destino = destino;}

    public Aeronave getAeronave(){return aeronave;}
    public void setAeronave(Aeronave aeronave){this.aeronave = aeronave;}

}
