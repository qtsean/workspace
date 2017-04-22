package notebook;

import java.util.ArrayList;

public class Notebook {
	private ArrayList<String> notes = new ArrayList<String>();
	public void add(String s, int location)
	{
		notes.add(location, s);
	}
	public void add(String s)
	{
		notes.add(s);
		
	}
	public int GetSize()
	{
		return notes.size();
	}
 String GetNote(int index)
	{
	 	return notes.get(index);
	}
 public void RemoveNote(int index)
	 {
		 notes.remove(index);
	 }
 public String[] list()
 	{
	 	String[] a = new String[notes.size()];
//	 	for(int i=0; i<notes.size(); i++)
//	 	{
//	 		a[i] = notes.get(i);
//	 	}
	 	notes.toArray(a);
	 	return a;
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notebook nb = new Notebook();
		nb.add("one");
		nb.add("two");
		nb.add("three");
		nb.add("four", 0);
		System.out.println(nb.GetSize());
		nb.RemoveNote(1);
		System.out.println(nb.GetSize());
		String[] a = nb.list();
		for(String s:a)
		{
			System.out.println(s);
		}
	}

}
