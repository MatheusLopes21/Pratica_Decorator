/* Pratica 3 Decorator Method 
    Dupla: Igor Carvalho Braz -- RA: 42021158
            Matheus Magalhães Alves Lopes -- RA: 4231922738*/ 

public class TestaDecorator {
    public static void main(String[] args) {
        Adicional acaiMedio = new Acai(Tamanho.MEDIO);
        System.out.println(acaiMedio.getDescricao() + " - Custo: R$ " + acaiMedio.custo());

        Adicional acaiComMorango = new Morango(acaiMedio);
        System.out.println(acaiComMorango.getDescricao() + " - Custo: R$ " + acaiComMorango.custo());

        Adicional acaiCompleto = new Banana(new LeiteCondensado(new Morango(acaiMedio)));
        System.out.println(acaiCompleto.getDescricao() + " - Custo: R$ " + acaiCompleto.custo());
    }
}
