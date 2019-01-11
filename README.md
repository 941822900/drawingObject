# Drawing Object ���󻭰�
> ***To create a simple way to design a JavaFX object***
  
## ʹ��˵��
### ��ͼ
* ͼ�λ���
     * �߶Σ�  
        �򵥵��϶��Ի����߶Ρ�
     * ���ߣ�  
        ���������ߣ���ק�Ի���һ��ֱ�ߣ������������ק������ʣ���������Ƶ㣬
        �������������������������Ҽ���ֹͣ���ơ�
     * ��Բ��  
        ����ק�Ի��ƣ���סshift�Ի�����Բ��
     * ���Σ�  
        ����ק�Ի��ƣ���סshift�Ի��������Ρ�
     * ����Σ�
        �������ק������һ���ߣ�����ٻ��Ƶ������ק��ӱߣ�����Ҽ���ֹͣ���Ʋ��Զ���β������
     * ѡ��  
        ��ѡ�򵥻�ѡ��(���)��
     * �϶���  
        �Ҽ���סѡ��ͼ�ν����϶���
     * ��Ƥ��  
        �������ק��ͼ������ɲ�����
     * ɾ����  
        ѡ��Ҫɾ����һ������ͼ�Σ�����Deleteɾ�������������õ�Command Bar�м���delete��
     * ��ɫѡ������  
        ѡ����һ������ͼ�ε���ɫ������ͼ��֮��Ҳ���Խ�����ɫ�ĸ��ģ�����Ҫѡ��ͼ�Σ������������и������ԡ�
    * �ʴ���ȣ�  
        ����һ����ʵ����������һ��ͼ�εı߿��ȡ�
* ͼ�����Ը��ģ�  
     * ͨ��ѡ��ĳһ���򼸸��ڵ���ʹ�Ҳ���������ʾ���ԣ���������Ӧ��ֵʹ��ı䡣
     * Ҳ����ͨ�����õ�command bar��λ�ڽ���ĵײ���������find�����ʽ��find \[serialNumber\]��, serial number����Ѱ�ҵ�ͼ����group�е�ͼ�㣨getChildren()��list�е���������  
     e.g.  find 0�����Ӧ���Ҳ�����������ʾͼ��0�е�ͼ�����ԣ�
     * ͼ�����ͨ����command bar�м���change [fromSerialNum] [toSerialNum]  
     e.g. change 0 1 (��ͼ��0ͼ�β��뵽ͼ��1)
#### ����command bar����
 ������find �� change�⻹�� create �� delete �﷨�ֱ�Ϊ create [Type]��delete [serialNum],
 �����ǰ��ѡ��ĳ������ͼ��, ��ֱ�Ӽ���delete��ѡ��Ԫ��ȫ��ɾ��
### ����͵���
* ����  
    ������õ��ļ���ʽΪ�ı���ʽ����ֱ�����ı��༭���򿪣��������޸ģ���¼��ͼ����group�е�˳��͸���ͼ��һЩ�ؼ�����,
    �������õ�ͼ����ϱ���Ϊ�ø�ʽ���ɡ�
* ����  
    ����ͼ��ΪͼƬ��ʽ��������������png/jpg�ȸ�ʽ��
### ***��gsdl��ʽ���������JavaFX������***
* ͨ�����뱾��Ŀ��jar��������gsdl����DefaultDeserializer��  
���磺
```java
private class Test
{
    public static void main(String[] args)
    {
        Deserializer deserializer = new DefaultDeserializer(file); // file Ϊ�㱣���gsdl�ļ�
        Group group = deserializer.getObject();// ��group��Ϊ�������Ƶ�ͼ�μ���
    }
}
```
* �����÷�  
��������������ķ�ʽ���������Ƶ�ͼ�μ��뵽��ĳ���֮�У���̳�Deserializer�����࣬����add(Shape shape)����  
���磺 ���������뽫�������Ƶ�ͼ�μ��뵽���е�group֮�У���ÿ���ڵ��һ���¼�������
```java
private class Test
{
    public static void main(String[] args)
    {
        Group group = new Group();//�Ѵ��ڵ�group�������н�ͼ�μ����group
        group.getChildern().add(new Circle(200));//group���Ѿ�������һЩͼ�Σ������н����group��Ӹ���ͼ��
        Deserializer deserializer = new Deserializer(file)//fileΪ�㱣���gsdl�ļ�
        {
            @Override
            protected void add(Shape node)
            {
                group.getChildren().add(node);
                node.setOnMouseClicked(event ->//�����ÿ���¼����ͼ�ν��ᴥ�����¼������"Clicked".
                {
                    System.out.println("Clicked");
                });
            }
        };
    }
}

```
### ***��gsdl��ʽ�����JavaFX�����е���Group***
* ͬ��ͨ�����뱾��Ŀjar��������gsdl����Loader����ʵ�ֶ����ͼ�ν�������/�ټӹ�  
���磺
```java
private class Test
{
    public static void main(String[] args)
    {
        Group group = new Group();//�Ѵ��ڵ�group�������н�ͼ�μ����group
        group.getChildern().add(new Circle(200));//group���Ѿ�������һЩͼ�Σ������н����group��Ӹ���ͼ��
        Loader loader = new Loader(file);//file�����ṩ�ı������Group��gsdl�ļ�
        loader.operate(object);//object����Ҫ�����Group
    }
}

```
*Ȼ��������������û���ģ��������ղ��������gsdl�ļ���Ȼ��Ͷ����object�����������ټӹ���*
![](src/image/demo/BigWhite.png)
> ǿ���Ƽ�������gsdl�е�Test������һ�����˽�ö��󻭰��ǿ��֮����

## ����˵��  
> �ĵ���������19/01/09
* [��Ŀ�ṹ](docs/project_structure.md)
----
* [������](docs/Main.md)
* [Cursorת����](docs/ChangeCursor.md)
----
* [�����](docs/MainPane.md)
    * [Top](docs/MenuBar.md)
    * [Left](docs/ToolBar.md)
    * [Right](docs/PropertyBar.md)
    * [Bottom](docs/Cue.md)
    * [Center](docs/Board.md)
----
* [����](docs/Tool.md)
    * [ѡ��](docs/MyChooser.md)
    * [�߶�](docs/MyLine.md)
    * [��Բ](docs/MyEllipse.md)
    * [����](docs/MyRectangle.md)
    * [�����](docs/MyPolyline.md)
    * [��Ƥ](docs/MyEraser.md)
----
* [����������]()
----
* [����ͼ����������(*.gdsl)]()
    * [FXͼ��תgdsl]()
    * [gdslתFXͼ��](docs/Desrializer.md)
        * [�﷨����]()