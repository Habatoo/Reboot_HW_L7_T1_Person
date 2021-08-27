package Laptenkov;

import java.util.Objects;

/**
 * Класс {@link Person} реализует интерфейс Comparable<Person>,
 * который обеспечивает следующий порядок:
 * Сортировка сначала по полю city,
 * а затем по полю name.
 * Поля name, city отличны от null.
 */
public class Person implements Comparable<Person>{
    String name;
    String city;
    int age;

    /**
     * Конструктор объекта типа {@link Person}.
     * @param name строковое имя (не null).
     * @param city строковое название города (не null).
     * @param age возраст - целое число.
     */
    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    /**
     * Метод {@link Person#compareTo} сравнивает с текущим объектом
     * переданный объект типа {@link Person}.
     * Сортировка сначала по полю city, затем по полю name
     * @param o объект для сравнения.
     * @return положительное если сравниваемый объект больше,
     * отрицательное число если сравниваемый объект меньше и ноль если равен.
     */
    @Override
    public int compareTo(Person o) {
        int result = 0;
        result = this.city.compareToIgnoreCase(o.city);
        if (result == 0) {
            result = this.name.compareToIgnoreCase(o.name);
        }
        return result;
    }

    /**
     * Метод {@link Person#equals} проверяет идентичность объектов типа {@link Person}.
     * @param o объект для сравнения.
     * @return <code>true</code> если объекты идентичны по полям age, name, city.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(city, person.city);
    }

    /**
     * Метод {@link Person#hashCode} считает hashCode по полям объекта типа {@link Person}.
     * @return целое число посчитанное по значению полей age, name, city.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, city, age);
    }

    /**
     * Метод {@link Person#toString} возвращает строкове представление объекта типа {@link Person}.
     * @return строка объекта.
     */
    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", city=" + city +
                ", age=" + age +
                '}';
    }
}
