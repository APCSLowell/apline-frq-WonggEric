public class APLine
{
  /* your code here */
  private int myA,myB,myC;
  private boolean onLine;
  public APLine(int a,int b, int c){
    myA = a;
    myB = b;
    myC = c;
    onLine = false;
  }
  public double getSlope(){
    return -(double)myA/myB;
  }

  public boolean isOnLine(int x, int y){
    if((myA*x+myB*y+myC)==0)
      onLine = true;
    else
      onLine = false;

    return onLine;
  }
}
