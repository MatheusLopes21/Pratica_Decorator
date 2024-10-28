public class LeiteCondensado extends BaseDecorator {
    public LeiteCondensado(Adicional wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Leite Condensado";
    }

    @Override
    public double custo() {
        if (wrappee instanceof Acai) {
            Tamanho tamanho = ((Acai) wrappee).getTamanho();
            switch (tamanho) {
                case PEQUENO:
                    return wrappee.custo() + 1.50;
                case MEDIO:
                    return wrappee.custo() + 2.00;
                case GRANDE:
                    return wrappee.custo() + 2.50;
            }
        }
        return wrappee.custo();
    }
}