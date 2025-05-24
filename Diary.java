import java.util.ArrayList;
import java.util.Date;

public class Diary {
    final private ArrayList<Entry> EntryList = new ArrayList<>();
    final private String username, password;
    public Diary(String un, String pw) {
        username = un;
        password = pw;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Returns All Entries
    public ArrayList<Entry> getEntries() {
        return EntryList;
    }

    // Returns All Entries after a given date
    public ArrayList<Entry> getEntries(Date time) {
        ArrayList<Entry> timedEntry = new ArrayList<>();
        for (Entry e : EntryList) {
            if (time.after(e.getTime())) continue;
            timedEntry.add(e);
        }
        return timedEntry;
    }

    public void SaveDiary() {

    }

    public void GetDiary() {

    }
}
