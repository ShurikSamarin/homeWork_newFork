//Нарушен принцип единственной ответственности: класс занимается как добавлением Human, так и сортировкой
package model.family;
import model.family.iterators.HumanIterator;
import model.human.comparators.HumanComparatorByAge;
import model.human.comparators.HumanComparatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Family<E extends Subject> implements Iterable<E>, Serializable {
    private List<E> humanList;

    public Family() {
        humanList = new ArrayList<>();
    }

    public void addHuman(E human){

        humanList.add(human);
    }

    @Override
    public Iterator<E> iterator() {
        return new HumanIterator<>(humanList);
    }

    public void sortByName(){
        humanList.sort(new HumanComparatorByName<>());
    }

    public void SortByBirthdate(){
        humanList.sort(new HumanComparatorByAge<>());
    }
}
