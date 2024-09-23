package classes;

import java.util.ArrayList;

public class PlayList {
  private String nome;
  private ArrayList<Musica> musicas = new ArrayList<>();

  public PlayList() {}

  public PlayList(String nome) {
    this.nome = nome;
  }
  
  public PlayList(String nome, ArrayList<Musica> musicas) {
    this.nome = nome;
    this.musicas = musicas;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public ArrayList<Musica> getMusicas() {
    return this.musicas;
  }

  public void setMusicas(ArrayList<Musica> musicas) {
    this.musicas = musicas;
  }
  
  public void adicionarMusica(Musica novaMusica) {
    for (Musica musica : musicas) {
      boolean nomeIgual = musica.getNome().equals(novaMusica.getNome());
      boolean duracaoIgual = musica.getDuracao().equals(novaMusica.getDuracao());
      boolean nomeArtistaIgual = musica.getNomeArtista().equals(novaMusica.getNomeArtista());


      if (nomeIgual && duracaoIgual && nomeArtistaIgual) {
        System.out.println("Música já existente");
        return;
      }
    }
    
    musicas.add(novaMusica);
  }

  public void listarMusicas() {
    for (Musica musica : musicas) {
      System.out.println("------------------------------");
      System.out.println("Nome da música: " + musica.getNome());
      System.out.println("Duração da música (mm:ss): " + musica.getDuracao());
      System.out.println("Nome do artista/banda: " + musica.getNomeArtista());
    }
  }

  public void removerMusica(String nomeAlvo) {
    for (Musica musica : musicas) {
      boolean nomeIgual = musica.getNome().equals(nomeAlvo);

      if (nomeIgual) {
        musicas.remove(musica);
        return;
      }
    }
  }
}