/**
 * Created by Администратор on 29.03.2018.
 * @author Gurfinkel Mikhail
 * @since 29.03.2018
 */
public class CatDog implements Pet {

    /*
    * Базовая реализация кота
    */
    private final Cat cat;
    /*
     * Базовая реализация собаки
     */
    private final Dog dog;

    /*
    * Конструктор.
    * @param cat Базовая реализация кота
    * @param dog Базовая реализация собаки
    */
    public CatDog(final Cat cat, final Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    /*
     * {@inheritDoc}
     */
    @Override
    public void makeSound() {
        cat.makeSound();
        dog.makeSound();
    }

    /*
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return String.format("%s%s", cat.getName(), dog.getName());
    }

    /*
   * {@inheritDoc}
   */
    @Override
    public void setName(final String name) {
        this.cat.setName(name);
        this.dog.setName(name);
    }


    /*
    * {@inheritDoc}
    */
    @Override
    public String toString() {
        return "Котопёс";
    }
}
