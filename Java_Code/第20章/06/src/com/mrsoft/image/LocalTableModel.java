
public class LocalTableModel extends javax.swing.table.DefaultTableModel {// 创建用来实现表格模型接口的类
	
	Class[] types = new Class[] { java.lang.String.class, java.lang.String.class };// 表头的类类型
	
	boolean[] canEdit = new boolean[] { false, false };// 表头不可编辑

	public LocalTableModel() {// 表格模型中的表头
		super(new Object[][] {}, new String[] { "用户ID", "用户头像" });
	}

	public Class getColumnClass(int columnIndex) {// 获得表头的类类型
		return types[columnIndex];
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {// 表头是否可编辑
		return canEdit[columnIndex];
	}
	
}
