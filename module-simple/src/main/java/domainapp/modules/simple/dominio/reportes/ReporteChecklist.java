package domainapp.modules.simple.dominio.reportes;

public class ReporteChecklist {

    private String identificacion;
    private String destino;
    private String fechaSalida;
    private String documentacion;
    private String tablero;
    private String laterales;
    private String seccionTrasera;
    private String frente;
    private String comentarios;

    public ReporteChecklist(String identificacion, String destino, String fechaSalida,
                            String documentacion, String tablero, String laterales, String seccionTrasera,
                            String frente, String comentarios){
        this.identificacion = identificacion;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.documentacion = documentacion;
        this.tablero = tablero;
        this.laterales = laterales;
        this.seccionTrasera = seccionTrasera;
        this.frente = frente;
        this.comentarios = comentarios;
    }

    public ReporteChecklist(){}

    public String getIdentificacion(){ return this.identificacion; }
    public String getDestino(){ return this.destino; }
    public String getFechaSalida(){ return this.fechaSalida; }
    public String getDocumentacion(){ return this.documentacion; }
    public String getTablero(){ return this.tablero; }
    public String getLaterales(){ return this.laterales; }
    public String getSeccionTrasera(){ return this.seccionTrasera; }
    public String getFrente(){ return this.frente; }
    public String getComentarios(){ return this.comentarios; }
}
