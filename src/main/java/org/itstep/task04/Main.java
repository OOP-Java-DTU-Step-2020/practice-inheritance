package org.itstep.task04;

// @formatter:off
/**
 * Задание 4
 *
 * 1) Создайте класс EmployeeAndTugrik
 * 2) Реализуйте нужные конструкторы
 * 3) Добавьте приватное поле tugrickExchange
 * 4) Реализуйте геттер и сеттер для tugrickExchange
 * 5) Переопределите метод toString() для вывода данных о сотруднике с учетом выплаты в тугриках
 * 6) Раскомментируйте код в методе main()
 *
 * Запустите, ожидается вывод:

   ФИО    |  Налог, % | Сумма (грн) | К оплате (грн)
 ---------|-----------|-------------|---------------
 Иванов   |       15% | 3000.0      | 2550.0
 Сидоров  |       20% | 800.0       | 320.0 / 40.0
 Петров   |       20% | 5500.0      | 4400.0
 Итого    |           |             | 9300.0
 */
// @formatter:on

public class Main {
    public static void main(String[] args) {
        // FIXME: Раскомментируйте код
//        Employee[] employees = {
//                new EmployeeAndTugrik("Иванов", PaymentTypes.RATE, 3000, true),
//                new EmployeeAndTugrik("Сидоров", PaymentTypes.HOURLY, 800, true),
//                new EmployeeAndTugrik("Петров", PaymentTypes.JOB_PRICE, 5500)
//        };
//        ((EmployeeAndTugrik)(employees[employees.length/2])).setTugrikExchange(8);
//        System.out.println("  ФИО    |  Налог, % | Сумма (грн) | К оплате (грн)\n" +
//                "---------|-----------|-------------|---------------");
//        double sum = 0;
//        for (Employee employee : employees) {
//            System.out.println(employee);
//            sum += employee.getPayment();
//        }
//        System.out.println(" Итого   |           |             | " + sum);
    }
}
