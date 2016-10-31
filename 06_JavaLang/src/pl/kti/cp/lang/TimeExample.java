package pl.kti.cp.lang;



public class TimeExample {

	public static void main(String[] args) {
		int nbOfIter = 10000;
		
		long duration = getDurationForLoop(nbOfIter);
		System.out.println(nbOfIter+" iterations in "+duration+"ms");
		
		nbOfIter = 100000;
		duration = getDurationForLoop(nbOfIter);
		System.out.println(nbOfIter+" iterations in "+duration+"ms");

	}

	private static long getDurationForLoop(int nbOfIter) {
		long currentTime = System.currentTimeMillis();
		
		for (int i = 0; i< nbOfIter; i++){
			@SuppressWarnings("unused")
			String string = ""+i;
		}
		
		long newCurrentTime = System.currentTimeMillis();
		long duration = newCurrentTime-currentTime;
		return duration;
	}
}
