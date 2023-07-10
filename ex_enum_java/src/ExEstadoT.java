public class ExEstadoT implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new ExEstadoT());
        thread.start();

        Thread.State estado = thread.getState();
        System.out.println("Estado inicial do thread: " + estado);

        try {
            Thread.sleep(1000); // Aguarda por 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        estado = thread.getState();
        System.out.println("Estado após dormir por 1 segundo: " + estado);
    }

    @Override
    public void run() {
        // Lógica do thread
        System.out.println("Thread em execução");
    }
}
