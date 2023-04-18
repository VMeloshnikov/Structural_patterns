package org.example;

import org.example.composite.Department;
import org.example.composite.Employee;
import org.example.facade.SalaryConstructor;

public class Main {
    public static void main(String[] args) {
        /**Вызываем фасад*/

        SalaryConstructor salaryConstructor = new SalaryConstructor();
        salaryConstructor.salaryConstruct();
        //через фасад мы упростили жизнь сотруднику. И он может выполнив 1 действие
        //выполнить так же скрытые действия, которые ему не интересны, и получить результат.

        /**Реализуем паттерн компоновщик*/
        // Создаем иерархию отделов и сотрудников:

        Employee developer1 = new Employee(" Bill Gates", "Developer");
        Employee developer2 = new Employee(" Pavel Durov", "Developer");
        Employee developer3 = new Employee(" Mark Zuckerberg", "Developer");

        Department developmentDepartment = new Department("Development");
        developmentDepartment.addComponent(developer1);
        developmentDepartment.addComponent(developer3);

        Department frontDeveloperDepartment = new Department("FrontDevelopment");
        frontDeveloperDepartment.addComponent(developer2);

        developmentDepartment.addComponent(frontDeveloperDepartment);
        Employee manager1 = new Employee("Steve Jobs", "Manager");

        Department managementDepartment = new Department("Management");
        managementDepartment.addComponent(manager1);

        Department company = new Department("Company");
        company.addComponent(developmentDepartment);
        company.addComponent(managementDepartment);

        company.displayInfo();

    }
}