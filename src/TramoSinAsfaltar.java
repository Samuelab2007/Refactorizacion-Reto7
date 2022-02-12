public class TramoSinAsfaltar extends TramoVia{

    private String material;
    private double espesor;

    public TramoSinAsfaltar(int xInicial, int yInicial, int xFinal, int yFinal,String material,double espesor) {
        super(xInicial, yInicial, xFinal, yFinal,6);
        this.espesor = espesor;
        this.material = material;
    }


    public double getEspesor() {
        return espesor;
    }

    @Override
    public double volumen() {
        return area()*getEspesor();
    }

    @Override
    public String toString() {
        return "TramoSinAsfaltar{" +"xInicial= "+getxInicial()+", xFinal= "+getxFinal()+", yInicial= "+getyInicial()+", yFinal= "+getyFinal()+
                ", Ancho= "+getANCHO()+
                "material='" + material + '\'' +
                ", espesor=" + espesor +
                "} ";
    }
}
