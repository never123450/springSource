package xwy.delegate;

public class DispatherTest {

	public static void main(String[] args) {
		Dispatcher dispatcher = new Dispatcher(new ExecuterA());
		
		//看上去好像是我们的项目经理在干活，实际上干活的是普通工人
		//这就是典型的，干活是我在干，功劳是你的
		dispatcher.doing();
	}
}
