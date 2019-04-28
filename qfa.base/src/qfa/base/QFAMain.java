package qfa.base;

public class QFAMain {

	public static void main(String[] args) {
		try {
			QFAMain main = new QFAMain();
			main.addShutdownHook();
			main.initialize();
		} catch(Throwable t) {
			System.err.println("Fatal exception during main: " + t.getMessage());
			t.printStackTrace(System.err);
			QFAMain.shutdown(-1);
		}
	}

	private void initialize() {
		initializeUI();
	}
	
	private void initializeUI() {
		// TODO add UI here
	}

	private static void shutdown() {
		System.exit(0);
	}
	
	private static void shutdown(int exitCode) {
		System.exit(exitCode);
	}
	
	private void addShutdownHook() {
		Runtime.getRuntime().addShutdownHook(new ShutdownHook());
	}

	private class ShutdownHook extends Thread {
		@Override
		public void run() {
			shutdown();
		}
	}
}
