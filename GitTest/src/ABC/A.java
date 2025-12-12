package ABC;

public class A {
	public static int larger(int a, int b) {
		if (a > b) // 노드1
			return a; // 노드2
		else
			return b; // 노드3
	} // 노드4

	public static int abs(int a) {
		if (a >= 0)
			return a;
		else
			return -a;
	}
}
