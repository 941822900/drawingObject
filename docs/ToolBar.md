# ToolBar
[��back to catalogue](summary.md)
## ����
> ��������λ��MainPain��Left
## Field
### Tool
    private Tool myLine,myCircle,myRectangle, myPolyline,myEraser,myChooser;
    private Tool nowTool;
    private ArrayList<Tool> allTool=new ArrayList<Tool>();
> * allTool��������еĹ��� 
> * nowTool�ǵ�ǰ�Ĺ���
### Button
    private Button line,circle,rectangle,polygon,eraser,chooser;
> ����ѡ��ť
### ColorPicker
    private ColorPicker colorPicker;
    private Color nowColor;
> * colorPicker: ��ɫѡ����
> * nowColor: ��ǰ��ɫ
## DragToSuit�ڲ���
    public class DragToSuit implements EventHandler<MouseEvent>
> Ŀ����Ϊ����קToolBar�ı߿�ʱ������ЧӦ.  
> Ӧ�õ���ChangeCursor�࣬ԭ���ǵ�����ƶ����˱߿�Ӧ���������ʽ�ĸı��Ա��û�֪���˴��ǿ���ק�ġ�
## �ؼ���
    public void initBind();
> ���ڴ����߼�˳���ԭ�򣬰�ť�ȿؼ��İ�Ӧ��������Main��scene�ĳ�ʼ��֮��.
���Ե���д��һ������.
## Ordinary Method
    public Color getColor();
    public Tool getTool();
    private void add(Tool tool);
    private void switchh(Tool tool);
> ��ȡ��ǰ����ɫ/���ߣ���ӹ��ߣ��л�����.