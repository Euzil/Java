
public class ListTableModel extends javax.swing.table.DefaultTableModel {// ��������ʵ�ֱ��ģ�ͽӿڵ���
	
	Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class };// ��ͷ��������
	
	boolean[] canEdit = new boolean[] { false, false, false };// ��ͷ���ɱ༭

	public ListTableModel() {// ���ģ���еı�ͷ
		super(new Object[][] {}, new String[] { "���ݱ��", "��������", "����Ա" });
	}

	public Class getColumnClass(int columnIndex) {// ��ñ�ͷ��������
		return types[columnIndex];
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {// ��ͷ�Ƿ�ɱ༭
		return canEdit[columnIndex];
	}
	
}
