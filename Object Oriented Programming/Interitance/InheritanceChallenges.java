
public class InheritanceChallenges {

    static class Account {
        String accountNumber;
        String name;
        String address;
        String phoneNumber;
        String dayOfBirth;
        Double balance;

        public Double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getDayOfBirth() {
            return dayOfBirth;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhoneNumber(String number) {
            phoneNumber = number;
        }

        public void setDayOfBirth(String dob) {
            dayOfBirth = dob;
        }

        public Account(String accNo, String name, String address, String phno, String dob, Double balance) {
            this.accountNumber = accNo;
            this.name = name;
            this.address = address;
            this.phoneNumber = phno;
            this.dayOfBirth = dob;
            this.balance = balance;
        }
    };

    static class SavingsAccount extends Account {
        public SavingsAccount(String accNo, String name, String address, String phno, String dob, Double balance) {
            super(accNo, name, address, phno, dob, balance);
        }

        public void deposit(double amount) {
            this.balance += amount;
        }

        public void withdraw(double amount) {
            if (amount > this.balance) {
                System.out.printf("You cannot withdraw more than %f\n", this.balance);
            } else {
                this.balance -= amount;
            }
        }

        public void fixedDeposit() {
            balance += 100;
        }

        public void liquidate() {
            balance = 0.0;
        }
    };

    static class LoanAccount extends Account {
        public LoanAccount(String accNo, String name, String address, String phno, String dob, Double balance) {
            super(accNo, name, address, phno, dob, balance);
        }

        public void payEMI(double amount) {
            this.balance -= amount;
        }

    }

    public static void main(String args[]) {
        SavingsAccount sv = new SavingsAccount("123456789", "Thong Nguyen", "12345 Little Street", "900-800-900",
                "05-26-1998", 200.0);
        System.out.println(sv.getBalance());
        sv.deposit(200);
        sv.fixedDeposit();
        System.out.println(sv.getBalance());
        sv.withdraw(900);
        System.out.println(sv.getBalance());

    }
}
