public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Suporte nativo para mp3
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Tocando arquivo mp3: " + fileName);
        } 
        // Usa o adapter para outros formatos
        else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("mkv")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Formato inválido: " + audioType);
        }
    }
}
