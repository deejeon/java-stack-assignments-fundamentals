import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Time is Running Out", "I think I'm drowning, asphyxiated");
        trackList.put("Plug In Baby", "I've exposed your lies, baby, the underneath's no big surprise");
        trackList.put("Stockholm Syndrome", "I won't stand in your way, let your hatred grow");
        trackList.put("Starlight", "Far away, this ship has taken me far away");

        String starlightLyrics = trackList.get("Starlight");
        System.out.println(starlightLyrics);

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            String output = key.concat(": ").concat(trackList.get(key));
            System.out.println(output);
        }
    }
}