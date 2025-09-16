package entidades;

public class Catalogo {
    private String atorPrincipal;
    private genero genero;
    private String nomeFilme;
    private String diretor;
    private int classificacao;

    public Catalogo(String atorPrincipal, entidades.genero genero, String nomeFilme, String diretor, int classificacao) {
        this.atorPrincipal = atorPrincipal;
        this.genero = genero;
        this.nomeFilme = nomeFilme;
        this.diretor = diretor;
        if (classificacao >= 0 && classificacao <= 5) {
            this.classificacao = classificacao;
        } else {
            this.classificacao = 0;
        }
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public void setAtorPrincipal(String atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }

    public entidades.genero getGenero() {
        return genero;
    }

    public void setGenero(entidades.genero genero) {
        this.genero = genero;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        if (classificacao >= 0 && classificacao <= 5) {
            this.classificacao = classificacao;
        } else {
            System.out.println("classificacao invalida");
        }

    }

    @Override
    public String toString() {
        return
                "\n Filme: " + nomeFilme +
                "\nProtagonista: " + atorPrincipal +
                "\nGênero: " + genero +
                "\nDiretor: " + diretor +
                "\nclassificação: " + classificacao;
    }
}
