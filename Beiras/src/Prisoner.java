public class Prisoner {
    private String id;
    private String name;
    private String age;

    public Prisoner(String data) {
        String[] splittedData = data.split(",");

        this.id = splittedData[0];
        this.name = splittedData[1];
        this.age = splittedData[2];
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id + ',' + name + ',' + age;
    }
}
