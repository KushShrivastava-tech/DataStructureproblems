class Student {
    private int id;   // Step 1: Make variable private

    public void setId(int id) {   // Step 2: Setter to set value
        this.id = id;
    }

    public int getId() {          // Step 3: Getter to get value
        return id;
    }
}

public class Test {
    public static void main(String[] args) {

        // Step 4: Create object
        Student s = new Student();

        // Step 5: Use setter method (to give value)
        s.setId(10);

        // Step 6: Use getter method (to get value)
        System.out.println(s.getId());
    }
}







/*


class Student{
			private String name;    //Private data
			private int age;
			
			// Step 2: Public getter
			public String getName(){
				return name;
			}
			
			// Step 3: Public setter with validation
			public void setName(String name){
				if(name.length()>0){
			       this.name=name;
			}
		}
		
		public int getAge(){
			return age;
		}
		
		public void setAge(int age){
			if(age>0){
				this.age=age;
			}
		}
	}
		
class Main{
	public static void main(String[]args){ 
		Student s =new Student();        // Step 1: Private data
		s.setName("Kush");
		s.setAge(23);
		
		System.out.println("Name:"+s.getName());
		System.out.println("Age:"+s.getAge());
		
	}
}
	
	*/		
			