# Board
[��back to catalogue](summary.md)
## ����
> ������/��ͼ��, λ��MainPain��Center.
## object
    private Group object;
> drawingObject��Object, ���л��Ƶ�ͼ�ζ��ᱻ���뵽���Group���͵�object��.
## GetPos�ڲ���
    class GetPos implements EventHandler<MouseEvent>
> Ϊ�˴��������ǰ�����뵽object��, ��ȡ�����object�е����λ��.
## ��ͼ
    public void press(MouseEvent e);
    public void drag(MouseEvent e);
    public void release(MouseEvent e);
> press-drag-release��ͼ����,������Ƶ����ݵĽ��ɵ�ǰʹ�õ�Tool������, ����
ToolBar��getTool��ȡ��ǰʹ�õ�Tool.
## Ordinary Method
    public void load(Shape node);
    public void add(Shape node);
    public void delete(Shape node);
    public void clear();
* load: ��object����һ��ͼ��, ���ͼ�����һЩ�󶨵�
* add: ��object����һ��ͼ��, �����Ҫ��������
* delete: ɾ��object�е�һ��ͼ��
* clear: ���object