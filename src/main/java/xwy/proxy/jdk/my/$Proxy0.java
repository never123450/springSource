package xwy.proxy.jdk.my;

import java.lang.reflect.Method;

public final class $Proxy0 implements xwy.proxy.jdk.Person {
	XwyInvocationHandler h;

	public $Proxy0(XwyInvocationHandler h) {
		this.h = h;
	}

	public java.lang.String getName() throws Throwable {
		Method m = null;
		try {
			m = xwy.proxy.jdk.Person.class.getMethod("getName", new Class[] {});
			return (String) this.h.invoke(this, m, null);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void findLove() throws Throwable {
		Method m = null;
		try {
			m = xwy.proxy.jdk.Person.class.getMethod("findLove", new Class[] {});
			this.h.invoke(this, m, null);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public java.lang.String getSex() throws Throwable {
		Method m = null;
		try {
			m = xwy.proxy.jdk.Person.class.getMethod("getSex", new Class[] {});
			return (String) this.h.invoke(this, m, null);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}