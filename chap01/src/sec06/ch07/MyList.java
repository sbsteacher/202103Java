package sec06.ch07;

public interface MyList {
	void add(int val);
	void add(int idx, int val);
	int size();
	int get(int idx);
	int remove();
	int remove(int idx);
}
