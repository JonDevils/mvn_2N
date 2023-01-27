package web.model;

public class Car {
    private String  model;
    private int age;
    private String number;

    public Car() {
    }

    public Car(String model, int age, String amount) {
        this.model = model;
        this.age = age;
        this.number = amount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model= '" + model + '\'' +
                ", age= " + age +
                ", number= " + number +
                '}';
    }
}
