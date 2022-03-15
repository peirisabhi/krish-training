package chainOfResponsibility;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 15/03/2022
 * Time: 2:59 pm
 */
public class SSF extends Handler {
    @Override
    public double applyTax(Invoice invoice) {

        invoice.setTax(invoice.getTax() + invoice.getAmount() * 0.04);
        System.out.println("SSF Calculated");
        return invoice.getTax();

    }
}
