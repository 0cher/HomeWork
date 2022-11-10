package HomeWork_5_1;

public class Phone {
    private PhoneBook[] phoneBooks;
    private int number;
    private String model;
    private double weight;

    Phone(int number, String model, double weight) {
        this(number, model);
     // this.number = number;
     // this.model = model;
        this.weight = weight;
        phoneBooks = new PhoneBook[20];
    }
        Phone (int number, String model){
        this.number=number;
        this.model=model;
        phoneBooks = new PhoneBook[20];
    }
    Phone (){
        phoneBooks = new PhoneBook[20];
    }

    void writePhoneBook (String name, int number){
        for (int i=0; i<phoneBooks.length;i++){
            if (phoneBooks[i]==null){
                phoneBooks[i] = new PhoneBook(name, number);
                break;
            }
        }
    }
     void getPhoneBooks() {
         for (PhoneBook phoneBook : phoneBooks) {
             if (phoneBook != null) {
                 System.out.println(phoneBook.getBookInfo());
             }
         }
     }
    void receiveCall(int number){
        for (int i=0; i< phoneBooks.length;i++){
            if (phoneBooks[i] != null &&phoneBooks[i].getNumber()==number){
                System.out.println("Звонит "+ phoneBooks[i].getBookInfo());
                break;
            }
        }
    }

    void receiveCall(String name, int number){
        System.out.println("Звонит "+ name + " номер "+ number);
    }
    void  sendMessage(String message, int... number){
        for ( int j=0; j<number.length;j++)
            for (int i=0; i< phoneBooks.length; i++){
            if (phoneBooks[i]!=null && phoneBooks[i].getNumber()==number[j]){
                System.out.println("Сообщение \""+message+
                        "\" отправлено - "+ phoneBooks[i].getName());
            }
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public String getModel() {
        return model;
    }
    public int getNumber() {
        return number;
    }
}

 class PhoneBook {
    private String name;
    private int number;

    public PhoneBook(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public String getBookInfo(){
        return name + " " + number;
    }
}
