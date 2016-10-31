package pl.kti.cp.example;


public interface IPrice extends Comparable<IPrice> {
	public float inEuro();
	public float inZloty();
	public void add(IPrice price);
}
