package chainOfResponsibility;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 15/03/2022
 * Time: 1:35 pm
 */
public class VAT extends Handler {
    @Override
    public double applyTax(Invoice invoice) {

        invoice.setTax(invoice.getTax() + invoice.getAmount() * 0.01);
        System.out.println("Vat Calculated");

        if (invoice.getAmount() <= 100)
            return invoice.getTax();
        else
            return successor.applyTax(invoice);


    }
}
