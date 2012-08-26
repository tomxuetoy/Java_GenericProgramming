/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/* the original code is from link: http://edu.qudong.com/safe/base/Javascript/shilidaima/20080514/12527.html */

package gendemo;

/**
 *
 * @author tomxue
 */

public class GenDemo {

	public static class Gen<T> {

		private T ob; //定义泛型成员变量

		public Gen(T ob) {
			this.ob = ob;
		}

		public T getOb() {
			return ob;
		}

		public void setOb(T ob) {
			this.ob = ob;
		}

		public void showType() {
			System.out.println("T的实际类型是: " + ob.getClass().getName());
		}
	}

	public static void main(String[] args) {
		//定义泛型类Gen的一个Integer版本
		Gen<Integer> intOb = new Gen<Integer>(88);
		intOb.showType();
		int i = intOb.getOb();
		System.out.println("value= " + i);

		System.out.println("----------------------------------");

		//定义泛型类Gen的一个String版本
		Gen<String> strOb = new Gen<String>("Hello Gen!");
		strOb.showType();
		String s = strOb.getOb();
		System.out.println("value= " + s);
	}
}
