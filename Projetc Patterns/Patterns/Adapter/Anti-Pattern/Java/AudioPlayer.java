public class AudioPlayer {
   
    private Mp4Player mp4Player = new Mp4Player();
    private MkvPlayer mkvPlayer = new MkvPlayer();

    public void play(String audioType, String fileName) {
        // Lógica condicional dentro do cliente.
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Tocando arquivo mp3: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            // O cliente chama diretamente o método da classe incompatível.
            mp4Player.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("mkv")) {
            mkvPlayer.playMkv(fileName);
        } else {
            System.out.println("Formato inválido: " + audioType);
        }
    }
}

// Classes que seriam adaptadas (iguais ao exemplo do Padrão)
class Mp4Player {
    public void playMp4(String fileName) { System.out.println("Tocando arquivo mp4: " + fileName); }
}
class MkvPlayer {
    public void playMkv(String fileName) { System.out.println("Tocando arquivo mkv: " + fileName); }
}
