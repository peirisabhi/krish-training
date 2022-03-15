package memento;

import java.util.Stack;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 15/03/2022
 * Time: 6:41 pm
 */
public class CareTaker {

    Stack<Cart.CartMemento> history = new Stack<>();

    public void save(Cart cart){
        history.push(cart.save());
    }

    public void revert(Cart cart){
        if(!history.isEmpty())
            cart.revert(history.pop());
        else
            System.out.println("Cannot undo");
    }
}
