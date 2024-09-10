import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.entradaDeNotas();
        double media = aluno1.calcularMedia();
        aluno1.exibirMedia(media);

    }


    }
