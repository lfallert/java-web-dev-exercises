package exercises.technology;

import java.util.ArrayList;
import java.util.UUID;

public class AbstractEntity {
    private static String idNumber;
    private static ArrayList<String> idNumbers = new ArrayList<String>();

    public String getIdNumber() {
        return idNumber;
    }

    //need to create a method that creates a unique ID for each object

    public static String setIdNumber() {
        idNumber = "";
        while (idNumber == "") {
            idNumber = UUID.randomUUID().toString();

            if (!idNumbers.contains(idNumber)) {
                idNumbers.add(idNumber);
                break;
            } else
                idNumber = "";
        }
        return idNumber;
    }
}
