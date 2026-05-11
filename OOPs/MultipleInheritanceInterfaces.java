interface Camera {
    void takePicture();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void takePicture() {
        System.out.println("Picture Captured");
    }

    @Override
    public void playMusic() {
        System.out.println("Music Playing");
    }
}

public class Main {
    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();

        s.takePicture();
        s.playMusic();
    }
}