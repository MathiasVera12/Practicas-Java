import java.util.*;

public class Grafo {
    private List<Parada> paradas;

    public Grafo() {
        this.paradas = new ArrayList<>();
    }

    public void agregarParada(Parada parada) {
        paradas.add(parada);
    }

    public void agregarArista(Parada origen, Parada destino, double distancia) {
        Arista arista = new Arista(origen, destino, distancia);
        origen.agregarArista(arista);
    }

    public List<Parada> getParadas() {
        return paradas;
    }

    public List<Parada> caminoMasRapido(Parada origen, Parada destino) {
        Map<Parada, Double> distancias = new HashMap<>();
        Map<Parada, Parada> previos = new HashMap<>();
        PriorityQueue<Parada> queue = new PriorityQueue<>(Comparator.comparing(distancias::get));

        for (Parada parada : paradas) {
            distancias.put(parada, Double.MAX_VALUE);
            previos.put(parada, null);
        }
        distancias.put(origen, 0.0);
        queue.add(origen);

        while (!queue.isEmpty()) {
            Parada actual = queue.poll();

            if (actual.equals(destino)) break;

            for (Arista arista : actual.getAristas()) {
                Parada vecino = arista.getParadaDestino();
                double nuevaDistancia = distancias.get(actual) + arista.getDistancia();
                if (nuevaDistancia < distancias.get(vecino)) {
                    distancias.put(vecino, nuevaDistancia);
                    previos.put(vecino, actual);
                    queue.add(vecino);
                }
            }
        }

        List<Parada> camino = new ArrayList<>();
        for (Parada at = destino; at != null; at = previos.get(at)) {
            camino.add(at);
        }
        Collections.reverse(camino);
        return camino;
    }
}
