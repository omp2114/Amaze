//package compiler;

public class ValueNode implements ExpressionNode {
	ExpressionNode node1;
	Object value;
	String type;

public ValueNode(Object x ,String y){
	value = x;
	type= y;
}
@Override
public Object value() {
	// TODO Auto-generated method stub
	
	return value;
}
public String getType(){
	return type;
}
@Override
public String getCode() {
	// TODO Auto-generated method stub
	return String.valueOf(value);
}
@Override
public String getReturnType() {
	// TODO Auto-generated method stub
	return type;
}

}
