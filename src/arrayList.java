import java.util.*;

public class arrayList {

	public static <E, T> void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<T> ar=new ArrayList<T>();
		ar.add(3);
		ar.add(1234);
		ar.add(34);
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.addAll(ar);
		ar1.add(22);
		ar1.add(33);
		
		
		//System.out.println(ar1.size());
		for(int i=0;i<ar1.size();i++)
			System.out.println(ar1.get(i));
		System.out.println("Now using Iterator");
		System.out.println("************************");
		
		Iterator<Integer> itr=ar1.iterator();
				while(itr.hasNext()) {
					System.out.print(itr.next()+" ");
				}
		employee e1=new employee("chan",19,"dev");
		employee e2=new employee("manan",21,"comp");
		employee e3=new employee("ashu",17,"insta");
		employee e4=new employee("abcd",1,"new bois");
		ArrayList<employee> ar2=new ArrayList<employee>();
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		ar2.add(e4);
		Iterator<employee> itr1=ar2.iterator();		//this is generics
		//Iterator itr1=ar2.iterator();				//this is non generics
		while(itr1.hasNext()) {
			employee emp=itr1.next();
			System.out.print("Name:"+emp.name+"\tAge:"+emp.age+"\tdepartment:"+emp.dept+"\n");
			
		}
	}

}
