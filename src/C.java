/*Assume that class A extends class B,
 which extends class C. Also all the three classes  implement the method test().
 How can a method in a class A invoke the test() method  defined in class C (without creating a new instance of class C) */
/*  declaration of class*/
class C {
	/* method declaration */
	public void test() {

		System.out.println("A"); // output
	}
}
