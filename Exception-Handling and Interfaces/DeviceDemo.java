interface Camera {
    void takePhoto();
}
interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {
    public void takePhoto() { System.out.println("Photo taken!"); }
    public void playMusic() { System.out.println("Music playing..."); }
}

public class DeviceDemo {
    public static void main(String[] args) {
        try {
            Smartphone s = new Smartphone();
            s.takePhoto();
            s.playMusic();
        } catch(Exception e) {
            System.out.println("Device error: " + e.getMessage());
        }
    }
}

