package HomeWork_5_1;

public class Main {
    public static void main(String[] args) {

        Phone nokia = new Phone (26440722, "Nokia"); //Myphone
        Phone ericsson = new Phone(26022110, "Ericsson"); // HisPhone
        Phone motorola = new Phone(23456448,"Motorola"); //HerPhone

        nokia.writePhoneBook("HisPhone", ericsson.getNumber());
        nokia.writePhoneBook("HerPhone", motorola.getNumber());

        ericsson.writePhoneBook("MyPhone", nokia.getNumber());
        ericsson.writePhoneBook("HerPhone", motorola.getNumber());

        motorola.writePhoneBook("HisPhone", ericsson.getNumber());
        motorola.writePhoneBook("MysPhone", nokia.getNumber());

        nokia.getPhoneBooks();
        ericsson.getPhoneBooks();
        motorola.getPhoneBooks();
        System.out.println();

        nokia.receiveCall(motorola.getNumber());
        motorola.receiveCall(ericsson.getNumber());
        System.out.println();

        ericsson.sendMessage("Привет", nokia.getNumber(), motorola.getNumber());

    }

}
