package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num){
        int indiceEsquerda = 0;
        int indiceDireita = arrayOrdenado.length - 1;

        while (indiceEsquerda <= indiceDireita){
            int indiceMetade = (indiceDireita + indiceEsquerda) / 2;
            int metade = arrayOrdenado[indiceMetade];
            if (num == metade){
                return 1;
            } else if(num > metade){
                indiceEsquerda += indiceMetade;
            } else {
                indiceDireita -= indiceMetade;
            }
        }
        return 0;
    }

    public static int maior(int[] arrayDesordenado){
        return -1;
    }

    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }
}
