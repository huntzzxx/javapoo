package Audio.Principal;
import Audio.Modelos.MinhasPreferidas;
import Audio.Modelos.Musica;
import Audio.Modelos.Podcast;
import Audio.Modelos.Audio;

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
        meuPodcast.setHost("Rogério Vilela");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
