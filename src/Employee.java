public class Employee {
    public Employee(String lastNameFirstName) {
        this.lastNameFirstName = lastNameFirstName;

    }

    private String lastNameFirstName;
    private static Integer idCounter = 1; // статический счетчик для id

    public String getLastNameFirstName() {
        return this.lastNameFirstName;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверка на null
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;
        if (!this.lastNameFirstName.equals(other.lastNameFirstName)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        if (lastNameFirstName == null) {
            result = 0;
        } else {
            result = lastNameFirstName.hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Сотрудник:" + lastNameFirstName + ".";
    }
}
