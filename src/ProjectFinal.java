import java.util.ArrayList;

public class ProjectFinal {
    static ArrayList<ArrayList<Object>> songs = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Object> song1 = new ArrayList<>();
        song1.add("Imagine");
        song1.add("John Lennon");
        song1.add(200);
        song1.add(10);
        ArrayList<Object> song2 = new ArrayList<>();
        song2.add("Aitchy");
        song2.add("Mirbek Atabekov");
        song2.add(200);
        song2.add(10);
        ArrayList<Object> song3 = new ArrayList<>();
        song3.add("Kapkaragat");
        song3.add("Bakr");
        song3.add(300);
        song3.add(5);
        addSong(songs, song1);
        addSong(songs, song2);
        addSong(songs, song3);
        displaySongs();
        searchSong("Imagine");
        updateSongStock("Kapkaragat", 15);
        displaySongs();
    }

    public static void addSong(ArrayList<ArrayList<Object>> list, ArrayList<Object> song) {
        list.add(song);
    }

    public static void displaySongs() {
        System.out.println("\nAvailable Songs:");
        for (ArrayList<Object> song : songs) {
            System.out.println("Title: " + song.get(0) + ", Artist: " + song.get(1) +
                    ", Price: " + song.get(2) + " cents, Stock: " + song.get(3));
        }
    }
    public static void searchSong(String searchTitle) {
        for (ArrayList<Object> song : songs) {
            if (song.get(0).equals(searchTitle)) {
                System.out.println("\nFound song: Title: " + song.get(0) + ", Artist: " + song.get(1) +
                        ", Price: " + song.get(2) + " cents, Stock: " + song.get(3));
                return;
            }
        }
        System.out.println("\nSong not found.");
    }
    public static void updateSongStock(String title, int newStock) {
        for (ArrayList<Object> song : songs) {
            if (song.get(0).equals(title)) {
                System.out.println("\nUpdating stock for: " + song.get(0));
                System.out.println("Old Stock: " + song.get(3));
                song.set(3, newStock);
                System.out.println("New Stock: " + song.get(3));
                return;
            }
        }
        System.out.println("\nSong not found.");
    }
}
