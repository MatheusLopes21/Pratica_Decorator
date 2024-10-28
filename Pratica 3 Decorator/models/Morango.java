public class Morango extends BaseDecorator {
    public Morango(Adicional wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Morango";
    }

    @Override
    public double custo() {
        if (wrappee instanceof Acai) {
            Tamanho tamanho = ((Acai) wrappee).getTamanho();
            switch (tamanho) {
                case PEQUENO:
                    return wrappee.custo() + 1.00;
                case MEDIO:
                    return wrappee.custo() + 1.50;
                case GRANDE:
                    return wrappee.custo() + 2.00;
            }
        }
        return wrappee.custo();
    }
}
