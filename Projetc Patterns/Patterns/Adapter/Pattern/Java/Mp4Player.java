public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Tocando arquivo mp4: " + fileName);
    }
    @Override
    public void playMkv(String fileName) { /* não faz nada */ }
}