/**
 * Created by ������������� on 29.03.2018.
 * @author Gurfinkel Mikhail
 * @since 29.03.2018
 */
public class CatDog implements Pet {

    /*
    * ������� ���������� ����
    */
    private final Cat cat;
    /*
     * ������� ���������� ������
     */
    private final Dog dog;

    /*
    * �����������.
    * @param cat ������� ���������� ����
    * @param dog ������� ���������� ������
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
        return "������";
    }
}
