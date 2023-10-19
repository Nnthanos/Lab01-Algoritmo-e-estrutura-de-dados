package main;

public class App {
    public static int encontre(int[] arrayOrdenado, int num) {
        int indiceEsquerda = 0;
        int indiceDireita = arrayOrdenado.length - 1;

        while (indiceEsquerda <= indiceDireita) {
            int indiceMetade = (indiceDireita + indiceEsquerda) / 2;
            int metade = arrayOrdenado[indiceMetade];
            if (num == metade) {
                return 1;
            } else if (num > metade) {
                indiceEsquerda += indiceMetade;
            } else {
                indiceDireita -= indiceMetade;
            }
        }
        return 0;
    }

    public static int maior(int[] arrayDesordenado) {
        int maior = arrayDesordenado[0];
        for (int i : arrayDesordenado) {
            if (i > maior) {
                maior = i;
            }
        }
        return maior;
    }

    public static Double parMaisProximo(Integer[][] pares) {

        if (pares.length == 0) {
            return null;
        }

        double menorDistancia = -1;
        for (int i = 0; i < pares.length; i++) {
            Integer x1 = pares[i][0];
            Integer y1 = pares[i][1];
            for (int j = i + 1; j < pares.length; j++) {

                Integer x2 = pares[j][0];
                Integer y2 = pares[j][1];

                double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));

                if (menorDistancia == -1 || menorDistancia > distancia) {
                    menorDistancia = distancia;
                }
            }
        }
        return menorDistancia;
    }
}