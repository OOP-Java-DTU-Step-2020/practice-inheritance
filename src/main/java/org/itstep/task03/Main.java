package org.itstep.task03;

// @formatter:off
/**
 * Задание 3
 *
 * 1) Создайте класс EmployeeAndChild, наследник EmployeeAndTax
 * 2) Реализуйте нужные конструкторы
 * 3) Добавьте логическое поле hasChild
 * 4) Добавьте дополнительный конструктор, который помимо ФИО, вида оплаты и суммы принимает
 * есть ли дети у сотрудника
 * 5) Добавить геттеры и сеттеры для поля hasChild
 * 6) Раскомментируйте код в методе main()
 *
 * Запустите, ожидается вывод:

 ФИО    |  Налог, % | Сумма (грн) | К оплате (грн)
 ---------|-----------|-------------|---------------
 Иванов  |       15% | 3000.0      | 2550.0
 Сидоров |       20% | 800.0       |  640.0
 Петров  |       20% | 5500.0      | 4400.0
 Итого   |           |             | 7590.0
 */
// @formatter:on

public class Main {
    public static void main(String[] args) {
        // FIXME: Раскомментируйте код
//        Employee[] employees = {
//                new EmployeeAndChild("Иванов", PaymentTypes.RATE, 3000, true),
//                new EmployeeAndChild("Сидоров", PaymentTypes.HOURLY, 800, true),
//                new EmployeeAndChild("Петров", PaymentTypes.JOB_PRICE, 5500)
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
