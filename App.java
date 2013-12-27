public class App {

    public static void main(String[] args) {

	
	//sth new here
        System.out.println("Hello World!");

        VerboseThreadPoolExecutor pool = new VerboseThreadPoolExecutor(3, 1);
        
        for (int i = 0; i < 10; ++i) {
            System.out.println("Adding thread #" + i);
            pool.execute(new MyThread(i));
        }
        pool.logMetrics("this lin has changed");		

        pool.shutdown();

    }

}
