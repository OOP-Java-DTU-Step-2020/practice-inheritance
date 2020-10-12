package org.itstep.task06;

// @formatter:off
import org.itstep.PaymentTypes;import org.itstep.task01.Employee; /**
 * Задание 6
 *
 * 1) Создайте класс EmplyeeAndBonus
 * 2) Добавьте приватное поле workHours
 * 3) Реализуйте нужные конструкторы
 * 4) Реализуйте геттер и сеттер для workHours
 * 5) Переопределите метод toString() для вывода данных о сотруднике с учетом бонусов при работе более 200 часов
 * 6) Раскомментируйте код в методе main()
 *
 * Запустите, ожидается вывод:

 ФИО    |  Налог, % | Сумма (грн) | К оплате (грн)
 ---------|-----------|-------------|---------------
 Иванов  |       15% | 3600.0      | 3060.0
 Сидоров |       20% | 800.0       | 320.0 / 40.0
 Петров  |       20% | 6600.0      | 5280.0
 Итого   |           |             | 11000.0

 */
// @formatter:on

public class Main {
    public static void main(String[] args) {
        // FIXME: Раскомментируйте код
//        Employee[] employees = {
//                new EmplyeeAndBonus("Иванов", PaymentTypes.RATE, 3000, true, 201),
//                new EmplyeeAndBonus("Сидоров", PaymentTypes.HOURLY, 800, true,120),
//                new EmplyeeAndBonus("Петров", PaymentTypes.JOB_PRICE, 5500, 230)
//        };
//        ((EmplyeeAndBonus)(employees[employees.length/2])).setTugrikExchange(8);
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
