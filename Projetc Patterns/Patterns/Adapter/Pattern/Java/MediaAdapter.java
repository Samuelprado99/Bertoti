public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("mkv")) {
            advancedPlayer = new MkvPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        // O adapter traduz a chamada do método 'play' para os métodos específicos.
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("mkv")) {
            advancedPlayer.playMkv(fileName);
        }
    }
}
