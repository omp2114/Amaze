//package compiler;

public class FunctionNode implements ExpressionNode {

	public String code;
	public String return_type;
	public String Identifier;
	public FunctionNode(String function_call, String return_type){
		code = function_call;
		this.return_type = return_type;
		
	}
	public FunctionNode(String function_call, String return_type, String ID){
		code = function_call;
		this.return_type = return_type;
		Identifier = ID;
	}
	@Override
	public Object value() {
		// TODO Auto-generated method stub
		return code;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "function";
	}
	public String getReturnType(){
		return return_type;
	}

	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return code;
	}

}
