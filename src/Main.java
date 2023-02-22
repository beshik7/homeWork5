 public class Main {
    public static void main(String[] args) {
                task1();
            }
            public static void task1() {
                    System.out.println(" Задача 1 ");
                System.out.print("Введите user-agent браузера: ");

                int clientOS = 0; // объявляем переменную clientOS


                // выводим сообщение в зависимости от значения переменной clientOS
                if (clientOS == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else if (clientOS == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Ваша операционная система не поддерживается");
                }
            }
 }

