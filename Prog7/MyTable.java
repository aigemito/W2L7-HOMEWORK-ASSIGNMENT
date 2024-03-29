package Prog8;

public class MyTable {
	Entry[] entries = new Entry[26];
	
	public void add(char c, String s){
		int index = computeIndex(c);
		entries[index] = new Entry(c,s);
	}
	public String get(char c){
		Entry e = entries[computeIndex(c)];
		return e.s;
	}
	private int computeIndex(char c){
		return (int)c - 97;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 26; ++i){
			if(entries[i] != null) {
				
				sb.append(entries[i].toString());
				sb.append(System.getProperty("line.separator"));
			}
		}
		return sb.toString();
	}
	

	public static void main(String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		System.out.println(t.get('b'));
		System.out.println(t);
		
	}
	class Entry {
		
		char c;
		String s;

		Entry(char c, String s){
			this.c = c;
			this.s = s;
		}
		public String toString(){
			return(""+c+"->"+s);
		}
		
		
	}
	

}
