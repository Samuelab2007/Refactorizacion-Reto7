public class TramoAsfaltado extends TramoVia{

    private String proveedorAsfalto;
    private float velocidadMaxima;
    private boolean permitidoAdelantar;

    private final double ESPESOR = 0.25;

    public TramoAsfaltado(int xInicial, int yInicial, int xFinal, int yFinal,String proveedorAsfalto, float velocidadMaxima, boolean permitidoAdelantar) {
        super(xInicial, yInicial, xFinal, yFinal,8);
        this.proveedorAsfalto = proveedorAsfalto;
        this.velocidadMaxima = velocidadMaxima;
        this.permitidoAdelantar = permitidoAdelantar;
    }

    @Override
    public double volumen() {
        return area()*ESPESOR;
    }

    @Override
    public String toString() {
        return "TramoAsfaltado{" +"xInicial= "+getxInicial()+", xFinal= "+getxFinal()+", yInicial= "+getyInicial()+", yFinal= "+getyFinal()+
                ", Ancho= "+getANCHO()+", ESPESOR=" + ESPESOR +
                ", ProveedorAsfalto='" + proveedorAsfalto + '\'' +
                ", VelocidadMaxima=" + velocidadMaxima +
                ", PermitidoAdelantar=" + permitidoAdelantar +
                '}';
    }
}
