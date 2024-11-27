package OverrideOverload;

public class Main {
    public static void main(String[] args) {
        System.out.println("program testing class Manager dan Staff");
        Manager[] man = new Manager[2];
        Staff[] st1 = new Staff[2];
        Staff[] st2 = new Staff[3];

        man[0] = new Manager("Siti", "11111111", "1", 500000, "Administrasi");

        man[1] = new Manager("Rudi", "22222222", "2", 1000000, "Pemasaran");

        st1[0] = new Staff("Sari", "33333333", "1", 10, 50000);

        st1[1] = new Staff("Hasan", "44444444", "2", 5, 100000);

        st2[0] = new Staff("Dewi", "55555555", "1", 7, 75000);

        st2[1] = new Staff("Faisal", "66666666", "2", 10, 125000);

        st2[2] = new Staff("Hana", "77777777", "1", 9, 110000);

        man[0].setStaff(st1);
        man[1].setStaff(st2);
        man[0].info();
        man[1].info();
    }
}

