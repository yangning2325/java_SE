package danlimoshi;

public class Lantext {

	public static void main(String[] args) {
        //通过new实例化会报错
//      Lanhan g = new GiantDragon();
         
        //只能通过getInstance得到对象
         
		Lanhan g1 = Lanhan.getInstance();
		Lanhan g2 = Lanhan.getInstance();
		Lanhan g3 = Lanhan.getInstance();
         
        //都是同一个对象
        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }
	}


