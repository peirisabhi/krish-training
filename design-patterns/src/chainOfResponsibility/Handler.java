package chainOfResponsibility;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 15/03/2022
 * Time: 1:30 pm
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract double applyTax(Invoice invoice);

}
