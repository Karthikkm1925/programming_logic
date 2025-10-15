package exception.handling;
public class InavalidEntry extends Exception{
		public InavalidEntry(String msg) {
			 super(msg);
		}
		public InavalidEntry() {
		}
		public void CheckAge(int age) {
			try {
				if(age>=18) {
					System.out.println("You can Vote");
				}else {
					throw new InavalidEntry("Your not adult");
				}
			}catch(InavalidEntry e) {
				System.out.println("Grow up adult");
				//e.printStackTrace();
			}catch(Exception e) {
				System.out.println("It's Catch block");
				//e.printStackTrace();
			}
		}
}
