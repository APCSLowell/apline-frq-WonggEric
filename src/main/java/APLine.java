public class APLine
{
  /* your code here */
  private int myA,myB,mcC;
  private boolean isOnLine;
  public APLine(int a,int b, int c){
    myA = a;
    myB = b;
    myC = c;
    isOnLine = false;
  }
  public double getSlope(){
    return -(double)myA/myB;
  }

  public boolean isOnline(int x, int y){
    if((myA(x)+myB(y)+myC)==0)
      isOnLine = true;
    else
      isOnLine = false;
  }
}
