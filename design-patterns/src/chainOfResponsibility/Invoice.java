package chainOfResponsibility;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 15/03/2022
 * Time: 1:33 pm
 */
public class Invoice {

    private int invoiceNo;
    private double amount;
    private double tax;

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Invoice(int invoiceNo, double amount) {
        this.invoiceNo = invoiceNo;
        this.amount = amount;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }
}
