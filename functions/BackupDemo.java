import java.io.Serializable;

class BackupData implements Serializable {
    String data = "Backup completed.";
}

public class BackupDemo {
    public static void main(String[] args) {
        BackupData b = new BackupData();
        System.out.println(b.data);
    }
}
