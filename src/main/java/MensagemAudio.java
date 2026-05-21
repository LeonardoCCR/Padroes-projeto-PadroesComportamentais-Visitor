public class MensagemAudio implements ElementoMensagem {
    private String dadosAudio;

    public MensagemAudio(String dadosAudio) {
        this.dadosAudio = dadosAudio;
    }

    public String getDadosAudio() {
        return dadosAudio;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
