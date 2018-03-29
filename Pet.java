/**
 * Created by Администратор on 28.03.2018.
 *
 * @author Gurfinkel Mikhail
 * @since 28.03.2018
 */

public class Cat implements Pet {


    /*
    * Базовая реализация питомца
    */
    private final Pet pet;

    /*
    * Конструктор.
    * @param pet Базовая реализация питомца
    */
    public Cat(final Pet pet) {
        this.pet = pet;
    }

    /*
     * Поймать мышь
     */
    public void catchMouse() {
        System.out.println("Mouse is catched");
    }


    /*
    * {@inheritDoc}
    */
    @Override
    public void makeSound() {
        System.out.println(String.format("May %s", this.pet.getName()));
    }

    /*
    * {@inheritDoc}
    */
    @Override
    public String getName() {
        return this.pet.getName();
    }

    /*
    * {@inheritDoc}
    */
    @Override
    public void setName(final String name) {
        this.pet.setName(name);
    }

    /*
        * {@inheritDoc}
        */
    @Override
    public String toString() {
        return "Кот";
    }
}