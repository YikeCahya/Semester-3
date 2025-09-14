public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 30) {
            age = 30; // batas maksimal
        } else if (newAge < 18) {
            age = 18; // batas minimal
        } else {
            age = newAge;
        }
    }
}
