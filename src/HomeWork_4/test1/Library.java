package HomeWork_4.test1;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;
        Reader[] readers = new Reader[10];



        do {
            System.out.println("1 -- Добавить нового читателя");
            System.out.println("2 -- Читатель хочет взять книгу");
            System.out.println("3 -- Читатель хочет вернуть книгу");
            System.out.println("4 -- Вывести статус читателя");
            System.out.println("5 -- Вывести статус всех читателей");
            System.out.println("6 -- выйти из программы");
            System.out.println("Выберите действие");
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1: {
                    boolean isFull = true;
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] == null) {
                            readers[i] = new Reader();
                            isFull = false;
                            break;
                        }
                    }
                    if (isFull) {
                        System.out.println("Количество читателей максимальное");
                    }
                    break;
                }

                case 2: {
                    System.out.println("Введите номер читательского билета");
                    int numberCardReader = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] != null && readers[i].numberCardReader == numberCardReader) {
                            found = true;
                            readers[i].takeBook();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Укажите название книги, которую желаете вернуть");
                    String str = scanner.nextLine();

                    System.out.println("Введите номер читательского билета");
                    int numberCardReader = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] != null && readers[i].numberCardReader == numberCardReader) {
                            found = true;
                            readers[i].returnBook(str);
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Введите номер читательского билета");
                    int numberCardReader = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] != null && readers[i].numberCardReader == numberCardReader) {
                            found = true;
                            readers[i].printStatus();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 5: {
                    for (Reader r: readers) {
                        if (r != null){
                            r.printStatus();
                        }
                    }
                }
                case 6: {
                    System.out.println("Завершить программу");
                    break;

                }
                default: {
                    System.out.println("Нет такой команды");
                }

            }
        }while (action !=6);

        String nameBook = readers[0].booksList[0].autorName;
        System.out.println(nameBook);
    }

}
