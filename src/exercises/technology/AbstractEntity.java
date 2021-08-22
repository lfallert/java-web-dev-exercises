package exercises.technology;

import java.util.ArrayList;
import java.util.UUID;

public abstract class AbstractEntity {
    public static String idNumber;
    public static ArrayList<String> idNumbers = new ArrayList<String>();

    public String getIdNumber() {
        return idNumber;
    }

    public static String setIdNumber() {
        return null;
    }
}
