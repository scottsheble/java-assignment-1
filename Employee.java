package q02;
import java.text.DecimalFormat;
public class Employee extends Person {
    private double hour;
    private double rate;
    private double payment;

    public Employee() {}
    public Employee(String name, int age, String gender, double hour, double rate ) {
        super(name, age, gender);
        this.hour = hour;
        this.rate = rate;
    }

    public double getHour() {return hour;}

    public double getRate() {return rate;}

    public double getPayment() {
        this.payment = hour * rate;
        return payment;
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return super.toString() + ", Hour: " + df.format(hour)
                + ", Rate: " + df.format(rate) + ", Payment: "
                + df.format(getPayment()) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        if (hour != other.hour) {
            return false;
        }
        if (rate != other.rate) {
            return false;
        }
        if (payment != other.payment) {
            return false;
        }
        return super.equals(obj);
    }
}
