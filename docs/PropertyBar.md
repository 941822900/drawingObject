# PropertyBar
[��back to catalogue](summary.md)
## ����
> ��������λ��MainPain��Right
## Field
    private Label name;
    private ArrayList<ArrayList<Property>> objectProperty;
> * name: ��ǰѡ�е�ͼ�ε�����
> * objectProperty: ������object��ÿ��������Ԫ��һЩ��Ҫ����
## DragToSuit�ڲ���
    public class DragToSuit implements EventHandler<MouseEvent>
> Ŀ����Ϊ����קPropertyBar�ı߿�ʱ������ЧӦ.  
> Ӧ�õ���ChangeCursor�࣬ԭ���ǵ�����ƶ����˱߿�Ӧ���������ʽ�ĸı��Ա��û�֪���˴��ǿ���ק�ġ�
## �ؼ���
    public void initBind();
> ���ڴ����߼�˳���ԭ�򣬰�ť�ȿؼ��İ�Ӧ��������Main��scene�ĳ�ʼ��֮��.
���Ե���д��һ������.
## Method
    public void add(Shape shape);
    public void delete(Shape shape);
    public void clear();
    private void change(TextField value, Property property);
> * add: ��objectProperty�м���һ��ͼ�ε������б� ��Ӧ��object�����һ��ͼ��.
> * delete: ��objectProperty��ɾ��һ��ͼ�ε������б� ��Ӧ��objectɾȥһ��ͼ��.
> * clear: ���objectProperty�� ��Ӧ��object���.
> * change: ��ѡ�е�ͼ�α仯ʱ��������Ҳ���Ӧ�䶯.