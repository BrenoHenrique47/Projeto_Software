package entidades;

public class Filme extends Catalogo{
        private int duracao;

    public Filme(String atorPrincipal, entidades.genero genero, String nomeFilme, String diretor, int classificacao) {
        super(atorPrincipal, genero, nomeFilme, diretor, classificacao);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return
                "\nDuração: " + duracao ;
    }
}
