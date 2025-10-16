public class MkvPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) { /* não faz nada */ }
    @Override
    public void playMkv(String fileName) {
        System.out.println("Tocando arquivo mkv: " + fileName);
    }
}