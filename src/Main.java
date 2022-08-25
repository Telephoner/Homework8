import java.time.LocalDate;

public class Main {
    public static void calculateLeapYear(int year) { //задание 1
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            isLeapYear = true;
            System.out.println("Этот год високосный");
        } else {
            isLeapYear = false;
            System.out.println("Этот год не високосный");
        }
    }

   // public static void defineOperationalSystem(int clientOS) {
   //     if (clientOS == 1) {
   //         System.out.println("Ваша операционная система — iOS.");
   //     } else if (clientOS == 0) {
   //         System.out.println("Ваша операционная система — Android.");
   //     } else {
   //         System.out.println("Ошибка! Операционная система не определена.");
   //     }
   // }

    public static void downloadAppVer(int clientOS, int clientDeviceYear) { //задание 2
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите  версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else {
            System.out.println("Неизвестная ошибка!");
        }
    }

    public static void calculateDeliveryTime(int deliveryDistance) { //задание 3
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("К сожалению, мы пока не доставляем к вам. :(");
        }
        System.out.println("Потребуется дней: " + deliveryDays);
    }


    public static void main(String[] args) {
        int year = 1952; //задание 1
        calculateLeapYear(year);

        int clientOS = 0; //задание 2
        int phoneAssembleYear = LocalDate.now().getYear();
        downloadAppVer(clientOS, phoneAssembleYear);

        int deliveryDistance = 100; //задание 3
        calculateDeliveryTime(deliveryDistance);
    }
}