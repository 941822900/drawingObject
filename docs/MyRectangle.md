# MyRectangle
[��back to catalogue](summary.md)
## ����
> ���ƾ���
## �෽λ����
    currentRectangle.setWidth(Math.abs(originalX - x));
    currentRectangle.setHeight(Math.abs(originalY - y));
    currentRectangle.setX(Math.min(originalX,x));
    currentRectangle.setY(Math.min(originalY, y));
> ��Ϊ��FX�У����εĿ�͸�ֻ��Ϊ����������ȡ�˾���ֵ������������
## ����shift�ɻ���������
    double x = e.getX()-pane.getWidth()/2, y = e.getY()-pane.getHeight()/2;
    if(e.isShiftDown())
    {
        double a = Math.max(Math.abs(originalX - x),Math.abs(originalY - y));
        currentRectangle.setWidth(a);
        currentRectangle.setHeight(a);
        currentRectangle.setX(x<originalX?originalX-a:originalX);
        currentRectangle.setY(y<originalY?originalY-a:originalY);
    }
## Ӧ����㵼�µĻ��Ƴ��ļ�Сͼ��
    if(currentRectangle.getWidth()<3&&currentRectangle.getHeight()<3)
    {
        pane.delete(currentRectangle);
    }
    else if(currentRectangle.getWidth()<20||currentRectangle.getHeight()<20)
    {
        AlertBox alertBox = new AlertBox("The object you draw is small, Do you still want to add it?", "Too Small", "yes", "no");
        if (alertBox.getMode() != 1)pane.delete(currentRectangle);
    }
> ��Ϊ����ģʽ����С��С. ��С��ֱ��ɾ����С��ѯ���û��Ƿ���ɾ��