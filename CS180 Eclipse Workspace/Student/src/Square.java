
public class Square extends Rectangle {
	
	public Square(int side){
		super(side, side);
	}
	public int getSide(){
		return getLength();
	}
	public void setSide(int theSide){
		super.setLength(theSide);
		super.setWidth(theSide);
	}
	/*
	 * Now there is a problem, because Square objects independently can respond to setLength(...)
	 * and hence put an object into inconsistent state
	 */
	public void setLength(int l){
		setSide(l);
	}
	@Override
	public void setWidth(int w){
		//setSide(w);
		throw new UnsupportedOperationException("Cannot set width. Use setSide");
	}
}
