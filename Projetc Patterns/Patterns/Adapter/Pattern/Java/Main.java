public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "musica.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("mkv", "filme.mkv");
        audioPlayer.play("avi", "outro_video.avi");
    }
}