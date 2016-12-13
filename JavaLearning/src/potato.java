public enum potato {
	fried("awesome", "20"),
	mashed("yummy", "10"),
	baked("tasty", "450"),
	skinned("delish", "400"),
	roasted("amazing", "15"),
	country("yup", "13");
	
	private final String desc;
	private final String amount;
	
	potato(String description, String quantity){
		desc = description;
		amount = quantity;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getQuantity(){
		return amount;
	}
	
}
