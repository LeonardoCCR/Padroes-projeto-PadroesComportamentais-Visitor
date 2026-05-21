public class MensagemTexto implements ElementoMensagem {
    private String texto;

    public MensagemTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
