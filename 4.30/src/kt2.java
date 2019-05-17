
public class kt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
class Solider{
	AbstractGun gun = new  MachineGun();
	AbstractGun gun2 = new Rifle();
	AbstractGun gun3 = new HandGun();
	void setGun(AbstractGun gun) {
		
	}
	void killEnemy() {
		
	}
}
abstract class AbstractGun{
	abstract void Shoot();
}
class MachineGun extends AbstractGun{

	@Override
	void Shoot() {
		// TODO Auto-generated method stub
		
	}
	
}
class Rifle extends AbstractGun{

	@Override
	void Shoot() {
		// TODO Auto-generated method stub
		
	}
	
}
class HandGun extends AbstractGun{

	@Override
	void Shoot() {
		// TODO Auto-generated method stub
		
	}
	
}