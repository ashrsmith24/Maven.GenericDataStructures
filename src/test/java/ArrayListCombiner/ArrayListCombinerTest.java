package ArrayListCombiner;

import Employee.Employee;
import Employee.Manager;
import org.junit.Test;

import org.junit.Assert;

import java.util.ArrayList;

public class ArrayListCombinerTest {
    Employee nae = new Employee("NAE", 100);
    Manager ash = new Manager("ASH", 100);
    @Test
    public void testExtendCombiner() throws Exception {
        // Given an array list with employees
        ArrayList<Employee> first = new ArrayList<>();
        first.add(nae);
        // An an array list with managers
        ArrayList<Manager> second = new ArrayList<>();
        second.add(ash);
        // When  I combine them
        ArrayListCombiner.extendCombiner(first, second);
        // Then I should get an arrayList with both
        ArrayList<Employee> expected = new ArrayList<>();
        expected.add(nae);
        expected.add(ash);
        Assert.assertEquals(expected, first);
    }

    @Test
    public void testSuperCombiner() throws Exception {
        // Given an array list with employees
        ArrayList<Employee> first = new ArrayList<>();
        first.add(nae);
        // An an array list with managers
        ArrayList<Manager> second = new ArrayList<>();
        second.add(ash);
        // When  I combine them
        ArrayListCombiner.superCombiner(first, second);
        // Then I should get an arrayList with both
        ArrayList<Employee> expected = new ArrayList<>();
        expected.add(nae);
        expected.add(ash);
        Assert.assertEquals(expected, first);
    }

}