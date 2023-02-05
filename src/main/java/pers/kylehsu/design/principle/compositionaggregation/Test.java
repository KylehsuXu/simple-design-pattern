package pers.kylehsu.design.principle.compositionaggregation;

/**
 * Created by kylehsu
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
