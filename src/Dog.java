/**
 * Created by Администратор on 29.03.2018.
 *
 * @author Gurfinkel Mikhail
 * @since 28.03.2018
 */
public class Dog  implements Pet {


    /*
     * Базовая реализация питомца
     */
    private final Pet pet;

    /*
    * Конструктор.
    * @param pet Базовая реализация питомца
    */
    public Dog(final Pet pet) {
        this.pet = pet;
    }

    /*
     * {@inheritDoc}
     */
    @Override
    public void makeSound() {
        this.pet.makeSound();
        System.out.printf("Gav Gav");
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
        return "Собака";
    }
}
