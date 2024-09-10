import java.util.Scanner;

public class Aluno {
    private String nome;
    private Double nota1;
    private Double nota2;
    private String status;

    public Aluno() {
        this.status = "APROVADO";
    }

    public void entradaDeNotas () {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        this.nome = ler.nextLine();
        System.out.println("Digite a primeira nota: ");
        this.nota1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        this.nota2 = ler.nextDouble();
    }

    public Double calcularMedia () {
        Double media = (this.nota1 + this.nota2)/2;
                if (media < 5){
                    this.status = "REPROVADO";
                }
                return media;
    }
    public void exibirMedia(Double media){
        System.out.println("Nome: " + this.nome + " - Média: " + media + " - Status: " + this.status);
    }


}


