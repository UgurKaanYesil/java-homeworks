package Odev12;

import java.util.Random;

public class ErrorGenerator {
    // Rastgele hata türleri için sabitler
    static final int NO_ERROR = 0;
    static final int INPUT_ERROR = 1;
    static final int EXTERNAL_ERROR = 2;
    static final int INTERNAL_ERROR = 3;

    // Hata olasılıkları
    static final double INPUT_ERROR_PROBABILITY = 0.2;
    static final double EXTERNAL_ERROR_PROBABILITY = 0.3;
    static final double INTERNAL_ERROR_PROBABILITY = 0.1;

    // Yöntemimiz, giriş parametrelerine ve dış faktörlere bağlı olarak belirli hata türlerini döndürebilir
    static int methodWithErrors(int input) {
        Random random = new Random();
        double randomNumber = random.nextDouble();

        if (randomNumber < INPUT_ERROR_PROBABILITY) {
            throw new InputErrorException(); // Giriş hatası
        } else if (randomNumber < INPUT_ERROR_PROBABILITY + EXTERNAL_ERROR_PROBABILITY) {
            throw new ExternalErrorException(); // Dış hata
        } else if (randomNumber < INPUT_ERROR_PROBABILITY + EXTERNAL_ERROR_PROBABILITY + INTERNAL_ERROR_PROBABILITY) {
            throw new InternalErrorException(); // İç hata
        } else {
            return NO_ERROR; // Hata yok
        }
    }
}
