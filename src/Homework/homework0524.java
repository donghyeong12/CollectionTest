package Homework;import java.awt.RadialGradientPaint;

public class homework0524 {
	
	
	
	public enum Planet {	
		수성(2439), 금성(6052), 지구(6371), 화성(3390), 목성(69911), 토성(58232), 천왕성(25362), 해왕성(24622);

		private double radius;

		private Planet(double radius) {
			this.radius = radius;
		}

		public double getradius() {
			return radius;
		}

	}

	public static double diameter(double radius) {
		return (4*Math.PI*radius*radius);
	}
	
	public static void main(String[] args) {
		
		Planet myPlanet;
		
		myPlanet = Planet.valueOf("수성");
		Planet pp = Planet.valueOf("수성");
		System.out.println(myPlanet.name()+"반지름 : "+pp.radius+" 면적: "+diameter(pp.radius));
		
		myPlanet = Planet.valueOf("금성");
		Planet pp1 = Planet.valueOf("금성");
		System.out.println(myPlanet.name()+"반지름 : "+pp1.radius+" 면적: "+diameter(pp1.radius));
		
		myPlanet = Planet.valueOf("지구");
		Planet pp2 = Planet.valueOf("지구");
		System.out.println(myPlanet.name()+"반지름 : "+pp2.radius+" 면적: "+diameter(pp2.radius));
		
		myPlanet = Planet.valueOf("화성");
		Planet pp3=Planet.valueOf("화성");
		System.out.println(myPlanet.name()+"반지름 : "+pp3.radius+" 면적: "+diameter(pp3.radius));
		
		myPlanet = Planet.valueOf("목성");
		Planet pp4=Planet.valueOf("목성");
		System.out.println(myPlanet.name()+"반지름 : "+pp4.radius+" 면적: "+diameter(pp4.radius));
	
		myPlanet = Planet.valueOf("토성");
		Planet pp5=Planet.valueOf("토성");
		System.out.println(myPlanet.name()+"반지름: "+pp5.radius+" 면적: "+diameter(pp5.radius));
	
		myPlanet =Planet.valueOf("천왕성");
		Planet pp6=Planet.valueOf("천왕성");
		System.out.println(myPlanet.name()+"반지름: "+pp6.radius+" 면적: "+diameter(pp6.radius));
		
		myPlanet=Planet.valueOf("해왕성");
		Planet pp7=Planet.valueOf("해왕성");
		System.out.println(myPlanet.name()+"반지름: "+pp7.radius+" 면적: "+diameter(pp7.radius));
	}
	
	
}