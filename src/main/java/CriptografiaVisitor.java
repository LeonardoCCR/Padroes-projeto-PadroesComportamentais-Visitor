public class CriptografiaVisitor implements Visitor {
    @Override
    public String visit(MensagemTexto msg) {
        return "TEXTO_CRIPTOGRAFADO: " + msg.getTexto();
    }

    @Override
    public String visit(MensagemAudio msg) {
        return "AUDIO_CRIPTOGRAFADO: [" + msg.getDadosAudio() + "]";
    }
}
