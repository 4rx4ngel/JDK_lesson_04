public class Employee {
    private String name;
    private int personnelNumber;
    private String phoneNumber;
    private int experience;

    public Employee(String name, int personnelNumber, String phoneNumber,
    int experience) {
        this.name = name;
        this.personnelNumber = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Работник: " +
                "имя: " + name +
                ", табельный номер: " + personnelNumber +
                ", телефон: " + phoneNumber +
                ", стаж: " + experience + " года/лет";
    }
}
