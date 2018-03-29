/**
 * Created by ������������� on 29.03.2018.
 * ����� ��������� �������
 * @author Gurfinkel Mikhail
 * @since 28.03.2018
 */
public class Client {

    /*
    * ��� �������
    */
    private String name;
    /*
    * ������� �������
    */
    private Pet pet;

    /*
   * ����������� �� ���������.
   */
    public Client() {
    }

    /*
     * �����������.
     * @param id id �������
     * @param pet ������� �������
     */
    public Client(final String name,final Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    /*
    * �������� �������
    * @throws NullPointerException - ��� �������
    */
    public Pet getPet() throws NullPointerException {
        String exceptionText = "������� �����������.";
        try {
            Pet pet = this.pet;
        }catch (NullPointerException e){
            System.out.println(exceptionText);
        }
            return this.pet;
    }

    /*
    * �������� ��� �������
    */
    public String getName() {
        return name;
    }

    public void removePet(){
        this.pet = null;
    }
}
