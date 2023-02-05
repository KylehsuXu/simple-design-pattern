package pers.kylehsu.design.principle.compositionaggregation;

/**
 * Created by kylehsu
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
