package com.metanit;
/*Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
Конструктор класса должен заполнять эти поля при создании объекта;
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
Создать массив из 5 сотрудников
Пример: Person[] persArray = new Person[5]; //
Вначале объявляем массив объектов persArray[0] = new Person("Ivanov Ivan",
"Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой
ячейки массива задаем объект persArray[1] = new Person(...); ... persArray[4] = new Person(...);
С помощью цикла вывести информацию только о сотрудниках старше 40 лет;*/
public class Main {

    public static void main(String[] args) {
        //Иван - объект класса Сотрудник
	/*Employee Ivan = new Employee ("Boichenko Ivan", "intern", "79168848411@yandex.ru", "89168848411", 50000, 21);
	Ivan.Info();
	System.out.println(Ivan.GetAge());*/
	Employee arr[] = new Employee[5];
	arr[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
	arr[1] = new Employee("Boichenko Ivan", "intern", "79168848412@yandex.ru", "89168848412", 50000, 21);
	arr[2] = new Employee("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "1892312312", 40000, 40);
	arr[3] = new Employee("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "2892312312", 50000, 50);
	arr[4] = new Employee("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "3892312312", 60000, 60);

	for (int i = 0; i < 5; i++) {
        if (arr[i].GetAge() > 40) arr[i].Info();
    }
    }
}
