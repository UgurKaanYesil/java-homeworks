package Odev17;

import java.sql.*;

public class DatabaseExample {
    // MySQL yerel veritabanı bağlantı bilgileri - docker dersi için oluşturulmuştu
    static final String LOCAL_DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    static final String USER = "root";
    static final String PASSWORD = "adminpassw0rd";

    // Uzak veritabanı bağlantı bilgileri
    static final String REMOTE_DB_URL = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11678198";
    static final String REMOTE_USER = "sql11678198";
    static final String REMOTE_PASSWORD = "wVJ6TIBGWB";

    public static void main(String[] args) {
        try {
            // MySQL yerel veritabanına bağlan
            Connection localConnection = DriverManager.getConnection(LOCAL_DB_URL, USER, PASSWORD);
            System.out.println("Yerel veritabanına bağlandı.");

            // Tablo oluştur
            createTable(localConnection);

            // Uzak veritabanına bağlan
            Connection remoteConnection = DriverManager.getConnection(REMOTE_DB_URL, REMOTE_USER, REMOTE_PASSWORD);
            System.out.println("Uzak veritabanına bağlandı.");

            // CRUD işlemlerini JDBI kullanarak gerçekleştir
            executeCRUD(remoteConnection);

            // Bağlantıları kapat
            localConnection.close();
            remoteConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS ad_soyad (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "ad VARCHAR(50)," +
                "soyad VARCHAR(50))";
        Statement statement = connection.createStatement();
        statement.execute(createTableSQL);
        System.out.println("Tablo oluşturuldu.");


        String insertDataSQL = "INSERT INTO ad_soyad (ad, soyad) VALUES " +
                "('John', 'Doe')," +
                "('Jane', 'Doe')," +
                "('Alice', 'Smith')";
        statement.executeUpdate(insertDataSQL);
        System.out.println("Örnek veri girişi yapıldı.");
    }

    static void executeCRUD(Connection connection) throws SQLException {
        String deleteDataSQL = "DELETE FROM ad_soyad WHERE id = 1";
        Statement statement = connection.createStatement();
        int rowsAffected = statement.executeUpdate(deleteDataSQL);
        System.out.println(rowsAffected + " satır silindi.");
    }
}
