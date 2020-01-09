import edu.wpi.first.networktables.*;

public class Vision {

	private static NetworkTable table;
	private static NetworkTableEntry entry[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
	}
	
	
	public static void init() {
		NetworkTableInstance inst = NetworkTableInstance.getDefault();
		table = inst.getTable("rPi");
		entry[0] = table.getEntry("0");
	}

}
