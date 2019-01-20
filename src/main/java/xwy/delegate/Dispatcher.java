package xwy.delegate;

public class Dispatcher implements IExerctor {

	// 项目经理，虽然也有执行方法，但是他的工作职责是不一样的

	IExerctor exerctor;

	public Dispatcher(IExerctor exerctor) {
		this.exerctor = exerctor;
	}

	@Override
	public void doing() {
		this.exerctor.doing();
	}

}
