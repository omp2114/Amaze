//package compiler;

public class DivNode implements ExpressionNode {
	ExpressionNode node1;
	ExpressionNode node2;
	Object value;
	Object code;


public DivNode(Object x , Object y){
	int rvalue = (Integer)x / (Integer)y;
	value = rvalue;
	code = rvalue;
}
@Override
public Object value() {
	// TODO Auto-generated method stub
	
	return value;
}
public String getType(){
	return "int";
}
@Override
public String getCode() {
	// TODO Auto-generated method stub
	return String.valueOf(code);
}
@Override
public String getReturnType() {
	// TODO Auto-generated method stub
	return "int";
}


}
