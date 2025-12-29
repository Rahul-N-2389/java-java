package com.inheritance.five;

public class Computer {
	String BrandName ;
	
	
	

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String BrandName) {
		this.BrandName = BrandName;
		showBrand();
	}
	
	public void showBrand() {
		System.out.println("Brand Name : "+ BrandName );
		
	}

}
	class Laptop extends Computer {
		
		String ModelName;
		
		public String getModel() {
			return ModelName;
			
		}

		public void setModel(String ModelName) {
			this.ModelName = ModelName;
			showModel();
		}
		
		
		public void showModel() {
			System.out.println("Model Name : "+ModelName);
		}
		
		
		public static void main (String[]args) {
			Laptop obj = new Laptop();
			obj.setBrandName("Dell");
			obj.setModel("XPS15");
			
		}
	}


