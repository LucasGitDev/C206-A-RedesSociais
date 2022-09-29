package SocialNetworks;

import SocialNetworks.Interfaces.Compartilhamento;
import SocialNetworks.Interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements Compartilhamento, VideoConferencia {

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto postada no " + this.getClass().getSimpleName());
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postado no " + this.getClass().getSimpleName());
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no " + this.getClass().getSimpleName());
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhado no " + this.getClass().getSimpleName());
    }

    @Override
    public void fazStreaming() {
        System.out.println("Streaming no " + this.getClass().getSimpleName());
    }

}
