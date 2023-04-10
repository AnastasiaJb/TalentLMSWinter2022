package eShopTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Funktional2 extends BaseTest{

    @BeforeMethod
    public void openCatalog(){
        System.out.println("Переход в каталог");
    }


    @Test (description = "Это тест проверяет что то, здесь пишем его описание ", priority = 0)
    public void test21(){
        System.out.println("Проверка цены продукта");
    }

    @Test
    public void test22(){
        System.out.println("Проверка названия продукта");
    }
}
