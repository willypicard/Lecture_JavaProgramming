package pl.kti.cp.lang;


public class StringExample {
	public static void main(String[] args){
		String name = "Willy-Picard";
		System.out.println("["+name+"] length= "+ name.length());
		
		int index = 0;
		System.out.println("["+name+"] chatAt("+index+")= "+name.charAt(index));
		
		index = name.indexOf("Pic");
		String first = name.substring(0, index);
		String last = name.substring(index);
		System.out.println(first);
		System.out.println(last);
		
		StringBuffer buff = new StringBuffer();
		buff.append("To be");
		buff.append(' ');
		buff.append("or not ");
		buff.append(2);
		buff.append("be");
		
		System.out.println(buff);
		System.out.println("===================");
		
		buff.append(System.getProperty("line.separator"));
		buff.append("That is the question");
		
		System.out.println(buff);
	}
}
