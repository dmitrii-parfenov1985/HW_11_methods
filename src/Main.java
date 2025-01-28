public class Main {
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkerOperationSystem(int operationSystem, int clientDeviceYear) {
        if (operationSystem == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operationSystem == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите приложение по ссылке");
        } else if (operationSystem == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        } else if (operationSystem == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите приложение по ссылке");
        }
    }

    public static int totalDays(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance > 20 && distance < 60) {
            return 2;
        } else if (distance > 60 && distance < 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        int currentYear = 2020;
        checkLeapYear(currentYear);

        System.out.println("\nЗадача 2");
        int operationSystem = 1;
        int clientDeviceYear = 2013;
        checkerOperationSystem(operationSystem, clientDeviceYear);

        System.out.println("\nЗадача 3");
        int distance = 70;
        int totalDays = totalDays(distance);
        System.out.println("Потребуется " + totalDays + " дня на доставку.");
    }
}