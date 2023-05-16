public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        task4();
        task5();

    }

    public static void task1_2 () {
        System.out.println("Задача 1-2");
    //Напишите программу, которая определяет, чем пользуется клиент
        // (iOS или Android), и выдает соответствующее сообщение:

        int versia = 0;
        int clientDeviceYear = 2015;
        if (versia == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android.");
            }
            else {
                System.out.println("Установите обычную версию для Android.");
            }

        }

        else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для iOS.");
            }
            else {
                System.out.println("Установите обычную версию для iOS.");
            }
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
    //Напишите программу, которая определяет, является ли год високосным или нет.

        int year = 2003;
        if (year%400 == 0 || year%4 == 0 && year%100 != 0) {
            System.out.println(year + "-й год является високосным.");
        } else {
            System.out.println(year + "-й год HE является високосным.");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
    //Напишите программу, которая выдает сообщение в консоль:
    // "Потребуется дней: " + срок доставки.
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Для доставки потребуется дней: 1.");
        }   else if (deliveryDistance < 60) {
            System.out.println("Для доставки потребуется дней: 2.");
            } else if (deliveryDistance < 100) {
            System.out.println("Для доставки потребуется дней: 3.");
            } else {
            System.out.println("Доставки нет.");
        }
    }


    public static void task5 () {
        System.out.println("Задача 5");
        //Напишите программу, которая определяет по номеру месяца в году,
        // к какому сезону этот месяц принадлежит.
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "-й месяц это зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц это весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц это лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц это осень.");
                break;

            default:
                System.out.println("Такого месяца не существует!");
        }

    }








}