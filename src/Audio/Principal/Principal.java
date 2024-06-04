package Audio.Principal;
import Audio.Modelos.Musica;
import Audio.Modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("505");
        minhaMusica.setAlbum("Favourite Worst Nightmare");
        minhaMusica.setCantor("Arctic Monkeys");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Inteligência Ltda");
        meuPodcast.setHost("Guga Mafra");
    }
}
