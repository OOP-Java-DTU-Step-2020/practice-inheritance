package org.itstep.task02;


// @formatter:off
/**
 * Задание 2
 *
 * 1) Создайте класс EmployeeAndTax
 * 2) Отнаследуйтесь от класса Employee
 * 3) Реализуйте нужные конструкторы
 * 4) Добавьте защищенное поле налога (tax)
 * 5) Создайте геттер для tax
 * 6) Переопределите метод setPaymentType(), который задает налог в зависимости от вида оплаты
 * 7) Переопределите метод getPaymentWithTax(), который должен возвращать К оплате (т.е. сумму с учетом налогов)
 * 8) Переопределите метод toString(), который должен возвращать строку вида: ФИО | Налог, % | Сумма | К оплате
 * 9) Раскомментируйте код в методе main()
 *
 * Запустите, ожидается вывод:

 ФИО    |  Налог, % | Сумма (грн) | К оплате (грн)
 ---------|-----------|-------------|---------------
 Иванов  |       15% | 3000.0      | 2550.0
 Сидоров |       20% | 800.0       |  640.0
 Петров  |       15% | 5500.0      | 4675.0
 Итого   |           |             | 7865.0
 */
// @formatter:on

public class Main {
    public static void main(String[] args) {
        // FIXME: Раскомментируйте код
//        Employee[] employees = { // Обратите внимание, что мы создаем массив типа Employee, и помещаем данные
//                                   // типа EmployeeAndTax! Подумайте, почему такое возможно?
//                new EmployeeAndTax("Иванов", PaymentTypes.RATE, 3000),
//                new EmployeeAndTax("Сидоров", PaymentTypes.HOURLY, 800),
//                new EmployeeAndTax("Петров", PaymentTypes.JOB_PRICE, 5500)
//        };
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
