public class App {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        VerboseThreadPoolExecutor pool = new VerboseThreadPoolExecutor(3, 1);
        pool.logMetrics("App start");

        for (int i = 0; i < 10; ++i) {
            System.out.println("Adding thread #" + i);
            pool.execute(new MyThread(i));
        }

		//new line inserted to file
		
        pool.logMetrics("App stop");

        pool.shutdown();

    }

}
