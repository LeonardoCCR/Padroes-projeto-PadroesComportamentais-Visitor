import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CriptografiaVisitorTest {

    @Test
    public void testCriptografiaComVisitor() {

        Visitor cripto = new CriptografiaVisitor();


        ElementoMensagem texto = new MensagemTexto("Ola Mundo");
        ElementoMensagem audio = new MensagemAudio("010101");


        String resultadoTexto = texto.accept(cripto);
        String resultadoAudio = audio.accept(cripto);


        assertEquals("TEXTO_CRIPTOGRAFADO: Ola Mundo", resultadoTexto);
        assertEquals("AUDIO_CRIPTOGRAFADO: [010101]", resultadoAudio);
    }
}
