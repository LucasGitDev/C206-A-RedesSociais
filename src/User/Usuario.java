package User;

import SocialNetworks.RedeSocial;

public class Usuario {

    private String nome;
    private String email;
    private RedeSocial[] redesSociais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RedeSocial[] getRedesSociais() {
        return redesSociais;
    }

    public void setRedesSociais(RedeSocial[] redesSociais) {
        this.redesSociais = redesSociais;
    }


    public Usuario(RedeSocial[] redesSociais) {
        this.redesSociais = redesSociais;
    }
}
