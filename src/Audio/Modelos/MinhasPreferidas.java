package Audio.Modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!");
        }
        else {
            System.out.println(audio.getTitulo() + " é um dos mais queridos!");
        }
    }
}
