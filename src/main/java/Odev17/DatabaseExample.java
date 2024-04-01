package Odev17;

import java.sql.*;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.mapper.reflect.BeanMapper;

public class DatabaseExample {
    // MySQL yerel veritabanı bağlantı bilgileri - docker dersi için oluşturulmuştu
    static final String LOCAL_DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    static final String USER = "root";
    static final String PASSWORD = "adminpassw0rd";

    // Uzak veritabanı bağlantı bilgileri
    static final String REMOTE_DB_URL = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11683450";
    static final String REMOTE_USER = "sql11683450";
    static final String REMOTE_PASSWORD = "zJJDHznSQU";

    public static void main(String[] args) {
        // MySQL yerel veritabanına bağlan
        try (Connection localConnection = DriverManager.getConnection(LOCAL_DB_URL, USER, PASSWORD)) {
            System.out.println("Yerel veritabanına bağlandı.");

            // Tablo oluştur
            createTable(localConnection);

            // Uzak veritabanına bağlan
            Jdbi jdbi = Jdbi.create(REMOTE_DB_URL, REMOTE_USER, REMOTE_PASSWORD)
                    .registerRowMapper(BeanMapper.factory(Person.class));

            try (Handle handle = jdbi.open()) {
                System.out.println("Uzak veritabanına bağlandı.");

                // Veri ekle
                handle.execute("INSERT INTO ad_soyad (ad, soyad) VALUES (?, ?)", "John", "Doe");
                handle.execute("INSERT INTO ad_soyad (ad, soyad) VALUES (?, ?)", "Jane", "Doe");
                handle.execute("INSERT INTO ad_soyad (ad, soyad) VALUES (?, ?)", "Alice", "Smith");

                // Veriyi sil
                int deletedRows = handle.execute("DELETE FROM ad_soyad WHERE id = ?", 1);
                System.out.println(deletedRows + " satır silindi.");

                // Verileri görüntüle
                handle.createQuery("SELECT * FROM ad_soyad")
                        .mapTo(Person.class)
                        .list()
                        .forEach(System.out::println);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Tablo oluştur
    static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS ad_soyad (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "ad VARCHAR(50)," +
                "soyad VARCHAR(50))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
            System.out.println("Tablo oluşturuldu.");
        }

        // Örnek veri girişi yap
        String insertDataSQL = "INSERT INTO ad_soyad (ad, soyad) VALUES " +
                "('John', 'Doe')," +
                "('Jane', 'Doe')," +
                "('Alice', 'Smith')";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(insertDataSQL);
            System.out.println("Örnek veri girişi yapıldı.");
        }
    }

    // POJO sınıfı
    public static class Person {
        private int id;
        private String ad;
        private String soyad;

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", ad='" + ad + '\'' +
                    ", soyad='" + soyad + '\'' +
                    '}';
        }
    }
}
