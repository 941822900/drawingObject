# MenuBar
## ����
> �˵�����λ��MainPain��Top��֧�ֵĲ��������½�/��/����/����/�˳�
## Field
### MenuItem
    private MenuItem newMenuItem = new MenuItem("New");
    private MenuItem openMenuItem = new MenuItem("Open");
    private MenuItem saveMenuItem = new MenuItem("Save");
    private MenuItem exportMenuItem = new MenuItem("Export");
    private MenuItem exitMenuItem = new MenuItem("Exit");
### Boolean
    private boolean recentSave = true;
> ����Ƿ񱣴�
## ʵ��
> ��Ҫ����ʵ�ֶ���lambda���ʽ�ķ�ʽд���˸���MenuItem��
setOnAction(EventHandler<ActionEvent event>)��