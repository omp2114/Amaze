//package compiler;

public class LessEqlNode implements ExpressionNode {
	ExpressionNode node1;
	ExpressionNode node2;
	Object value;
	Object code;


public LessEqlNode(Object x , Object y){
	boolean rvalue = (Integer)x <= (Integer)y;
	value = rvalue;
	code = rvalue;
}
@Override
public Object value() {
	// TODO Auto-generated method stub
	
	return value;
}
public String getType(){
	return "boolean";
}
@Override
public String getCode() {
	// TODO Auto-generated method stub
	return String.valueOf(code);
}
@Override
public String getReturnType() {
	// TODO Auto-generated method stub
	return "boolean";
}

}
