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
