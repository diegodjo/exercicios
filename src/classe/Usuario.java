package classe;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }

    // --------------------------------------------------------------------------------------------------
// EQUALS CRIADO MANUALMENTE:
//---------------------------------------------------------------------------------------------------

//    @Override
//    public boolean equals(Object obj) {
//
//        if(obj instanceof Usuario){
//            Usuario outro = (Usuario) obj;
//
//            boolean nomeIgual = outro.nome.equals(this.nome);
//            boolean emailIgual = outro.email.equals(this.email);
//
//            return nomeIgual && emailIgual;
//        } else {
//            return false;
//        }
//
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }
}
