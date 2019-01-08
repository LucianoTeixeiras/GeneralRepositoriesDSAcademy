package Capitulo_06;

public class Exercicio_02 {

    public static void main(String[] args) {

        int idade = 10;

        // idade = null; // Tipo primitivo não aceita nulo

        // Mas se for necessário atribuir nulo a uma variavel
        // Pode ser usado uma Classe que "empacota" o tipo primitivo int
        // Uma referencai a um objeto podera receber nulo.

        Integer novaIdade = 20; //Auto Boxing
        System.out.println("Nova Idade: " + novaIdade);

        int idadePrimitivo = novaIdade; // Auto unboxing
        System.out.println("idadePrimitivo: " + idadePrimitivo);

        novaIdade = null; // Idade pode ser null pois é referencia para um objeto
        System.out.println("Nova Idade: " + novaIdade);
    }
}
