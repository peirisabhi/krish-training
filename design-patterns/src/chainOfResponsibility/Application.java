package chainOfResponsibility;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 15/03/2022
 * Time: 1:30 pm
 */
public class Application {
    public static void main(String[] args) {

        Tax tax = new Tax();
        VAT vat = new VAT();
        NBT nbt = new NBT();
        BTT btt = new BTT();
        SSF ssf = new SSF();

        tax.setSuccessor(vat);
        vat.setSuccessor(nbt);
        nbt.setSuccessor(btt);
        btt.setSuccessor(ssf);

        Invoice invoice1 = new Invoice(1, 50);
        System.out.println(tax.applyTax(invoice1));

        Invoice invoice2 = new Invoice(2, 150);
        System.out.println(tax.applyTax(invoice2));

        Invoice invoice3 = new Invoice(3, 250);
        System.out.println(tax.applyTax(invoice3));

        Invoice invoice4 = new Invoice(4, 350);
        System.out.println(tax.applyTax(invoice4));

        Invoice invoice5 = new Invoice(5, 450);
        System.out.println(tax.applyTax(invoice5));

        Invoice invoice6 = new Invoice(6, 550);
        System.out.println(tax.applyTax(invoice6));


    }
}
