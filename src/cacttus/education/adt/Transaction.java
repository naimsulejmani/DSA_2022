package cacttus.education.adt;

public class Transaction {

    private String who;
    private Date when;
    private double amount;

    public Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    //Naim Sulejmani,20.02.2022, 234.23
    //Omer Shaqiri, 23.03.2022, 1023.23
    public Transaction(String transaction) {
        String[] splitTransaction = transaction.split(",");

        if (splitTransaction.length == 3) {
            this.who = splitTransaction[0];
            this.when = new Date(splitTransaction[1]);
            this.amount = Double.parseDouble(splitTransaction[2]);
        } else {
            System.out.println("Transaksioni nuk eshte dhene ne formatin e duhur!");
            System.out.println("Formati eshte:");
            System.out.println("who,when,amount");
        }
    }

    public String who() {
        return who;
    }

    public Date when() {
        return when;
    }

    public double amount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%.2f", who, when, amount);
    }
}






