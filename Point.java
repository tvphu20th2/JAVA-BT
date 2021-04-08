package bai_1;

import java.util.Scanner;

public class Point {
	private String tenDiem;
	private double tungDo;
	private double hoanhDo;
	public String getTenDiem(){
		return tenDiem;
	}
	public void setTenDiem(String tenDiem){
		this.tenDiem= tenDiem;
	}
	public double getTungDo(){
		return tungDo;
	}
	public void setTungDo(double tungDo){
		this.tungDo =tungDo;
	}
	public double getHoanhDo() {
		return hoanhDo;
	}
	public void setHoanhDo(double hoanhDo) {   
		this.hoanhDo = hoanhDo;
	}
	public Point(){
		this.setTenDiem("A");
		this.setHoanhDo(0.0);
		this.setTungDo(0.0);
	}
	public Point(String tend, double tdo, double hdo){
		this.setTenDiem("Noname");
		this.setHoanhDo(hdo);
		this.setTungDo(tdo);
	}
	public Point(String tend, double tdo, double hdo){
		this.setTenDiem(tend);
		this.setHoanhDo(hdo);
		this.setTungDo(tdo);
	}
	public void nhapDiem(){
		String tend;
		double tdo,hdo;
		int num;
		Scanner n= new Scanner(System.in);
		System.out.print("Nhap ten diem: ");
		tend = n.nextLine();
		this.setTenDiem(tend);
		System.out.print("Hoanh do: ");
		hdo = n.nextDouble();
		this.setHoanhDo(hdo);
		System.out.print("Nhap Tung do: ");
		tdo = n.nextDouble();
		this.setTungDo(tdo);
	}
	public void Hienthi(){
		System.out.println("Point: "+this.getTenDiem() + " at (" + this.getHoanhDo() + ","+this.getTungDo()+")");
	}
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.Hienthi();
		Point p2 = new Point(2.5,8.9);
		Point p3 =new Point("D",2.5,8.9);
		p3.Hienthi();
		Point p4 = new Point();
		p4.nhapDiem();
		p4.hienThi(); 
	}

}
