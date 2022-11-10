package HomeWork_4.test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int action;
        Reader[] reader=new Reader[10];
        do {System.out.println("\nВыберите действие: \n1 - Добавить нового читателя." +
                "\n2 - Читатель хочет взять книгу. \n3 - Читатель хочет вернуть книгу." +
                "\n4 - Вывести статус читателя. \n5 - Вывести статусы всех читателей. \n6 - Выход из программы.");
            action= scan.nextInt();
            scan.nextLine();
            switch (action){
                case 1: {
                    boolean isFull = true;
                    for (int i = 0; i < reader.length; i++) {
                        if (reader[i] == null) {
                            reader[i] = new Reader();
                            System.out.print("Введите Фамилию читателя: ");
                            reader[i].surname = scan.nextLine();
                            System.out.print("Введите Имя читателя: ");
                            reader[i].name = scan.nextLine();
                            System.out.print("Введите Отчество читателя: ");
                            reader[i].otchestvo = scan.nextLine();
                            System.out.print("Введите Номер читательского билета: ");
                            reader[i].bilet = scan.nextInt();
                            scan.nextLine();
                            System.out.print("Введите Факультет читателя: ");
                            reader[i].facultet = scan.nextLine();
                            System.out.print("Введите дату рождения: ");
                            reader[i].born = scan.nextLine();
                            System.out.print("Введите Номер телефона читателя: ");
                            reader[i].telefon = scan.nextLong();
                            scan.nextLine();
                            isFull = false;
                            System.out.print("Читатель добавлен под номером " + reader[i].bilet);
                            break;
                        }
                    }
                    if (isFull) {
                        System.out.print("Достигнуто максимальное количество читателей.");
                    }


                    break;
                }

                case 2: {
                    System.out.print("Введите название книги: ");
                    String name = scan.nextLine();
                    System.out.print("Введите Автора книги: ");
                    String authorName = scan.nextLine();
                    Book book=new Book(name,authorName);
                    System.out.print("Введите Номер читательского билета: ");
                    int bilet = scan.nextInt();
                    scan.nextLine();
                    boolean found = false;
                    for (int i=0;i< reader.length;i++){
                        if (reader[i]!=null&&reader[i].bilet==bilet){
                            reader[i].takeBook(name,authorName);
                            found=true;
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Такого читателя нет.");

                    }
                    break;
                }
                case 3:{
                    System.out.print("Введите название книги: ");
                    String name = scan.nextLine();
                    Book book = new Book(name);
                    System.out.print("Введите Номер читательского билета: ");
                    int bilet = scan.nextInt();
                    scan.nextLine();
                    boolean found = false;
                    for (int i=0;i< reader.length;i++){
                        if (reader[i]!=null&&reader[i].bilet==bilet){
                            reader[i].returnBook(name);
                            found=true;
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Такого читателя нет.");

                    }
                    break;
                }
                case 4:{
                    System.out.print("Введите Номер читательского билета: ");
                    int bilet = scan.nextInt();
                    scan.nextLine();
                    boolean found = false;
                    for (int i=0;i< reader.length;i++){
                        if (reader[i]!=null&&reader[i].bilet==bilet){
                            reader[i].printStatus();
                            found=true;
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Такого читателя нет.");

                    }
                    break;

                }
                case 5:{

                    for (Reader r:reader){
                        if (r!=null) {
                            r.printStatus();

                        }
                    }
                    break;
                }
                case 6:{
                    System.out.println("Программа завершена.");
                    break;
                }
                default:{
                    System.out.println("Нет такой команды");
                }

            }
        }
        while (action!=6);



    }
}