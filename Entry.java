import java.text.SimpleDateFormat;
import java.util.Date;

public class Entry {
    final Date time;
    final String data;
    public Entry(String data) {
        this.data = data;
        this.time = new Date();
    }

    public Date getTime() {
        return this.time;
    }

    public String getData() {
        return this.data;
    }

    @Override
    public String toString() {
        SimpleDateFormat formater = new SimpleDateFormat("MM-dd-yyyy");
        return formater.format(time) + "\n" + data;
    }
}
