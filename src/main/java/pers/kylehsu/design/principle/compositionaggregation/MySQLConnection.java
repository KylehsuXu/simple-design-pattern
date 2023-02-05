package pers.kylehsu.design.principle.compositionaggregation;

/**
 * Created by kylehsu
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
