
public class Demo {
public static void main(String[] args) {
	int pp=9;
	int qq=9;
	int rr=4;
	qq=rr+pp;
	if((pp-qq)>(qq+pp)||6>qq) {
	  qq=(rr+1)&pp;
	}
	pp=rr+pp;
	if((qq-7)<(7+qq)) {
		pp=6+rr;
	}
	System.out.println(pp+qq+rr);
}
}
