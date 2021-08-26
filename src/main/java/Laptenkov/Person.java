package Laptenkov;

public class Person implements Comparable<Person>{
    /**
     * Метод {@link Person#compareTo} сравнивает с текущим объектом
     * переданный объект типа {@link Person}
     * @param o объект для сравнения.
     * @return положительное если сравниваемый объект больше,
     * отрицательное число если сравниваемый объект меньше
     * и ноль если равен.
     */
    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
