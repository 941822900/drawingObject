# MyEllipse
[��back to catalogue](summary.md)
## ����
> ������Բ
## �෽λ����
    currentEllipse.setRadiusX(Math.abs(e.getX()-leftx)/2);
    currentEllipse.setRadiusY(Math.abs(e.getY()-lefty)/2);
    currentEllipse.setCenterX((e.getX()+leftx)/2-pane.getWidth()/2);
    currentEllipse.setCenterY((e.getY()+lefty)/2-pane.getHeight()/2);
> ��Ϊ��FX�У���Բ�ĳ���Ͷ���ֻ��Ϊ����������ȡ�˾���ֵ
## ����shift�ɻ�����Բ
    if(e.isShiftDown())
    {
        currentEllipse.setRadiusX(Math.max(Math.abs(e.getX()-leftx)/2,Math.abs(e.getY()-lefty)/2));
        currentEllipse.setRadiusY(Math.max(Math.abs(e.getX()-leftx)/2,Math.abs(e.getY()-lefty)/2));
    }       
    currentEllipse.setCenterX((e.getX()+leftx)/2-pane.getWidth()/2);
    currentEllipse.setCenterY((e.getY()+lefty)/2-pane.getHeight()/2);
## Ӧ����㵼�µĻ��Ƴ��ļ�Сͼ��
    if(currentEllipse.getRadiusX()<1&&currentEllipse.getRadiusY()<1)
    {
        pane.delete(currentEllipse);
    }
    else if(currentEllipse.getRadiusX()<20||currentEllipse.getRadiusY()<20)
    {
        AlertBox alertBox = new AlertBox("The object you draw is small, Do you still want to add it?", "Too Small", "yes", "no");
        if (alertBox.getMode() != 1)pane.delete(currentEllipse);
    }
> ��Ϊ����ģʽ����С��С. ��С��ֱ��ɾ����С��ѯ���û��Ƿ���ɾ��