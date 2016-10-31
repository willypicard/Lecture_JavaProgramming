package pl.kti.cp.lang;

import java.io.IOException;


public class RuntimeExample {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Total memory: \t"+(rt.totalMemory()/1024)+"kB");
		System.out.println("Free memory: \t"+rt.freeMemory()/1024+"kB");
		System.out.println("Max memory: \t"+rt.maxMemory()/1024+"kB");
		
		String programName = "C:\\Program Files\\Mozilla Firefox 4.0 Beta 11\\firefox.exe";
		try {
			System.out.print("Executing "+programName+" ... ");
			Process process = rt.exec(programName);
			System.out.println("Done");
			process.waitFor();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
