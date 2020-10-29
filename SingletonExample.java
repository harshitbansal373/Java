
public class SingletonExample {


		public static void main(String[] args) {
			String strCompare = " This is the value of my local String variable and it will be the same as the toString of the Singleton,";
			
			MySingleton singletonVariable1 = MySingleton.getSingleInstance();
			System.out.println(singletonVariable1.toString() +" which has hashcode: "+ singletonVariable1.hashCode());
			
			MySingleton singletonVariable2 = MySingleton.getSingleInstance(); //trying to get another instance, but there is only one
			System.out.println("I tried to get another instance and assign it to singletonVariable2, but you can see the hashcode is the same: "+ singletonVariable2.hashCode());
			
			if (singletonVariable2.toString().equals(strCompare)){
				System.out.print("The value is the same when I compare with toString().equals,");
				if (singletonVariable2.toString() == strCompare){
					System.out.println(" but it is not the same object when I compared using '==', \nbecause my local String's hashcode is : " + strCompare.hashCode());
				}
			}
			
		}

	}

	class MySingleton {
		
		private static volatile MySingleton mySingleton; 
		
		public String str = " This is the value of my local String variable and it will be the same as the toString of the Singleton,";
		
		private MySingleton() {  
			
		}
		
		public static MySingleton getSingleInstance() {
			
			//double-checked locking
			if (null == mySingleton) {
				synchronized (MySingleton.class) {
					if (null == mySingleton){
						mySingleton = new MySingleton();
					}
				}
				 
			}
			
			return mySingleton;
		}

		@Override
		public String toString() {
			return str;
		}
		
		
	}