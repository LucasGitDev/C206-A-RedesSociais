import SocialNetworks.*;
import User.Usuario;

public class Main {
    public static void main(String[] args) {
        Facebook face = new Facebook("123", 10);
        GooglePlus gplus = new GooglePlus("123", 10);
        Twitter tt = new Twitter("123", 10);
        Instagram insta = new Instagram("123", 10);

//        É mandatório que se use pelo menos uma rede social que seja capaz de prover ocompartilhamento de posts;
        RedeSocial[] redes = {face, gplus, tt, insta};
//        RedeSocial[] redes = {face, tt}; // Alternar itens no array para testar cada RedeSocial

        Usuario user = new Usuario(redes);
        user.setEmail("user@email.com");
        user.setNome("User");

        for (RedeSocial rede : user.getRedesSociais()) {
            if (rede instanceof Facebook) {
                ((Facebook) rede).postarFoto();
                ((Facebook) rede).postarVideo();
                ((Facebook) rede).postarComentario();
                ((Facebook) rede).compartilhar();
                ((Facebook) rede).fazStreaming();
            } else if (rede instanceof GooglePlus) {
                ((GooglePlus) rede).postarFoto();
                ((GooglePlus) rede).postarVideo();
                ((GooglePlus) rede).postarComentario();
                ((GooglePlus) rede).compartilhar();
                ((GooglePlus) rede).fazStreaming();
            } else if (rede instanceof Twitter) {
                ((Twitter) rede).postarFoto();
                ((Twitter) rede).postarVideo();
                ((Twitter) rede).postarComentario();
                ((Twitter) rede).compartilhar();
            } else if (rede instanceof Instagram) {
                ((Instagram) rede).postarFoto();
                ((Instagram) rede).postarVideo();
                ((Instagram) rede).postarComentario();
            }

        }

    }
}
