/**
 * Created by Администратор on 29.03.2018.
 * Класс описывает клинику
 * @author Gurfinkel Mikhail
 * @since 28.03.2018
 */
public class Client {

    /*
    * Имя клиента
    */
    private String name;
    /*
    * Питомец клиента
    */
    private Pet pet;

    /*
   * Конструктор по умолчанию.
   */
    public Client() {
    }

    /*
     * Конструктор.
     * @param id id клиента
     * @param pet питомец клиента
     */
    public Client(final String name,final Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    /*
    * Получить питомца
    * @throws NullPointerException - нет питомца
    */
    public Pet getPet() throws NullPointerException {
        String exceptionText = "Питомец отсутствует.";
        try {
            Pet pet = this.pet;
        }catch (NullPointerException e){
            System.out.println(exceptionText);
        }
            return this.pet;
    }

    /*
    * Получить имя клиента
    */
    public String getName() {
        return name;
    }

    public void removePet(){
        this.pet = null;
    }
}
