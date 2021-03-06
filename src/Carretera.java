import java.util.ArrayList;

public class Carretera {
    private ArrayList<TramoVia> conjuntoVias = new ArrayList<>();

    public ArrayList<TramoVia> getConjuntoVias() {
        return conjuntoVias;
    }

    public void anhadirTramo(TramoVia tramo) {
        conjuntoVias.add(tramo);
    }


    public float longitudTotalCarretera() {
        float sumaLongitudes = 0;

        for (TramoVia elementoVia : conjuntoVias) {
            sumaLongitudes += elementoVia.longitud();
        }
        return sumaLongitudes;
    }

    public float areaTotalCarretera(){
        float sumaAreas = 0;
        for (TramoVia seccionVia : conjuntoVias) {
            sumaAreas += seccionVia.area();
        }
        return sumaAreas;
    }

    public double volumenTotal() {
        double volumenTotalMaterial = 0;
        for (TramoVia seccionVia : conjuntoVias) {
            volumenTotalMaterial += seccionVia.volumen();
        }
        return volumenTotalMaterial;
    }

    public double volumenAsfaltado() {
        double volumenAsfalto = 0;
        for (TramoVia asfaltado : conjuntoVias) {
            if (asfaltado instanceof TramoAsfaltado) {    //Verifico la clase de mi objeto
                volumenAsfalto += asfaltado.volumen();
            }
        }
        return volumenAsfalto;
    }

    public double volumenSinAsfaltar() {
        double volumenMaterial = 0;
        for (TramoVia viaMaterialVariable : conjuntoVias) {
            if (viaMaterialVariable instanceof TramoSinAsfaltar) {
                volumenMaterial += viaMaterialVariable.volumen();
            }
        }
        return volumenMaterial;
    }

    public boolean conectados() {
        for (int i = 0; i < conjuntoVias.size() - 1; i++) {
            int j = i + 1;
            boolean desconectadosEnX = (conjuntoVias.get(i).getxFinal() != conjuntoVias.get(j).getxInicial());
            boolean desconectadosEnY = (conjuntoVias.get(i).getyFinal() != conjuntoVias.get(j).getyInicial());
            if (desconectadosEnX || desconectadosEnY) {
                return false;
            }
        }
        return true;
    }
}
