package ex19thread;

class SumMulti
{
	int num;

	public SumMulti()
	{
		num = 0;
	}

	public void addNum(int n)
	{
		num += n;
	}

	public int getNum()
	{
		return num;
	}

}

class MultiAdderThread extends Thread
{
	SumMulti sumInst;
	int start, end;

	public MultiAdderThread(SumMulti sum, int s, int e)
	{
		sumInst = sum;
		start = s;
		end = e;
	}

	public void run()
	{
		for (int i = start; i <= end; i++)
		{
			sumInst.addNum(i);
		}
	}
}

public class Ex05Sync1Error
{
	public static void main(String[] args)
	{
		
		//  이렇게 되면 각각의 쓰레드가 제멋대로 들어오게 되고 그렇게 되면 하나의 힙값이 섞여 버릴수 있기때문에 정확한 합이 나올수가없다. 
		SumMulti s = new SumMulti();
		MultiAdderThread mat1 = new MultiAdderThread(s, 1, 5000);
		MultiAdderThread mat2 = new MultiAdderThread(s, 5001, 10000);
//		mat1.start();
//		mat2.start();

		mat1.run();
		mat2.run();
		
		try {
			mat1.join();  //  조인을 통해서 정확한 방법으로 
			mat2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~10000까지의 합:" + s.getNum());
	}
}
