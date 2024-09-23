package classes;

public class Musica {
  private String nome;
  private String duracao;
  private String nomeArtista;

  public Musica() {}

  public Musica(String nome, String duracao, String nomeArtista) {
    this.nome = nome;
    this.duracao = duracao;
    this.nomeArtista = nomeArtista;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDuracao() {
    return this.duracao;
  }

  public void setDuracao(String duracao) {
    this.duracao = duracao;
  }

  public String getNomeArtista() {
    return this.nomeArtista;
  }

  public void setNomeArtista(String nomeArtista) {
    this.nomeArtista = nomeArtista;
  }
}
