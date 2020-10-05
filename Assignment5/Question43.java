class OneBHK
	{
		float roomArea,hallArea,price;
		OneBHK()
		{
			roomArea=100;
			hallArea=200;
			price=10000;
		}
		OneBHK(float roomArea,float hallArea,float price)
		{
			this.roomArea=roomArea;
			this.hallArea=hallArea;
			this.price=price;
		}
		void show()
		{
			System.out.println("Room Area : "+roomArea);
			System.out.println("Hall Area : "+hallArea);
			System.out.println("Price : "+price);
		}	
	}


	class TwoBHK extends OneBHK
	{
		float room2Area;
		static float sum=0;
		TwoBHK()
		{
			room2Area=100;
		}
		TwoBHK(float roomArea,float room2Area,float hallArea,float price)
		{
			this.roomArea=roomArea;
			this.hallArea=hallArea;
			this.room2Area=room2Area;
			this.price=price;
			
			sum+=price;
		}
		void show()
		{
			System.out.println("Room Area : "+roomArea);
			System.out.println("Room Area : "+room2Area);
			System.out.println("Hall Area : "+hallArea);
			System.out.println("Price : "+price);
		}	
	}


	class Question43
	{
		public static void main(String args[])
		{
			float sum;
			TwoBHK B1=new TwoBHK(150,100,250,10000);
			TwoBHK B2=new TwoBHK(250,250,300,20000);
			TwoBHK B3=new TwoBHK(250,300,400,30000);
			System.out.println("Flat 1 info : ");
			B1.show();
			System.out.println("\n Flat 2 info : ");
			B2.show();
			System.out.println("\n Flat 3 info : ");
			B3.show();
			
			sum=TwoBHK.sum;
			System.out.println("\n\n Total price : "+sum);
		}
	}