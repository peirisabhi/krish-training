package chainOfResponsibility;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 15/03/2022
 * Time: 3:25 pm
 */
public class Tax extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        return successor.applyTax(invoice);
    }
}
