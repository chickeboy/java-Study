package TK3;
/*使用模板方式完成以下场景，有一个玩家类 具有3个方法 开始游戏 进行游戏 结束游戏， 
其中进行游戏为抽象方法，并且玩家类还有一个具体的方法，对玩游戏的过程进行调度，
然后生成2个子类继承玩家类，比如LOLPLAYER或者DOTAPLAYER，
他们实现游戏进行的行为，最后调用测试游戏的整个过程*/

public class TK1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Play play = new DOTAPLAYER();
		play.process();
		Play play1 = new Lolplay();
		play1.process();
	}

}
