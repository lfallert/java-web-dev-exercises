package exercises.technology;



public class Program {

    public static void main(String[] args) {
        Computer myPhone = new SmartPhone(2019, "Apple", "black", "ATT");

        System.out.println(((SmartPhone) myPhone).checkProvider());

        String myId = AbstractEntity.setIdNumber();

        myPhone.setIdNumber();

        System.out.println(myPhone);




    }
}

