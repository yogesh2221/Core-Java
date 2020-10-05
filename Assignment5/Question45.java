import java.util.Scanner;
	class Student
	{
		int rollno;
		float percentage;
		
		Student()
		{
			rollno=1;
			percentage=75f;
		}
		Student(int rollno,float percentage)
		{
			this.rollno=rollno;
			this.percentage=percentage;
		}
		void show()
		{
			System.out.println("Roll no: "+rollno);
			System.out.println("Percentage: "+percentage);
		}
	}
	
	
	class CollegeStudent extends Student
	{
		int semester;
		
		CollegeStudent()
		{
			semester=1;
		}
		CollegeStudent(int rollno, float percentage,int semester)
		{
			super(rollno,percentage);
			this.semester=semester;
		}
		
		void show()
		{
			super.show();
			System.out.println("Semister : "+semester+"\n");
		}
	}
	
	
	class SchoolStudent extends Student
	{
		String className;
		
		SchoolStudent()
		{
			className="CS";
		}
		SchoolStudent(int rollno, float percentage,String className)
		{
			super(rollno,percentage);
			this.className=className;
		}
		
		void show()
		{
			super.show();
			System.out.println("Class Name : "+className+"\n");
			
		}
		
	}


	class Question45
	{
		public static void main(String args[])
		{
			int count=0;
			CollegeStudent c1=new CollegeStudent(90,90.18f,2);
			CollegeStudent c2=new CollegeStudent(91,63.0f,3);
			SchoolStudent s1=new SchoolStudent(92,87.36f,"Science");
			SchoolStudent s2=new SchoolStudent(93,85.56f,"Commerce");
			SchoolStudent s3=new SchoolStudent(94,95.19f,"Arts");
			
			Student ar[]=new Student[]{c1,c2,s1,s2,s3};
			
			for(Student ref: ar)
			{
				ref.show();
			}
			
			Scanner scan=new Scanner(System.in);
			System.out.print("\n\n Enter roll no.:");
			int rollno=scan.nextInt();
			
			for(Student ref: ar)
			{
				if(rollno==ref.rollno)
				ref.show();
			}
			
			for(Student ref: ar)
			{
				if(ref.percentage>75)
				count++;
			}
			System.out.print("Number of Students having A grade: "+count);
		}
	}		 