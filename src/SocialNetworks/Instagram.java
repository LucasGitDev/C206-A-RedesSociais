package SocialNetworks;

public class Instagram extends RedeSocial {
    public Instagram(String senha, int numAmigos) {
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
}
