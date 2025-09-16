package entidades;

public class Serie extends Catalogo {
    private int temporadas;
    private int episodios;

    public Serie(String atorPrincipal, entidades.genero genero, String nomeFilme, String diretor, int classificacao) {
        super(atorPrincipal, genero, nomeFilme, diretor, classificacao);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "\nTemporadas: " + temporadas +
                "\nEpisodios: " + episodios ;
    }
}
