
public class VirtualPet {

	//private String petName;
	private int eat;
	private int sleep;
	private int fun;
	private int potty;

		public VirtualPet(int eat, int sleep, int fun, int potty) {
			this.eat = eat;
			this.sleep = sleep;
			this.fun = fun;
			this.potty = potty;
		}

		public void tick() {
			eat--;
			sleep--;
			fun--;
			potty--;
		}

		public int forEat() {
			return eat;
		}

		public int forSleep() {
			return sleep;
		}

		public int forFun() {
			return fun;
		}

		public int forPotty() {
			return potty;
		}

		public void fedPet() {
			this.eat += 3;
			this.sleep += 1;
			this.potty -= 4;
		}

		public void goPotty() {
			this.eat -= 2;
			this.fun += 2;
			this.potty += 4;
		}


		public void haveFun() {
			this.sleep -= 3;
			this.eat -= 2;
			this.fun += 4;
					
		}
		public void getSleep() {
			this.sleep += 2;
			this.potty -=2;
			this.eat += 2;
		}



	
	}


