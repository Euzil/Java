
public class Test //����һ��Test��
{
	public static void main(String[] args) 
	{
		Fruit fruit = new Fruit(); //����fruit����
		fruit.setName("ƻ��"); //��ʼ����ˮ�����ơ�
		fruit.setPrice(1.98f); //��ʼ����ˮ���۸�
		fruit.setWeight(5.0f); //��ʼ����ˮ��������
		PackagedFruit packagedFruit = new PackagedFruit(); //����packagedFruit����
		packagedFruit.setName("��װƻ��"); //��ʼ������װˮ�������ơ�
		packagedFruit.setPrice(2.98f); //��ʼ������װˮ���ļ۸�
		packagedFruit.setWeight(5.0f); //��ʼ������װˮ����������
		packagedFruit.setPackagesfee(((float)packagedFruit.getPrice() - (float)fruit.getPrice())); ///��ʼ������װˮ���İ�װ�ѡ�
		System.out.println("ˮ������\tˮ���۸�(Ԫ/ǧ��)\tˮ������(ǧ��)\t��װ��(Ԫ/ǧ��)\t�ܼ�"); //��ʾ��Ϣ
		System.out.println("����������������������������������������������������������������������������������������������������������������������������"); //�ָ���
		System.out.println(fruit.getName() + "\t" + fruit.getPrice() + "\t\t" + fruit.getWeight() + "\t" 
						   + "\t" + "0.0" + "\t\t" +  fruit.getPrice() * fruit.getWeight()); //������
		System.out.println(packagedFruit.getName() + "\t" + packagedFruit.getPrice() + "\t\t" + packagedFruit.getWeight()
		                   + "\t\t" + packagedFruit.getPackagesfee() + "\t\t"
				           +  packagedFruit.getPrice() * packagedFruit.getWeight()); //������
		System.out.println("����������������������������������������������������������������������������������������������������������������������������"); //�ָ���
		System.out.println("���\t\t\t\t\t\t\t"
				           + (packagedFruit.getPrice() * packagedFruit.getWeight() - fruit.getPrice() * fruit.getWeight())); //������
	}
}
