package dierci;
import java.util.Scanner;
class xueSheng{
	String name;
	double chengji;
	
	void student(String a,double t) {
		this.name=a;
		this.chengji=t;
	}//����
	
	static xueSheng[] inputstudent(int n){
		Scanner scan =new Scanner(System.in);
		xueSheng[] x=new xueSheng[n+1];
		System.out.println("���Դ����������ͳɼ���");
		for(int i=1;i<=n;i++) {	
			System.out.println("�����"+i+"���˵� ����");
			String a=scan.next();
			System.out.println("�����"+i+"���˵ĳɼ�");
			double t=scan.nextDouble();
			x[i].student(a, t);
		}
		scan.close();
		return x;
	}//����

	public void sort(int n,xueSheng v[]){
		xueSheng t;
		for(int i=1;i<=n;i++){
			for(int j=i+1;j<=n;j++)
			if(v[i].chengji<v[j].chengji)
				{t=v[i];v[i]=v[j];v[j]=t;}
		}
	}//����
	
	void pt(){
		System.out.println("ѧ�������� "+name);
		System.out.println("ѧ������ɼ��� "+chengji);
	}//��ӡ��Ϣ
}

class zhiGong{
	String name;
	double year;
	void gongRen(String a,double t) {
		this.name=a;
		this.year=t;
	}//����
static	zhiGong[] inputgongren(int n){
		Scanner scan =new Scanner(System.in);
		zhiGong[]z=new zhiGong[n+1];
		
		for(int j=1;j<n+1;j++) {
			System.out.println("�����"+j+"���˵� ����");
			String a=scan.nextLine();
			System.out.println("�����"+j+"���˵� ��������");
			double t=scan.nextDouble();
			z[j].gongRen(a, t);
		}
		scan.close();
	   return z;
	}//����
	public void sort(int n,zhiGong v[])
	{
		zhiGong t;
		for(int i=1;i<=n;i++)
		{
			for(int j=i+1;j<=n;j++)
			if(v[i].year<v[j].year)
				{t=v[i];v[i]=v[j];v[j]=t;}
		}
	}//����
	void pt()
	{
		System.out.println("ѧ�������� "+name);
		System.out.println("ѧ������ɼ��� "+year);
	}//��ӡ��Ϣ
}

public class ��Ŀ1 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String a=scan.next();
		if(a.equals("ѧ��")) {
			System.out.println("������Ҫ�����������");
			int n;
			n=scan.nextInt();
			xueSheng[] x=new xueSheng[n+1];
			x=xueSheng.inputstudent(n);
			xueSheng q=new xueSheng();
			q.sort(n,x);
			for (int i=1;i<=n;i++){		
				x[i].pt();
				System.out.println("");}
}
		else if(a.equals("ְ��")) {
			System.out.println("������Ҫ�����������");
			int n=scan.nextInt();
			zhiGong[] x=new zhiGong[n+1];
			x=zhiGong.inputgongren(n);
			zhiGong q=new zhiGong();
			q.sort(n, x);
			for (int i=1;i<=n;i++){		
				x[i].pt();
				System.out.println("");
	}
}
		else 
			System.out.println("��������");
	scan.close();
	}
}