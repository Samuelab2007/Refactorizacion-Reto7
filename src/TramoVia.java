public abstract class TramoVia {
    private int xInicial;
    private int yInicial;
    private int xFinal;
    private int yFinal;
    private final int ANCHO;

    public TramoVia(int xInicial, int yInicial, int xFinal, int yFinal,int ANCHO) {
        this.xInicial = xInicial;
        this.yInicial = yInicial;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
        this.ANCHO = ANCHO;
    }

    public int getxInicial() {
        return xInicial;
    }

    public int getxFinal() {
        return xFinal;
    }

    public int getyInicial() {
        return yInicial;
    }

    public int getyFinal() {
        return yFinal;
    }

    public int getANCHO() {
        return ANCHO;
    }

    public double longitud() {
        double longitudEnX = (this.xFinal-this.xInicial);
        double longitudEnY = (this.yFinal-this.yInicial);
        return Math.sqrt(Math.pow(longitudEnX,2) + Math.pow(longitudEnY,2));
    }
    public double area(){
        return longitud()*this.ANCHO;
    }
    public abstract double volumen();

}
