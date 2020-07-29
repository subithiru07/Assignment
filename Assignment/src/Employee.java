
public class Employee {
	
		private int EmpId;
		public Employee(int empId, String empName, String deg, double basic, double hRA) {
			super();
			EmpId = empId;
			EmpName = empName;
			Deg = deg;
			Basic = basic;
			HRA = hRA;
		}
		private String EmpName;
		private String Deg;
		private double Basic;
		private	double HRA;
		
		@Override
		public String toString() {
			return "enpolyee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", Deg=" + Deg + ", Basic=" + Basic + ", HRA="
					+ HRA + "]";
		}

		
		public int getEmpId() {
			return EmpId;
		}
		public void setEmpId(int empId) {
			EmpId = empId;
		}
		public String getEmpName() {
			return EmpName;
		}
		public void setEmpName(String empName) {
			EmpName = empName;
		}
		public String getDeg() {
			return Deg;
		}
		public void setDeg(String deg) {
			Deg = deg;
		}
		public double getBasic() {
			return Basic;
		}
		public void setBasic(double basic) {
			Basic = basic;
		}
		public double getHRA() {
			return HRA;
		}
		public void setHRA(double hRA) {
			HRA = hRA;
		}
		
		
		
}

