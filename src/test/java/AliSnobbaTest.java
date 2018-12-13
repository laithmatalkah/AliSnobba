import model.Cart;
import model.LineItem;
import model.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AliSnobbaTest {


    @Test
    public void emptyCartTest(){

        Cart expected =new Cart();

        Cart actual =new Cart();


        actual.setGrandTotal(0);
       assertEquals(expected.getId(),actual.getId());

    }

    @Test
    public void quantityTest(){
        Product product=new Product(12L,"Pant",23.78);
        LineItem lineItem=new LineItem(13L,product,1,23.78);
        List <LineItem> items=new ArrayList<>();
        items.add(lineItem);
        Cart cart =new Cart();
        cart.setItems(items);



        assertEquals(1,cart.getItems().get(0).getQuantity());

    }



}
