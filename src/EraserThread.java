

class EraserThread implements Runnable {
    private boolean stop;


    public EraserThread(String prompt) {
        System.out.print(prompt);
    }

    /**
     * Begin masking...display asterisks (*)
     */
    public void run () {
        stop = true;
        while (stop) {
            System.out.print("\010*");

            try {
                Thread.sleep(100);
            } catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    /**
     * Instruct the thread to stop masking
     */
    public void stopMasking() {
        this.stop = false;
    }
}
