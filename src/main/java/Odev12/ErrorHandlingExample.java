package Odev12;

public class ErrorHandlingExample {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            try {
                ErrorGenerator.methodWithErrors(i);
                System.out.println("Herhangi bir hata yok.");
            } catch (InputErrorException e) {
                System.out.println("Giriş hatası oluştu.");
            } catch (ExternalErrorException e) {
                System.out.println("Dış hata oluştu.");
            } catch (InternalErrorException e) {
                System.out.println("İç hata oluştu.");
            }
        }
    }
}
