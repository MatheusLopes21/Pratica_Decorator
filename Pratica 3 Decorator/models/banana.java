public class Banana extends BaseDecorator {
    public Banana(Adicional wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Banana";
    }

    @Override
    public double custo() {
        if (wrappee instanceof Acai) {
            Tamanho tamanho = ((Acai) wrappee).getTamanho();
            switch (tamanho) {
                case PEQUENO:
                    return wrappee.custo() + 0.75;
                case MEDIO:
                    return wrappee.custo() + 1.00;
                case GRANDE:
                    return wrappee.custo() + 1.50;
            }
        }
        return wrappee.custo();
    }
}
